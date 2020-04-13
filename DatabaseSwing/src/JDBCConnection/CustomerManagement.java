/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import java.util.ArrayList;
import java.util.List;
import model.Customer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CustomerManagement {
    public List<Customer> getAllCustomer(){
         List<Customer> customers= new ArrayList<>();
            Connection connection=JDBCConnect.getJDBCConnection();
            String sql="select * from Customer";
        try {
           
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                Customer c= new Customer();
                c.setCUS_id(rs.getInt("CUS_id"));
                c.setFirstName(rs.getString("FirstName"));
                c.setLastName(rs.getString("LastName"));
                c.setAdr(rs.getString("Addr"));
                c.setPhone(rs.getInt("Phone"));
                customers.add(c);
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(CustomerManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
         return customers;
        
    }
    public void addCustomer(Customer c){
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="insert into Customer values(?,?,?,?))";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(2,c.getFirstName());
            preparedStatement.setString(3, c.getLastName());
            preparedStatement.setString(4, c.getAdr());
            preparedStatement.setInt(5, c.getPhone());
            int rs=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
