import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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


        
        ArrayList<Pers> team1 = new ArrayList<>();
        team1.sort(new Comparator<Pers>() {
            @Override
            public int compare(Pers o1, Pers o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
    
    
    for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей команды 1
        
        Pers.createArreyUnit1(team1, Pers.setClass(), i);
    }
    System.out.println("*****************************************************************************************************");
    System.out.println("Class          Name       HP             MaxHp                     Arrow                 Coords  (X.Y)");
    System.out.println("*****************************************************************************************************");
    System.out.println("Команда 1:");

    for (int i = 0; i < team1.size(); i++) {

        System.out.print(team1.get(i).getInfo());
    }

    ArrayList<Pers> team2 = new ArrayList<>();
    team2.sort(new Comparator<Pers>() {
        @Override
        public int compare(Pers o1, Pers o2) {
            return o1.getSpeed() - o2.getSpeed();
        }
    });

    for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей команды 2
        Pers.createArreyUnit2(team2, Pers.setClass(), i);
    }
    System.out.println();
    System.out.println("Команда 2:");
    for (int i = 0; i < team1.size(); i++) {

        System.out.print(team2.get(i).getInfo());
    }


   
    
    
    ArrayList<Pers> teams = new ArrayList<>(team1); // Список со всеми персонажами




    for (int i = 0; i < team2.size(); i++) {
        teams.add(team2.get(i));
    }

    
    teams.sort(new Comparator<Pers>() { // Сортируем весь список
        @Override
        public int compare(Pers o1, Pers o2) {
            if (o2.getSpeed() == o1.getSpeed()) {
                return (int) ((int) o2.getHp() - o1.getHp());
            }
            return o2.getSpeed() - o1.getSpeed();
        }


    });
    Scanner user_input = new Scanner(System.in);
    String game = "";

    System.out.println("------------------Team sorted-------------");
 //   System.out.println(arreyAll);



while (game == ""){
        if(Pers.findLive(team1).size() != 0 && Pers.findLive(team2).size() != 0){
            
            
            for (Pers hero : teams){
                if(team1.contains(hero)){
                    hero.step(Pers.findLive(team1),Pers.findLive(team2));
           }
                else {
                    hero.step(Pers.findLive(team2),Pers.findLive(team1));
                }

            }
            game = user_input.nextLine();
        }
        else {
            winner(team1,team2);
            break;
        }

    }



    }

    static void printTeam(ArrayList<Pers> teams) {
        printHeaders();
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getInfo());
        }
        printLine();

    }
    static void printLine(){
        System.out.println("*********************************************************************************");
    }

    static void printHeaders(){
        System.out.println("*********************************************************************************");
        System.out.println("Class          Name          HP          MaxHp             Arrow        Coords(X.Y)");
        System.out.println("*********************************************************************************");
    }

    static void winner(ArrayList<Pers> team1,ArrayList<Pers> team2){
        int t1 = Pers.findLive(team1).size();
        int t2 = Pers.findLive(team2).size();
        System.out.println(t1 > t2 ? "Winner team1" : "Winner team2");
    }

    



    
}
