package com.company.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

public class AbstractDAO {
    
    public Connection connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/javanew_database?autoReconnect=true&useSSL=false";
        String username = "root";
        String password="Anarmysql2020";
        
        Connection connection = DriverManager.getConnection(url,username,password);
        
        return connection;
    }
}
