/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Computer {
    private int COM_id,BRAND_id;
    private String CPU,Main,tpye,price;

    public Computer(int COM_id, int BRAND_id, String CPU, String Main, String tpye, String price) {
        this.COM_id = COM_id;
        this.BRAND_id = BRAND_id;
        this.CPU = CPU;
        this.Main = Main;
        this.tpye = tpye;
        this.price = price;
    }

    public int getCOM_id() {
        return COM_id;
    }

    public int getBRAND_id() {
        return BRAND_id;
    }

    public String getCPU() {
        return CPU;
    }

    public String getMain() {
        return Main;
    }

    public String getTpye() {
        return tpye;
    }

    public String getPrice() {
        return price;
    }

    public void setCOM_id(int COM_id) {
        this.COM_id = COM_id;
    }

    public void setBRAND_id(int BRAND_id) {
        this.BRAND_id = BRAND_id;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMain(String Main) {
        this.Main = Main;
    }

    public void setTpye(String tpye) {
        this.tpye = tpye;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
}
