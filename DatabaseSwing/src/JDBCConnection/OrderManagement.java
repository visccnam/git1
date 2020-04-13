/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import model.OrderRecord;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.OderService;

/**
 *
 * @author Admin
 */
public class OrderManagement {
    public void addRecord(OrderRecord o){
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="insert into OrderRecord values(?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, o.getName());
            preparedStatement.setInt(2, o.getCLT_id());
            preparedStatement.setString(3, o.getUserName());
            preparedStatement.setString(4, o.getTimeOder());
            preparedStatement.setString(5, o.getFood_id());
            preparedStatement.setString(6, o.getTien());
            int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
           
        } catch (SQLException ex) {
            Logger.getLogger(OrderManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public OrderRecord getOrder(int Sohd){
        Connection connection=JDBCConnect.getJDBCConnection();
         OrderRecord orderRecord=new OrderRecord();
        String sql="select * from OrderRecord where Sohd=?";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, Sohd);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                orderRecord.setSoHd(rs.getInt("Sohd"));
                orderRecord.setName(rs.getString("Name"));
                orderRecord.setCLT_id(rs.getInt("CLT_id"));
                orderRecord.setFood_id(rs.getString("Food_id"));
                
                orderRecord.setTimeOder(rs.getString("TimeOder"));
                orderRecord.setUserName(rs.getString("UserName"));
                orderRecord.setTien(rs.getString("Tien"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       return orderRecord;
        
    }
}
