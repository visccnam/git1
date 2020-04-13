/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Employee {
    private int EM_id,EM_manager,BRAND_id;
    private String firstName,lastName,timework;
    private float salaryPerHours;

    public Employee() {
    }

    public Employee(int EM_id, int EM_manager, int BRAND_id, String firstName, String lastName, String timework, float salaryPerHours) {
        this.EM_id = EM_id;
        this.EM_manager = EM_manager;
        this.BRAND_id = BRAND_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.timework = timework;
        this.salaryPerHours = salaryPerHours;
    }

    public int getBRAND_id() {
        return BRAND_id;
    }

    public void setBRAND_id(int BRAND_id) {
        this.BRAND_id = BRAND_id;
    }
    
    
    public int getEM_id() {
        return EM_id;
    }

    public int getEM_manager() {
        return EM_manager;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTimework() {
        return timework;
    }

    public float getSalaryPerHours() {
        return salaryPerHours;
    }

    public void setEM_id(int EM_id) {
        this.EM_id = EM_id;
    }

    public void setEM_manager(int EM_manager) {
        this.EM_manager = EM_manager;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTimework(String timework) {
        this.timework = timework;
    }

    public void setSalaryPerHours(float salaryPerHours) {
        this.salaryPerHours = salaryPerHours;
    }
    
            
    
}
