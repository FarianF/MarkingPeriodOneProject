import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        adventureGame game1 = new adventureGame();
        System.out.println("Hello adventurer! Welcome to the 14th century. Times are rough now a days since the black plague. But luckily for us you're here,\nbefore we begin choose your class between these 3 options");
        System.out.println("Class:\n Fighter: +30 damage\n -5 plague resistance\n -20 intelligence\n\n Doctor: +50 intelligence\n +10 plague resistance\n -10 damage\n\n Scavenger: +30 plague resistance\n-20 intelligence\n+10 damage");
        Scanner cahracterMaker = new Scanner(System.in);
        System.out.println("\nPick a class: ");
        String newClass = cahracterMaker.nextLine();
        System.out.println("Now, what is your name?");
        String name = cahracterMaker.nextLine();
        game1.chooseClass(newClass,name);


        }
    }
