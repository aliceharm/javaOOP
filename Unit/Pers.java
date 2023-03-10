package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Pers implements Interface {
    String name;
    boolean sex;
    float hp;
    int maxhp;
    public Vector2d pos;
    protected int attack;
    protected int protect;
    protected int speed;
    protected int stamina;
    public String state;
    

    public int getAttack(){

            return 0;
        }

    public int getSleep(){

            return 5;
        }

    public Pers(String name, boolean sex, float hp, int maxhp, int x, int y, int attack, int protect, int speed, int stamina) {
        this.name = name;
        this.sex = sex;
        this.hp = hp;
        this.maxhp = maxhp;
        pos = new Vector2d(x, y);

        this.attack = attack;
        this.protect = protect;
        this.speed = speed;
        this.stamina = stamina;
        this.state = "Stand";
    }


    public static String setName(){ // Дать случайное имя
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public static ClassesUnits setClass(){ // Получаем случайного персонажа
        return ClassesUnits.values()[new Random().nextInt(ClassesUnits.values().length -1)];
    }

    protected int findNearest(ArrayList<Pers> teams){ //ищем ближайшего
        double min = 100;
        int index = 0;
        for (int i = 0; i < teams.size(); i++) {
            if(min > pos.getDistance(teams.get(i).pos)){
                index = i;
                min = pos.getDistance(teams.get(i).pos);
            }
        }
        return index;

    }

    public static void createArreyUnit1(ArrayList<Pers> arrayList, ClassesUnits classesUnits, int i){ // Для создания Команды 1 (Список, setClass())
        switch (classesUnits){
            
            case Sniper : arrayList.add(new Sniper(setName(), 1, i));
            break;
            case Wizard : arrayList.add(new Wizard(setName(), 1, i));
            break;
            case Monk : arrayList.add(new Wizard(setName(), 1, i));
            break;
            case Farmman : arrayList.add(new Farmman(setName(), 1, i));
            break;
            case Shooter : arrayList.add(new Sniper(setName(), 1, i));
            break;
            case Infantman : arrayList.add(new Infantman(setName(), 1, i));
            break;
            case Bandit : arrayList.add(new Infantman(setName(), 1, i));
            break;
        }
    }

    public static void createArreyUnit2(ArrayList<Pers> arrayList, ClassesUnits classesUnits, int i){ // Для создания Команды 2 (Список, setClass())
        switch (classesUnits) {
            
            case Monk : arrayList.add(new Monk(setName(), 10, i));
            break;
            case Wizard : arrayList.add(new Monk(setName(), 10, i));
            break;
            case Farmman : arrayList.add(new Farmman(setName(), 10, i));
            break;
            case Shooter : arrayList.add(new Shooter(setName(), 10, i));
            break;
            case Sniper : arrayList.add(new Shooter(setName(), 10, i));
            break;
            case Bandit : arrayList.add(new Bandit(setName(), 10, i));
            break;
            case Infantman : arrayList.add(new Bandit(setName(), 10, i));
            break;
        }
    }

    @Override
    public String getInfo() {
        return "";
    }

    public static ArrayList<Pers> findLive(ArrayList<Pers> teams){
        ArrayList<Pers> findLive = new ArrayList<>();
        for (int i = 0; i < teams.size(); i++) {
            if(teams.get(i).getHp() > 0){
                findLive.add(teams.get(i));
            }
            else{
                teams.get(i).state = "Die";
            }
        }
        return findLive;
    }

    public void  makeDamage(Pers unit){
        int damage = unit.getprotect() - attack;
        float hp;
        if(damage < 0) {
            hp = unit.getHp() + damage;
        } else if (damage > 0) {
            hp = unit.getHp() - 1;
        } else {
            hp = unit.getHp() - ((attack+1)/2);
        }
        unit.sethp(hp < 0 ? 0: hp);
    }
    public int getprotect() {
        return protect;
    }
    public int getMaxhp() {
        return maxhp;
    }



    protected void getDamage(float damage) {
        hp -= damage;
        if(hp > maxhp) hp = maxhp;
            if (hp <= 0) state = "Die";
            }
    
    public int getSpeed() {
        return speed;
    }
    public float getHp() {
        return hp;
    }
    public void sethp(float hp) {
        this.hp = hp;
    }


    public int[] getCoords() { return new int[]{pos.x, pos.y};}
    @Override
    public String toString() {
        return name + "\t" +
                getEmoji() +
                "\t| \uD83E\uDE78:" + Math.round(hp) +
                "\t\uD83D\uDEE1:" + protect +
                " \t\uD83D\uDDE1:" + attack +
                " \t\uD83D\uDCA5:" + Math.round(Math.abs((1+attack)/2)) + "  ";
    }
    public String getEmoji() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public void setPos(Vector2d pos) {
        this.pos = pos;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setState(String state) {
        this.state = state;
    }

}
