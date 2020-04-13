/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCConnection;
import java.sql.*;
import model.Account;
import model.Client;
/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
         Connection con=JDBCConnect.getJDBCConnection();
         OrderManagement orderManagement=new OrderManagement();
         if(con!=null){
             System.out.println("dcmmmmm");
         }
         else System.out.println("?");
        
        
        HistoryManagement historyManagement=new HistoryManagement();
        System.out.println(historyManagement.getTonggd());
        String user="kjkdhg";
        AccountMangement accountMangement=new AccountMangement();
        Account a=accountMangement.getAccount(user);
        if(a.getUserName()==null){
            System.out.println("cmm");
        }
        Client c=new Client(1,1,"7.9",0,"");
        ClientMangement clientMangement=new ClientMangement();
        clientMangement.updateClient(c);
//        OrderRecord b= orderManagement.getOrder(2);
//        System.out.println(b.getTien());
        
        
    }
    
    
}
