package weaponTest;

import org.junit.Before;
import org.junit.Test;
import weapons.Gun;

import static org.junit.Assert.assertEquals;

public class GunTest {
    Gun gun1;
    Gun gun2;

    @Before
    public void before(){
        gun1 = new Gun("Pistol", 5, "Long");
        gun2 = new Gun("Shotgun", 5, "Long");
    }

    @Test
    public void hasName(){
        assertEquals("Shotgun", gun2.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(5, gun1.getDamage());
    }

    @Test
    public void hasRange(){
        assertEquals("Long", gun1.getRange());
    }

    @Test
    public void canShoot(){
        assertEquals(50, gun1.shoot());
    }

    @Test
    public void canMeelee(){
        assertEquals(10, gun1.meellee());
    }
}
