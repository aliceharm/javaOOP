package Unit;
public class Pers {
    String name;
    boolean sex;
    int hp;
    protected int attack;
    protected int protect;
    protected int speed;
    protected int stamina;

public int getAttack(){

        return 0;
    }

public int getHP(){

        return 0;
    }

public int getSleep(){

        return 0;
    }

public Pers(String name, boolean sex, int hp, int attack, int protect, int speed, int stamina) {
    this.name = name;
    this.sex = sex;
    this.hp = hp;
    this.attack = attack;
    this.protect = protect;
    this.speed = speed;
    this.stamina = stamina;
    }
}
