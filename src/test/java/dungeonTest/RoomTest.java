package dungeonTest;

import behaviours.INonPlayer;
import behaviours.IObject;
import dungeon.Room;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room1;
    ArrayList<String> doors = new ArrayList<String>();
    ArrayList<IObject> objects = new ArrayList<IObject>();
    ArrayList<IObject> secrets = new ArrayList<IObject>();
    ArrayList<INonPlayer> enemies = new ArrayList<INonPlayer>();

    @Before
    public void before(){
        doors.add("Dining Room");
        doors.add("Living Room");
        doors.add("Stairs");
        room1 = new Room("Hallway", doors, objects, secrets, enemies);
    }

    @Test
    public void hasName(){
        assertEquals("Living Room", room1.getName());
    }

    @Test
    public void hasDoors(){
        assertEquals(0, room1.getDoors().size());
    }
}
