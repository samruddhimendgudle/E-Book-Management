package com.ajpemail; 
//dbe practical 7

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlCon {

    public static void main(String[] args) {

        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sveri", "root", "root");

            
            Statement st = con.createStatement();

           
            String query = "select * from Student";

          
            ResultSet rs = st.executeQuery(query);

           
            while (rs.next()) {
                
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            
            con.close();

        } catch (SQLException e) {
           
            System.out.println("SQL Error: " + e.getMessage());
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
