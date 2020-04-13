/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Food {
    private String name,price,kind;
    private String Food_id;

    public Food() {
    }
    

    public Food(String name, String price, String kind, String Food_id) {
        this.name = name;
        this.price = price;
        this.kind = kind;
        this.Food_id = Food_id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getKind() {
        return kind;
    }

    public String getFood_id() {
        return Food_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setFood_id(String Food_id) {
        this.Food_id =Food_id;
    }
    
}
