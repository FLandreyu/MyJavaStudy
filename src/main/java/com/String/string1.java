package com.String;

import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {


        String rightUserName = "Sunyongjie";
        String rightPassword = "123456";

        for(int i=0; i<3; i++){ 
            System.out.println("请输入用户名：");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if (rightUserName.equals(name) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败");
                
                if (!rightUserName.equals(name)) {
                    System.out.println("用户名错误");
                } else if (!rightPassword.equals(password)) {
                    System.out.println("密码错误");
                }
                if(i == 3){
                    System.out.println("登录失败次数过多，账户已锁定");
                }else {
                    System.out.println("请重新输入用户名和密码,你还剩下" + (3 - i) + "次机会");
                }
            }
            sc.close();
        }
    }
}
