package com.duoc;

public class MainCharacter extends LivingEntity{
    
    private String name ;
    private Inventory inventory;
    private Weapon equippedWeapon;
    private Weapon fist;
    

    public MainCharacter(int maxHealth, String name, Inventory inventory) {
        super(maxHealth);
        this.name = name;
        this.inventory = inventory;
        this.fist = new Weapon("Fist", 1, 1, "Fist weapon");
    }

    public void equipWeapon(Weapon weaponToEquip){
        this.equippedWeapon = weaponToEquip;
    }

    
    @Override
    public void doDamage(int damage, LivingEntity enemyliLivingEntity) {
        if(this.equippedWeapon != null){
            enemyliLivingEntity.damageHealth(damage + this.equippedWeapon.getDamage());
        }
        else{
            equipWeapon(this.fist);
            enemyliLivingEntity.damageHealth(damage + this.equippedWeapon.getDamage());
        }
    }   

    public void doHealing(Fruit fruit){
        this.doHealing(fruit.getHealing());
    }

    
}
