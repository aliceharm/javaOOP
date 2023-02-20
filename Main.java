import java.util.ArrayList;
import java.util.Comparator;

import Unit.Bandit;
import Unit.Farmman;
import Unit.Infantman;
import Unit.Monk;
import Unit.Pers;
import Unit.Shooter;
import Unit.Sniper;
import Unit.Wizard;

public class Main {
    public static void main(String[] args) {


        
        ArrayList<Pers> arrayList1 = new ArrayList<>();
        arrayList1.sort(new Comparator<Pers>() {
            @Override
            public int compare(Pers o1, Pers o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
    
    
    for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей команды 1
        
        Pers.createArreyUnit1(arrayList1, Pers.setClass());
    }

    System.out.println("Команда 1:");

    for (int i = 0; i < arrayList1.size(); i++) {

        System.out.print(arrayList1.get(i).getInfo());
    }

    ArrayList<Pers> arrayList2 = new ArrayList<>();

    for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей команды 2
        Pers.createArreyUnit2(arrayList2, Pers.setClass());
    }
    System.out.println();
    System.out.println("Команда 2:");


    for (int i = 0; i < arrayList2.size(); i++) {
        System.out.print(arrayList2.get(i).getInfo());
    }
    
    
    ArrayList<Pers> arreyAll = new ArrayList<>(arrayList1); // Список со всеми персонажами




    for (int i = 0; i < arrayList2.size(); i++) {
        arreyAll.add(arrayList2.get(i));
    }

    
    arreyAll.sort(new Comparator<Pers>() { // Сортируем весь список
        @Override
        public int compare(Pers o1, Pers o2) {
            if (o2.getSpeed() == o1.getSpeed()) {
                return o1.getHp() - o2.getHp();
            }
            return o2.getSpeed() - o1.getSpeed();
        }


    });

    System.out.println();
    System.out.println(arreyAll);






    }

    
}
