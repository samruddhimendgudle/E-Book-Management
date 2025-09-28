package com.ajpproject;

import java.sql.Connection ;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement ;
import java.util.ArrayList;

//import javax.swing.table.DefaultTableModel;

public class DBconnection {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql:///ajp";
    private static String user = "root";
    
    
    Connection con = null;
    Statement st = null;
    ResultSet re = null;
    int recordCount = 0;
    
    public int connectivity(ArrayList<String> al){
     String INSERT_QUERY = "insert into userdetails values(null,?,?,?,?,?,?,?,?)";
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, "root");
            
            PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
            if(ps!=null) {
            	ps.setString(1,al.get(0));
            	ps.setString(2,al.get(1));
            	ps.setString(3,al.get(2));
            	ps.setString(4,al.get(3));
            	ps.setString(5,al.get(4));
            	ps.setString(6,al.get(5));
            	ps.setString(7,al.get(6));
            	ps.setString(8,al.get(7));
            }
            recordCount = ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return recordCount;
    }

public ResultSet logindata(String username, String confirmPassword1) {
	String SELECT_QUERY = "SELECT * FROM `userdetails` where `email` = '"+username+"' and `confirmPassword`= '"+confirmPassword1+"'";
	try {
		//Class.forName(driver);
        con = DriverManager.getConnection(url, user, "root");
		st = con.createStatement();
		re = st.executeQuery(SELECT_QUERY);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return re;	
}
	public int bookingdetails(ArrayList al){
		int recordcount=0;
	     String INSERT_QUERY = "insert into booking values(null,?,?,?,?,?,?)";
	        
	        try {
	            Class.forName(driver);
	            con = DriverManager.getConnection(url, user, "root");
	            
	            PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
	            if(ps!=null) {
	            	ps.setString(1,(String)al.get(0));
	            	ps.setString(2,(String)al.get(1));
	            	ps.setString(3,(String)al.get(2));
	            	ps.setString(4,(String)al.get(3));
	            	ps.setString(5,(String)al.get(4));
	            	ps.setString(6,(String)al.get(5));
	            	recordcount = ps.executeUpdate();
	            }
	            
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return recordcount;
	    }
	public ResultSet viewdata(String username) {
		String SELECT_QUERY = "SELECT * FROM `userdetails` where `email` = '"+username+"'";
		try {
			//Class.forName(driver);
	        con = DriverManager.getConnection(url, user, "root");
			st = con.createStatement();
			re = st.executeQuery(SELECT_QUERY);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return re;	
	}
	
}
