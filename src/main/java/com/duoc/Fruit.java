package com.duoc;

public class Fruit extends Item {

    private String type;
    private int healToDo;

    public Fruit(String type, String name, int quantity, int healToDo) {
        super(name, quantity);
        this.type = type;
        this.healToDo = healToDo;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getHealing(){
        return healToDo;
    }
    
}
