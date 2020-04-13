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
public class Client {
    private int CLT_id,COM_id,issued;
    private String userName,price;

    public Client() {
    }

    public Client(int CLT_id, int COM_id, String price, int issued, String userName) {
        this.CLT_id = CLT_id;
        this.COM_id = COM_id;
        this.price = price;
        this.issued = issued;
        this.userName = userName;
    }

    public int getCLT_id() {
        return CLT_id;
    }

    public int getCOM_id() {
        return COM_id;
    }

    public String getPrice() {
        return price;
    }

    public int getIssued() {
        return issued;
    }

    public String getUserName() {
        return userName;
    }

    public void setCLT_id(int CLT_id) {
        this.CLT_id = CLT_id;
    }

    public void setCOM_id(int COM_id) {
        this.COM_id = COM_id;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setIssued(int issued) {
        this.issued = issued;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
