package com.HomeWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentTable {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            // 1. 注册数据库驱动（以MySQL为例）
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 获得连接对象
            String url =
                    "jdbc:mysql://localhost:3306/test_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
            String user = "root";
            String password = "abc123321";
            connection = DriverManager.getConnection(url, user, password);

            // 3. 获得Statement对象
            statement = connection.createStatement();

            // 4. 定义要执行的创表语句（学生表：id, 姓名, 性别）
            String createTableSQL =
                    "CREATE TABLE IF NOT EXISTS student (" + "id INT PRIMARY KEY AUTO_INCREMENT, "
                            + "name VARCHAR(20) NOT NULL, " + "gender CHAR(1) NOT NULL" + ")";

            // 5. 调用Statement对象的方法执行SQL语句
            statement.execute(createTableSQL);
            System.out.println("学生表创建成功！");

        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动未找到，请检查驱动依赖。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("数据库操作异常，请检查连接信息或SQL语句。");
            e.printStackTrace();
        } finally {
            // 6. 释放资源（先开后关）
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
