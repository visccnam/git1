/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import java.sql.*;
public class JDBCConnect {
   
    public static Connection getJDBCConnection(){
       Connection con=null;
		String strConnection="jdbc:sqlserver://ADMIN\\\\\\\\SQL2016;portNumber=1433;databaseName=CenterGame;user=sa;password=1234$";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection(strConnection);
			
			
		}catch (ClassNotFoundException | SQLException e) {
                    // TODO Auto-generated catch block

		}
        // TODO Auto-generated catch block
		return con; 
    }

    
}
