/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import java.util.ArrayList;
import java.util.List;
import model.Client;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientMangement {
   public List<Client> getAllClient(){
       List<Client> clients=new ArrayList<>();
       Connection connection=JDBCConnect.getJDBCConnection();
       String sql="select * from Client";
       try {
           Client a=new Client();
           PreparedStatement preparedStatement=connection.prepareStatement(sql);
           ResultSet rs=preparedStatement.executeQuery();
           while(rs.next()){
               a.setCLT_id(rs.getInt("CLT_id"));
               a.setCOM_id(rs.getInt("COM_id"));
               a.setPrice(rs.getString("COM_id"));
               a.setIssued(rs.getInt("isUsed"));
               a.setUserName(rs.getString("UserName"));
           }
       } catch (SQLException ex) {
           Logger.getLogger(ClientMangement.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   
    return clients;   
   }
   public void updateClient(Client c){
       String sql="update CLIENT set UserName=?,isUsed=? where CLT_id=? ";
       try {
           PreparedStatement preparedStatement=JDBCConnect.getJDBCConnection().prepareStatement(sql);
           preparedStatement.setString(1, c.getUserName());
           preparedStatement.setInt(2, c.getIssued());
           preparedStatement.setInt(3, c.getCLT_id());
           int rs=preparedStatement.executeUpdate();
           System.out.println(rs);
       } catch (SQLException ex) {
           Logger.getLogger(ClientMangement.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
   
}
