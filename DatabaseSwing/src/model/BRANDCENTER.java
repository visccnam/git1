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
public class BRANDCENTER {
    private int id;
    private String centerName,addr;

    public BRANDCENTER(int id, String centerName, String addr) {
        this.id = id;
        this.centerName = centerName;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getAddr() {
        return addr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    
}
