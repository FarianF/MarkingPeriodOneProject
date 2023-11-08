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

        game1.adventureStart();
        int playerDmg = game1.getPlayerAtk();
        System.out.println("What shall you do? (run or attack)");
        Scanner move = new Scanner(System.in);
        String movement = move.nextLine();
        game1.setPlayerChoice(movement);
        if(movement.contains("run away") || movement.contains("run")){
            int chance = (int) (Math.random()*2)+1;
            if (chance == 1){
                System.out.println("You managed to narrowly escape with your life");
            } else{
                System.out.println("You try running but to no avail! You must fight, what shall you do?");
            }
        } else {
            String choice = game1.setPlayerChoice(movement);
            for(int i = game1.enemyHp(); i > 0; i = game1.enemyHp() - playerDmg) {
                System.out.println("You attack the wolf with your bare hands dealing " + playerDmg + " damage");
                System.out.println("Wolfs Hp: " + game1.enemyHp());
            }
        }



        }
    }
