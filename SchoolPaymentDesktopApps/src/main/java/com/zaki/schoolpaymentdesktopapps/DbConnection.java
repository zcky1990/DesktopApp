/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaki.schoolpaymentdesktopapps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author soeltanzaki_r
 */
public class DbConnection {
    
static Connection connection = null;
static PreparedStatement statment = null;
    
    private static void makeJDBCConnection() {
 
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
                        e.printStackTrace();
			return;
		}
 
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crunchify", "root", "root");
			if (connection != null) {
			
			} else {

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
 
	}
    
}
