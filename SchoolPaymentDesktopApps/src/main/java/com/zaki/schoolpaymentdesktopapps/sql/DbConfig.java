/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaki.schoolpaymentdesktopapps.sql;
/**
 *
 * @author soeltanzaki_r
 */
public class DbConfig {
    private String HOST = "";
    private String USERNAME = "";
    private String PASSWORD = "";
    private String DATABASE_NAME = "";

    public String getHOST() {
        return HOST;
    }

    public void setHOST(String HOST) {
        this.HOST = HOST;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getDATABASE_NAME() {
        return DATABASE_NAME;
    }

    public void setDATABASE_NAME(String DATABASE_NAME) {
        this.DATABASE_NAME = DATABASE_NAME;
    }
    
    public String getSqlHost(){
        return "jdbc:mysql://"+HOST+"/"+DATABASE_NAME+"?user="+USERNAME+"&password="+PASSWORD+"";
    }
}
