package com.duoc;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        MainCharacter playerOne = new MainCharacter(100, "Warrior", inventory);
        Weapon axe = new Weapon("Axe", 1, 10, "Steel axe");
        Fruit genericFruit = new Fruit("Platano", "Platano", 1, 10);
        Npc beast = new Npc(50);

        playerOne.equipWeapon(axe);
        beast.doDamage(10, playerOne);
        playerOne.doDamage(20, beast);

        playerOne.doHealing(genericFruit);

        System.out.println(beast.getCurrentHealth());
        System.out.println(playerOne.getCurrentHealth());
    }
}