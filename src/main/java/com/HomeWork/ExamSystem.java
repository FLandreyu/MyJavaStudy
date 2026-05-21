package com.HomeWork;

import java.io.*;
import java.util.Scanner;

public class ExamSystem {
    public static void main(String[] args) {
        // 标准答案字符串（根据题目常识设定）
        String correctAnswers = "ACDD";
        // 存储用户答案
        StringBuilder userAnswers = new StringBuilder();
        
        // 使用 try-with-resources 自动关闭资源
        try (BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
             Scanner scanner = new Scanner(System.in)) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                // 如果读到以"*"开头的行，表示分隔符，暂停并提示用户输入
                if (line.startsWith("*")) {
                    System.out.print("输入选择的答案（A、B、C、D）：");
                    String input = scanner.nextLine().trim().toUpperCase();
                    // 只取第一个有效字符作为答案
                    if (!input.isEmpty()) {
                        userAnswers.append(input.charAt(0));
                    }
                } else {
                    // 否则直接输出题目行
                    System.out.println(line);
                }
            }
            
            // 比对答案并计算得分
            int score = 0;
            int total = correctAnswers.length();
            String userAns = userAnswers.toString();
            
            for (int i = 0; i < total && i < userAns.length(); i++) {
                if (userAns.charAt(i) == correctAnswers.charAt(i)) {
                    score++;
                }
            }
            
            System.out.println("\n考试结束！");
            System.out.println("你的答案：" + userAns);
            System.out.println("标准答案：" + correctAnswers);
            System.out.println("得分：" + score + "/" + total);
            
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到异常：试题文件 a.txt 不存在！");
        } catch (IOException e) {
            System.out.println("IO异常：读取文件时发生错误！");
            e.printStackTrace();
        }
    }
}
