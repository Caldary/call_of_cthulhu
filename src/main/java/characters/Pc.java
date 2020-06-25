package characters;

import behaviours.IWeapon;

import java.util.ArrayList;

public abstract class Pc {
    String name;
    IWeapon IWeapon;
    ArrayList<Object> objects;
    int hitPoint;
    int sanityLevel;

    public Pc(String name, IWeapon IWeapon, ArrayList<Object> objects, int hitPoint, int sanityLevel) {
        this.name = name;
        this.IWeapon = IWeapon;
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

    public IWeapon getIWeapon() {
        return IWeapon;
    }

    public void setIWeapon(IWeapon IWeapon) {
        this.IWeapon = IWeapon;
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
