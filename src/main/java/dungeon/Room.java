package dungeon;

import behaviours.INonPlayer;
import behaviours.IObject;

import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<String> doors;
    ArrayList<IObject> objects;
    ArrayList<IObject> secrets;
    ArrayList<INonPlayer> enemies;

    public Room(String name, ArrayList<String> doors, ArrayList<IObject> objects, ArrayList<IObject> secrets, ArrayList<INonPlayer> enemies) {
        this.name = name;
        this.doors = doors;
        this.objects = objects;
        this.secrets = secrets;
        this.enemies = enemies;
    }
}
