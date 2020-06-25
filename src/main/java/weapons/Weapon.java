package weapons;

import behaviours.IObject;
import behaviours.IWeapon;

public abstract class Weapon implements IWeapon, IObject {
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

    public String getRange() {
        return range;
    }

    public int getDamage() {
        return this.damage;
    }
}
