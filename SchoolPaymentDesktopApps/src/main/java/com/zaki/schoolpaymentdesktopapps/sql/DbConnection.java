/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaki.schoolpaymentdesktopapps.sql;

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
    
    }
    
}
