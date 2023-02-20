package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Pers implements Interface {
    String name;
    boolean sex;
    int hp;
    int maxhp;
    int x, y;
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

        return 5;
    }

public Pers(String name, boolean sex, int hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina) {
    this.name = name;
    this.sex = sex;
    this.hp = hp;
    this.maxhp = maxhp;
    this.x = x;
    this.y = y;
    this.attack = attack;
    this.protect = protect;
    this.speed = speed;
    this.stamina = stamina;
    }


    public static String setName(){ // Дать случайное имя
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static ClassesUnits setClass(){ // Получаем случайного персонажа
        return ClassesUnits.values()[new Random().nextInt(ClassesUnits.values().length -1)];
    }


    public static void createArreyUnit1(ArrayList<Pers> arrayList, ClassesUnits classesUnits){ // Для создания Команды 1 (Список, setClass())
        switch (classesUnits){
            case Sniper : arrayList.add(new Sniper(setName()));
            break;
            case Wizard : arrayList.add(new Wizard(setName()));
            break;
            case Monk : arrayList.add(new Wizard(setName()));
            break;
            case Farmman : arrayList.add(new Farmman(setName()));
            break;
            case Shooter : arrayList.add(new Sniper(setName()));
            break;
            case Infantman : arrayList.add(new Infantman(setName()));
            break;
            case Bandit : arrayList.add(new Infantman(setName()));
            break;
        }
    }

    public static void createArreyUnit2(ArrayList<Pers> arrayList, ClassesUnits classesUnits){ // Для создания Команды 2 (Список, setClass())
        switch (classesUnits){
            case Monk : arrayList.add(new Monk(setName()));
            break;
            case Wizard : arrayList.add(new Monk(setName()));
            break;
            case Farmman : arrayList.add(new Farmman(setName()));
            break;
            case Shooter : arrayList.add(new Shooter(setName()));
            break;
            case Sniper : arrayList.add(new Shooter(setName()));
            break;
            case Bandit : arrayList.add(new Bandit(setName()));
            break;
            case Infantman : arrayList.add(new Bandit(setName()));
            break;
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", hp=" + hp +
                ", speed=" + speed ;
    }
    
    @Override
    public void step(int a) {}

    @Override
    public String getInfo() {return "Я человек!";}


    
    public int getSpeed() {
        return speed;
    }
    public int getHp() {
        return hp;
    }
}
