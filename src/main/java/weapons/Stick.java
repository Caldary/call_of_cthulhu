package weapons;

public class Stick extends Weapon{
    private String name;
    private int damage;
    private String range;

    public Stick(String name, int damage, String range){
        super(name, damage, range);
    }

    public int poke() {
        return 4 * getDamage();
    }

    public int Swing(){
        return 2 * getDamage();
    }

}
