package characters;

import behaviours.INonPlayer;
import behaviours.IObject;
import behaviours.IWeapon;
import java.util.ArrayList;

public abstract class Npc implements INonPlayer {
    String name;
    IWeapon weapon;
    ArrayList<IObject> inventory;
    int hitPoint;

    public Npc(String name, IWeapon weapon, ArrayList<IObject> inventory, int hitPoint) {
        this.name = name;
        this.weapon = weapon;
        this.inventory = inventory;
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public ArrayList<IObject> getInventory() {
        return inventory;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
}
