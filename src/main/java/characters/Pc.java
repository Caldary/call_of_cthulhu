package characters;

import behaviours.IPlayer;
import behaviours.IObject;
import behaviours.IWeapon;

import java.util.ArrayList;

public abstract class Pc implements IPlayer {
    String name;
    IWeapon weapon;
    ArrayList<IObject> inventory;
    int hitPoint;

    public Pc(String name, IWeapon weapon, ArrayList<IObject> inventory, int hitPoint) {
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

    public void addObject(IObject object){
        this.inventory.add(object);
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

}
