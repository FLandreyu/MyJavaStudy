package com.Work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mp3FileCopy {
    public static void main(String[] args) {
        // 定义源文件与目标文件路径
        String sourcePath = "d:/歌曲.mp3";
        String targetPath = "e:/歌曲.mp3";

        File sourceFile = new File(sourcePath);

        // 1) 判断文件是否存在
        if (!sourceFile.exists()) {
            try {
                // 2) 若不存在则创建文件（创建空文件，实际应用可写入示例内容）
                boolean created = sourceFile.createNewFile();
                if (created) {
                    System.out.println("源文件创建成功：" + sourcePath);
                } else {
                    System.out.println("源文件创建失败！");
                    return;
                }
            } catch (IOException e) {
                System.err.println("创建文件时出错：" + e.getMessage());
                return;
            }
        } else {
            System.out.println("源文件已存在，跳过创建步骤。");
        }

        // 使用文件字节流 + 缓冲流实现复制（先读后写）
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream bos =
                        new BufferedOutputStream(new FileOutputStream(targetPath))) {

            byte[] buffer = new byte[4096]; // 4KB 缓冲区
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("文件复制完成：" + targetPath);

        } catch (IOException e) {
            System.err.println("文件复制过程中出错：" + e.getMessage());
        }
    }
}
