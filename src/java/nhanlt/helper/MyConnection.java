/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanlt.helper;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author DELL
 */
public class MyConnection implements Serializable {

    public static Connection makeConnection() throws SQLException, NamingException, ClassNotFoundException {
        //1.load driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        

        //2.create connectionString
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Project_HomeStay";

        //3.Open connection
        Connection con = DriverManager.getConnection(url, "sa", "123");

        return con;
    }
}
