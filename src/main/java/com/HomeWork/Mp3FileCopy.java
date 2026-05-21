package com.HomeWork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mp3FileCopy {
    public static void main(String[] args) {
        File sourceFile = new File("d:/歌曲.mp3");
        File targetFile = new File("e:/歌曲.mp3");
        if (!new File("e:/").exists()) {
            targetFile = new File("d:/歌曲_副本.mp3");
            System.out.println("未检测到 E 盘，目标改为：" + targetFile.getPath());
        }

        try {
            // 1) 判断源文件是否存在
            if (!sourceFile.exists()) {
                File sourceDir = sourceFile.getParentFile();
                if (sourceDir != null) {
                    sourceDir.mkdirs();
                }
                // 2) 若不存在则创建该文件
                if (sourceFile.createNewFile()) {
                    System.out.println("源文件不存在，已创建：d:/歌曲.mp3");
                } else {
                    System.out.println("源文件创建失败！");
                    return;
                }
            } else {
                System.out.println("源文件已存在，无需创建。");
            }

            // 确保目标盘符/目录存在
            File targetDir = targetFile.getParentFile();
            if (targetDir != null && !targetDir.exists()) {
                if (!targetDir.mkdirs() && !targetDir.exists()) {
                    System.out.println("目标路径不可用，请确认 E 盘存在或修改目标路径。");
                    return;
                }
            }

            // 使用字节缓冲流进行文件复制
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
                    BufferedOutputStream bos =
                            new BufferedOutputStream(new FileOutputStream(targetFile))) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }
                System.out.println("文件复制完成：" + targetFile.getPath());
            }
        } catch (IOException e) {
            System.out.println("文件操作过程中发生异常：");
            e.printStackTrace();
        }
    }
}
