package characters;

import weapons.Weapon;
import objects.Object;
import java.util.ArrayList;

public abstract class Npc {
    String name;
    Weapon weapon;
    ArrayList<Object>  objects;
    int hitPoint;

    public Npc(String name, Weapon weapon, ArrayList<Object> objects, int hitPoint) {
        this.name = name;
        this.weapon = weapon;
        this.objects = objects;
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
}
