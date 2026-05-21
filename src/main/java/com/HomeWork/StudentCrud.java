package com.HomeWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 作业2：在学生表上完成 CRUD 操作（基于作业1的 student 表）。
 */
public class StudentCrud {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url =
                    "jdbc:mysql://localhost:3306/test_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
            String user = "root";
            String password = "abc123321";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            // Create：添加 3 条记录（主键自增，只指定姓名、性别）
            statement.executeUpdate("INSERT INTO student (name, gender) VALUES ('张三', '男')");
            statement.executeUpdate("INSERT INTO student (name, gender) VALUES ('李四', '女')");
            statement.executeUpdate("INSERT INTO student (name, gender) VALUES ('王五', '男')");
            System.out.println("已添加 3 条学生记录。");

            // Update：将 id 为 2 的用户姓名更新为「新用户」
            int updated = statement.executeUpdate("UPDATE student SET name = '新用户' WHERE id = 2");
            System.out.println("已将 id=2 的姓名更新为「新用户」，影响行数：" + updated);

            // Delete：删除 id 为 1 的用户
            int deleted = statement.executeUpdate("DELETE FROM student WHERE id = 1");
            System.out.println("已删除 id=1 的用户，影响行数：" + deleted);

            // Read：查询所有学员信息并输出到控制台
            resultSet = statement.executeQuery("SELECT id, name, gender FROM student ORDER BY id");
            System.out.println("----- 所有学员信息 -----");
            System.out.printf("%-6s %-12s %-6s%n", "id", "姓名", "性别");
            int count = 0;
            while (resultSet.next()) {
                count++;
                System.out.printf(
                        "%-6d %-12s %-6s%n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("gender"));
            }
            System.out.println("共 " + count + " 条记录。");

        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动未找到，请检查驱动依赖。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("数据库操作异常，请检查连接信息或 SQL 语句。");
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
