import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Unit.Barrier;
import Unit.Pers;
import Unit.Vector2d;


public class Main {
    static final int UNITS = 10;
    public static ArrayList<Barrier> barrier = new ArrayList<>();
    public static ArrayList<Pers> teams = new ArrayList<>();
    public static ArrayList<Pers> team1 = new ArrayList<>();
    public static ArrayList<Pers> team2 = new ArrayList<>();

    
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        createBarrier();


        for (int i = 0; i < UNITS; i++) { // Создаем 10 случайных персонажей команды 1
        Pers.createArreyUnit1(team1, Pers.setClass(), i);
        }
        for (int i = 0; i < UNITS; i++) { // Создаем 10 случайных персонажей команды 2
            Pers.createArreyUnit2(team2, Pers.setClass(), i);
        }
//        printTeamCommand(team1,1); // вывод команды 1

//        printTeamCommand(team2,2); // вывод команды 2

        sortTeam(team1);   // сортировка
        sortTeam(team2);   // сортировка

        teams.addAll(team1);  // добавляем  1 команду в обший массив
        teams.addAll(team2);  // добавляем  2 команду в обший массив
        sortTeam(teams);

         while (true) {
            View.view();
            user_input.nextLine();
             for (Pers person: teams) {
                 if(team1.contains(person)) person.step(team1,team2);
                 else person.step(team2,team1);
             }
         }
    }


    //*
    //    Методы

    // Метод проверка на живой
    static ArrayList<Pers> findLive(ArrayList<Pers> team) {
        ArrayList <Pers> findLive = new ArrayList<>();
        for (Pers human : team) {
            if (!human.state.equals("Stand")|| !human.state.equals("Empty")) {
                human.setHp(0);
            }
        }
        return findLive;
    }

    // Метод сортировки
    static void sortTeam(ArrayList<Pers> team){
        team.sort(new Comparator<Pers>() {
            @Override
            public int compare(Pers o1, Pers o2) {
                if (o2.getSpeed() == o1.getSpeed()) {
                    return (int) ((int) o2.getHp() - o1.getHp());
                }
                return o2.getSpeed() - o1.getSpeed();
            }
        });
    }

    // Метод вывода команды
    static void printTeamCommand(ArrayList<Pers> team, int command){
        System.out.println("Команда: " + command);
        System.out.println("*****************************************************************************************************");
        System.out.println("Class          Name       HP             MaxHp                     Arrow                 Coords  (X.Y)");
        System.out.println("*****************************************************************************************************");
        for (int i = 0; i < team.size(); i++) {

            System.out.print(team.get(i).getInfo());
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

    static void createBarrier(){
       int rnd = new Random().nextInt( 5);
       for (int i = 0; i < rnd; i++){
           int x = new Random().nextInt( 8);
           int y = new Random().nextInt( 8);
           
            barrier.add(new Barrier(new Vector2d(x, y)));
       }
   }
}
