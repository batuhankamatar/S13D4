package org.example;

public enum Weapon {
    SWORD,
    BOW,
    SPEAR,
    GREAT_SWORD,
    AXE;

    private int damage;
    private double attackSpeed;

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}