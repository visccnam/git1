/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.OrderRecord;
import JDBCConnection.OrderManagement;

public class OderService {
    OrderManagement orderManagement=new OrderManagement();
    public OrderRecord getOrder(int Sohd){
        return orderManagement.getOrder(Sohd);
        
    }
    public void addOrder(OrderRecord o){
        orderManagement.addRecord(o);
    }
}
