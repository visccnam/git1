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
public class OrderRecord {
    private int soHd,CLT_id;
    private String name,userName,timeOder,food,tien,Food_id;

    public OrderRecord() {
    }

    public OrderRecord(int soHd, String Food_id, int CLT_id, String name, String userName, String timeOder,String tien) {
        this.soHd = soHd;
        this.Food_id = Food_id;
        this.CLT_id = CLT_id;
        this.tien=tien;
        this.name = name;
        this.userName = userName;
        this.timeOder = timeOder;
       
    }

    
    public int getSoHd() {
        return soHd;
    }

    public String getFood_id() {
        return Food_id;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setTien(String tien) {
        this.tien = tien;
    }

    public String getFood() {
        return food;
    }

    public String getTien() {
        return tien;
    }

    public int getCLT_id() {
        return CLT_id;
    }

    

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getTimeOder() {
        return timeOder;
    }

    public void setSoHd(int soHd) {
        this.soHd = soHd;
    }

    public void setFood_id(String Food_id) {
        this.Food_id = Food_id;
    }

    public void setCLT_id(int CLT_id) {
        this.CLT_id = CLT_id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTimeOder(String timeOder) {
        this.timeOder = timeOder;
    }
    
}
