package characters;

import behaviours.IObject;
import behaviours.IWeapon;

import java.util.ArrayList;

public class Policeman extends Pc{
    public Policeman(String name, IWeapon weapon, ArrayList<IObject> inventory, int hitPoint) {
        super(name, weapon, inventory, hitPoint);
    }
}
