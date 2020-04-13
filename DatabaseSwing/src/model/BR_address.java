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
public class BR_address {
    private String centerName,chiNhanh;
    private int id;

    public BR_address(String centerName, String chiNhanh, int id) {
        this.centerName = centerName;
        this.chiNhanh = chiNhanh;
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getChiNhanh() {
        return chiNhanh;
    }

    public int getId() {
        return id;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public void setChiNhanh(String chiNhanh) {
        this.chiNhanh = chiNhanh;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
