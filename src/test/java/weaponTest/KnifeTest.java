package weaponTest;

import org.junit.Before;
import org.junit.Test;
import weapons.Knife;

import static org.junit.Assert.assertEquals;

public class KnifeTest {

    Knife knife1;
    Knife knife2;

    @Before
    public void before(){
        knife1 = new Knife("Smooth", 3, "Short");
        knife2 = new Knife("Serrated", 3, "Short");
    }

    @Test
    public void hasName(){
        assertEquals("Smooth", knife1.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(30, knife1.getDamage());
    }

    @Test
    public void hasRange(){
        assertEquals("Short", knife1.getRange());
    }

    @Test
    public void canStab(){
        assertEquals(15, knife1.stab());
    }

    @Test
    public void canSlash(){
        assertEquals(12, knife1.poke());
    }
}
