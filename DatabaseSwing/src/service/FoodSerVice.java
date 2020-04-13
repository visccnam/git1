/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import JDBCConnection.FoodManagement;
import java.util.List;
import model.Food;

/**
 *
 * @author Admin
 */
public class FoodSerVice {
    FoodManagement foodManagement=new FoodManagement();
    public List<Food> getAllFood(){
      return  foodManagement.getAllFood();
    }
    public Food getFood(int id){
        return foodManagement.getFood(id);
}
}
