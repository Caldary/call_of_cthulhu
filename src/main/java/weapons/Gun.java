package weapons;

public class Gun extends Weapon {
    private String name;
    private int damage;
    private String range;

    public Gun(String name, int damage, String range){
        super(name, damage, range);
    }

    public int shoot(){
        return 10 * getDamage();
    }

    public int meelee(){
        return 4 * getDamage();
    }

}
