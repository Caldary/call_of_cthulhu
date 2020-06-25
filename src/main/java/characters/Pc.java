package characters;

import weapons.Weapon;

import java.util.ArrayList;

public abstract class Pc {
    String name;
    Weapon weapon;
    ArrayList<Object> objects;
    int hitPoint;
    int sanityLevel;

    public Pc(String name, Weapon weapon, ArrayList<Object> objects, int hitPoint, int sanityLevel) {
        this.name = name;
        this.weapon = weapon;
        this.objects = objects;
        this.hitPoint = hitPoint;
        this.sanityLevel = sanityLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Object> objects) {
        this.objects = objects;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getSanityLevel() {
        return sanityLevel;
    }

    public void setSanityLevel(int sanityLevel) {
        this.sanityLevel = sanityLevel;
    }




}
