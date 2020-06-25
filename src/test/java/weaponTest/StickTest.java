package weaponTest;

import org.junit.Before;
import org.junit.Test;
import weapons.Stick;

import static org.junit.Assert.assertEquals;

public class StickTest {
    Stick stick1;
    Stick stick2;

    @Before
    public void before(){
        stick1 = new Stick("Wood", 4, "Medium");
        stick2 = new Stick("Metal", 4, "Medium");
    }

    @Test
    public void hasName(){
        assertEquals("Metal", stick2.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(35, stick1.getDamage());
    }

    @Test
    public void hasRange(){
        assertEquals("Medium", stick1.getRange());
    }

    @Test
    public void canPoke(){
        assertEquals(16, stick1.poke());
    }

    @Test
    public void canSwing(){
        assertEquals(8, stick2.poke());
    }
}
