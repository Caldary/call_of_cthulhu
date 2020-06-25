package weapons;

import behaviours.IWeapon;

public abstract class Weapon implements IWeapon {
    private String name;
    private int damage;
    private String range;

    public Weapon(String name, int damage, String range) {
        this.name = name;
        this.damage = damage;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getDamage() {
        return this.damage;
    }
}
