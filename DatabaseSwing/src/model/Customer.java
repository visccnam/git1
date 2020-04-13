/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Customer {
    private int CUS_id,Phone;
    private String firstName,lastName,adr;

    public Customer() {
    }
    
    public Customer(int CUS_id, String firstName, String lastName, String adr, int Phone) {
        this.CUS_id = CUS_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adr = adr;
        this.Phone = Phone;
    }

    public int getCUS_id() {
        return CUS_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdr() {
        return adr;
    }

    public int getPhone() {
        return Phone;
    }

    public void setCUS_id(int CUS_id) {
        this.CUS_id = CUS_id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }
    
}
