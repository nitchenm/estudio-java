package com.duoc;

public class MainCharacter extends LivingEntity{
    
    private String name ;
    private Inventory inventory;
    

    public MainCharacter(int maxHealth, String name, Inventory inventory) {
        super(maxHealth);
        this.name = name;
        this.inventory = inventory;
    }

    
    @Override
    public void doDamage(int damage, LivingEntity enemyliLivingEntity) {
        enemyliLivingEntity.setCurrentHealth(damage);
    }
    
}
