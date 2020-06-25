package dungeon;

import java.util.ArrayList;

public class Dungeon {
    String name;
    ArrayList<Room> rooms;
    boolean doorIsOpen;

    public Dungeon(String name, ArrayList<Room> rooms, boolean doorIsOpen) {
        this.name = name;
        this.rooms = rooms;
        this.doorIsOpen = doorIsOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public boolean isDoorIsOpen() {
        return doorIsOpen;
    }

    public void setDoorIsOpen(boolean doorIsOpen) {
        this.doorIsOpen = doorIsOpen;
    }


}
