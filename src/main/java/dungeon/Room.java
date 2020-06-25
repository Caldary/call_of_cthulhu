package dungeon;

import behaviours.IObject;
import characters.Npc;
import behaviours.IWeapon;

import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<String> doors;
    ArrayList<IObject> objects;
    ArrayList<IObject> secrets;
    ArrayList<IWeapon> IWeapons;
    ArrayList<Npc> npcs;

    public Room(String name, ArrayList<String> doors, ArrayList<IObject> objects, ArrayList<IObject> secrets, ArrayList<IWeapon> IWeapons, ArrayList<Npc> npcs) {
        this.name = name;
        this.doors = doors;
        this.objects = objects;
        this.secrets = secrets;
        this.IWeapons = IWeapons;
        this.npcs = npcs;
    }
}
