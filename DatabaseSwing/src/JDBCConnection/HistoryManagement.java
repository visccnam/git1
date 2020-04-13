/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import java.util.List;
import model.History;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class HistoryManagement {
    public List<History> getallHistory(){
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="select * from History";
        List<History> historys=new ArrayList<>();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                History h=new History();
                h.setStt(rs.getInt("STT"));
                h.setLenh(rs.getString("lenh"));
                h.setMoney(rs.getString("price"));
                historys.add(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistoryManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historys;
    }
    public void addHistory(History h){
        String sql="insert into History values(?,?)";
        try {
            PreparedStatement preparedStatement=JDBCConnect.getJDBCConnection().prepareStatement(sql);
            preparedStatement.setString(1, h.getLenh());
            preparedStatement.setString(2, h.getMoney());
            int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(HistoryManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public String getTonggd(){
        String sql="select sum(price) as Tong from History";
        String tong=new String();
        
        try {
            PreparedStatement preparedStatement=JDBCConnect.getJDBCConnection().prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                tong=rs.getString("Tong");
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HistoryManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tong;
        
    }
}
