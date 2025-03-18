package com.duoc;

public class Npc extends LivingEntity{
    private String name;
    
    public Npc(int maxHealth) {
        super(maxHealth);
    }

    @Override
    public void doDamage(int damage, LivingEntity enemyliLivingEntity) {
        enemyliLivingEntity.setCurrentHealth(damage);
    }

   
    
}
