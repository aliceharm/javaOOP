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
                return (int) ((int) o2.gethp() - o1.gethp());
            }
            return o2.getSpeed() - o1.getSpeed();
        }

        

    });
   
 //   System.out.println(teams);

 ArrayList<Pers> holyLive = new ArrayList<>(team1);
 ArrayList<Pers> darkLive = new ArrayList<>(team2);


 while (true) {
    View.view();
    user_input.nextLine();
    
    for (Pers human: teams) {
        if (holyLive.size() != 0 && darkLive.size() != 0) {
            if (team1.contains(human)) {
                human.step(holyLive, darkLive, barrier);
                darkLive = findLive(team2);
            } else {
                human.step(darkLive, holyLive, barrier);
                holyLive = findLive(team1);
            }
        } else {
            View.view();
            View.searchWinner(holyLive.size());
            return;
        }
    }
}

    }

    static ArrayList<Pers> findLive(ArrayList<Pers> team) {
        ArrayList <Pers> findLive = new ArrayList<>();
        for (Pers human : team) {
            if (human.state.equals("Stand")|| human.state.equals("Empty")) {
                findLive.add(human);
            }
        }
        return findLive;
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
