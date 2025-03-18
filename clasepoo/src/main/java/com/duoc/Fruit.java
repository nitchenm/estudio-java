package com.duoc;

public class Fruit extends Item {

    private String type;

    public Fruit(String type, String name, int quantity) {
        super(name, quantity);
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }
    
}
