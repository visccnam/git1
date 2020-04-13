/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Food;

public class FoodManagement {
     public List<Food> getAllFood(){
        List<Food> foods=new ArrayList<>();
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="select * from FOOD";
        try {
            
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
            Food f=new Food();
            f.setName(rs.getString("Name"));
            f.setPrice(rs.getString("Price"));
            f.setKind(rs.getString("Kind"));
            f.setFood_id(rs.getString("Food_id"));
            foods.add(f);
               
            }
        } catch (SQLException ex) {
            
        }
        
        return foods;
    }
     public Food getFood(int id){
         Connection connection=JDBCConnect.getJDBCConnection();
         Food f=new Food();
         String sql="select * from where id=?";
         try {
             PreparedStatement preparedStatement=connection.prepareStatement(sql);
             preparedStatement.setInt(1, id);
             ResultSet rs=preparedStatement.executeQuery();
             while(rs.next()){
                 f.setFood_id(rs.getString("Food_id"));
                 f.setName(rs.getString("Name"));
                 f.setPrice(rs.getString("Price"));
                 f.setKind(rs.getString("Kind"));
             }
         } catch (SQLException ex) {
             Logger.getLogger(FoodManagement.class.getName()).log(Level.SEVERE, null, ex);
         }
         return f;
     }
}
