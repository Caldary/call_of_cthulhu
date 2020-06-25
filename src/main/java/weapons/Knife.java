package weapons;

public class Knife extends Weapon {
    private String name;
    private int damage;
    private String range;

    public Knife(String name, int damage, String range){
        super(name, damage, range);
    }

    public int stab() {
        return 5 * getDamage();
    }

    public int slash(){
        return 4 * getDamage();
    }

}
