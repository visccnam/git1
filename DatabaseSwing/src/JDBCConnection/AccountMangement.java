/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import java.util.ArrayList;
import java.util.List;
import model.Account;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AccountMangement {
    public List<Account> getAllAccount(){
        List<Account> accounts=new ArrayList<>();
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="select * from Account";
        try {
            
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                Account a=new Account();
            a.setUserName(rs.getString("UserName"));
            a.setPassword(rs.getString("Password"));
            a.setMoney(rs.getString("MoneyRemain"));
            accounts.add(a);
            
            }
        } catch (SQLException ex) {
            
        }
        
        return accounts;
    }   
    public void addAccount(Account a){
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="insert into ACCOUNT values(?,?,?)";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,a.getUserName());
            preparedStatement.setString(2,a.getPassword());
            preparedStatement.setString(3,a.getMoney());
            int rs=preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
        
    }

    public void updateAccount(Account a){
       Connection connection=JDBCConnect.getJDBCConnection();
       String sql="update ACCOUNT set MoneyRemain=? where UserName=?";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
           
            preparedStatement.setString(1, a.getMoney());
            preparedStatement.setString(2, a.getUserName());
            int rs=preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(AccountMangement.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void napMoney(Account a,int money){
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="update Account set password=? where username=?";
        try {
            PreparedStatement preparedStatement=connection.prepareCall(sql);
            
            preparedStatement.setString(2,a.napMoney(money) );
            preparedStatement.setString(2,a.getUserName() );
        } catch (SQLException ex) {
            Logger.getLogger(AccountMangement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Account getAccount(String userName){
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="select * from ACCOUNT where UserName=?";
        Account a = new Account();
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                
                a.setUserName(rs.getString("UserName"));
                a.setPassword(rs.getString("PassWord"));
                a.setMoney(rs.getString("MoneyRemain"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountMangement.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return a;
    }
    
    
}
