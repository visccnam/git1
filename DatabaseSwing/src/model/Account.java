/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Account {
  
    private String userName,password,money;

    public Account() {
    }
    
    public Account( String userName, String password, String money) {
       
        this.userName = userName;
        this.password = password;
        this.money = money;
    }

    

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getMoney() {
        return money;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMoney(String money) {
        this.money = money;
    }
    public String napMoney(int a){
        return String.valueOf(a+Integer.parseInt(money));
    }

    @Override
    public String toString() {
        return "Account{" + "money=" + money + '}';
    }
    
    
}
