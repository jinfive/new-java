package org.example.Day19.디자인패턴;


import java.sql.Connection;

public class DatabaseConnection {
    private static Connection connection;

    public DatabaseConnection() {
        System.out.println("데이터베이스 연결 객체 생성");
    }

    public static Connection getConnection() {
        if (connection == null) {
            connection = DatabaseConnection.getConnection();
        }
        return connection;
    }
}
