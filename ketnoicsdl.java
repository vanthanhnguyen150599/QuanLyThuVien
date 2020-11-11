/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vanth
 */

public class ketnoicsdl 
{
    public static Connection layKetNoi()
    {
        Connection ketnoi = null;
        String uRL = "jdbc:sqlserver://localhost:1433;databaseName=test";
        String user = "sa";
        String pass = "123";
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketnoi = DriverManager.getConnection(uRL, user, pass);
            System.out.println("Kết nối thành công");
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            System.out.println("Kết nối thất bại");
        }
        return ketnoi;
    }
//    public static void main(String[] arsg)
//    {
//        layKetNoi();
//    }  
}
