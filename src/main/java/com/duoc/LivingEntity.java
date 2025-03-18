package com.duoc;

public abstract class LivingEntity {
    private int maxHealth;
    private int currentHealth;

    public LivingEntity(int maxHealth){
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public abstract  void doDamage(int damage, LivingEntity enemyLivingEntity);

    public int getCurrentHealth(){
        return currentHealth;
    }

    public void setCurrentHealth(int damage){
        this.currentHealth -= damage;
    }


}
