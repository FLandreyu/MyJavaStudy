package com.HomeWork;

// 自定义异常类
class MyException extends Exception {
    public MyException(String message) {
        super(message);  // 调用父类构造方法传递异常提示信息
    }
}

// 测试类
public class TestMyEx {
    private int x;  // 除数私有成员变量

    // 设置除数的方法
    public void setX(int x) {
        this.x = x;
    }

    // 当除数为13或4时抛出异常，否则输出商
    public void f1() throws MyException {
        if (x == 13 || x == 4) {
            throw new MyException("自定义异常：除数不能为 " + x + "，100除以该数不允许！");
        } else {
            System.out.println("100 / " + x + " = " + (100 / x));
        }
    }

    // 主方法测试
    public static void main(String[] args) {
        TestMyEx test = new TestMyEx();
        
        // 测试异常情况：除数为13
        test.setX(13);
        try {
            test.f1();
        } catch (MyException e) {
            System.out.println(e.getMessage());  // 显示异常提示信息
        }
        
        // 测试正常情况：除数为5
        test.setX(5);
        try {
            test.f1();  // 输出商值
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
