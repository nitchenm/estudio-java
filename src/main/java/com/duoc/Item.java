package com.duoc;

public class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
