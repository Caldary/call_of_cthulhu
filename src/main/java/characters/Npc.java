package characters;

import behaviours.IWeapon;
import objects.Food;
import java.util.ArrayList;

public abstract class Npc {
    String name;
    IWeapon IWeapon;
    ArrayList<Food>  objects;
    int hitPoint;

    public Npc(String name, IWeapon IWeapon, ArrayList<Food> objects, int hitPoint) {
        this.name = name;
        this.IWeapon = IWeapon;
        this.objects = objects;
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }

    public IWeapon getIWeapon() {
        return IWeapon;
    }

    public ArrayList<Food> getObjects() {
        return objects;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
}
