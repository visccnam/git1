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
public class ACC_Cus {
    private String userName;
    private int cus_id;

    public ACC_Cus(String userName, int cus_id) {
        this.userName = userName;
        this.cus_id = cus_id;
    }

    public String getUserName() {
        return userName;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }
    
}
