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
public class History {
    private int stt;
    private String lenh,Money;

    public History() {
    }

    public History(int stt,String lenh, String Money) {
        this.stt=stt;
        this.lenh = lenh;
        this.Money = Money;
    }

    public int getStt() {
        return stt;
    }

    public String getLenh() {
        return lenh;
    }

    public String getMoney() {
        return Money;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setLenh(String lenh) {
        this.lenh = lenh;
    }

    public void setMoney(String Money) {
        this.Money = Money;
    }
    
}
