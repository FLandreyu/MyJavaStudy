package com.HomeWork;

public class BankCallSystem {
    // 共享锁对象
    private static final Object lock = new Object();
    // VIP是否全部完成标志
    private static volatile boolean vipFinished = false;

    // 普通号线程任务
    static class NormalTask implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 100; i++) {
                    // 模拟服务普通号客户
                    System.out.println("叫普通号：" + i);
                    Thread.sleep(100); // 普通号服务时间100ms

                    // 当普通号叫完第20号时，需要等待VIP全部完成
                    if (i == 20) {
                        synchronized (lock) {
                            System.out.println("普通号已完成前20个，等待VIP全部叫完...");
                            while (!vipFinished) {
                                lock.wait();
                            }
                            System.out.println("VIP已全部服务完毕，继续叫普通号...");
                        }
                    }
                }
                System.out.println("所有普通号已叫完。");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // VIP号线程任务
    static class VipTask implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 20; i++) {
                    // 模拟服务VIP号客户（时间是普通的2倍）
                    System.out.println("叫VIP号：" + i);
                    Thread.sleep(200); // VIP号服务时间200ms
                }
                // VIP全部完成，通知普通号线程
                synchronized (lock) {
                    vipFinished = true;
                    System.out.println("VIP号全部叫完，通知普通号线程。");
                    lock.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        // 创建线程
        Thread normalThread = new Thread(new NormalTask(), "NormalThread");
        Thread vipThread = new Thread(new VipTask(), "VipThread");

        // 设置VIP线程优先级更高，体现“叫到VIP号的概率比普通号更高”
        normalThread.setPriority(Thread.NORM_PRIORITY);
        vipThread.setPriority(Thread.MAX_PRIORITY);

        // 启动两个线程，开始并行叫号
        normalThread.start();
        vipThread.start();
    }
}
