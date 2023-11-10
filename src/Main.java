import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        AdventureGame game1 = new AdventureGame();
        System.out.println("Hello adventurer! Welcome to the 14th century. Times are rough now a days since the black plague. But luckily for us you're here,\nbefore we begin choose your class between these 3 options");
        System.out.println("Class:\n Fighter: +30 damage\n -5 plague resistance\n -20 intelligence\n\n Doctor: +50 intelligence\n +10 plague resistance\n -10 damage\n\n Scavenger: +30 plague resistance\n-20 intelligence\n+10 damage");
        Scanner cahracterMaker = new Scanner(System.in);
        System.out.println("\nPick a class: ");
        String newClass = cahracterMaker.nextLine();
        System.out.println("Now, what is your name?");
        String name = cahracterMaker.nextLine();
        game1.chooseClass(newClass, name);


        game1.adventureStart();
        int playerDmg = game1.getPlayerAtk();
        int enemyHp = game1.enemyHp();
        int playerHp = game1.getPlayerHealth();
        int enemyDmg = game1.getEnemyAtk();
        System.out.println("What shall you do? (run or attack)");
        Scanner move = new Scanner(System.in);
        String movement = move.nextLine();
        game1.setPlayerChoice(movement);
        if (movement.contains("run away") || movement.contains("run")) {
            int chance = (int) (Math.random() * 2) + 1;
            if (chance == 1) {
                System.out.println("You managed to narrowly escape with your life");
            } else {
                System.out.println("You try running but to no avail! You must fight.");

            }
        } else {
            String choice = game1.setPlayerChoice(movement);
            while (enemyHp > 0) {
                enemyHp -= playerDmg;
                playerHp -= enemyDmg;
                System.out.println("You hit the wolf with your bare hands, dealing " + playerDmg + "\n Wolf hp: " + enemyHp + "\n Player health: " + playerHp);
            }
            game1.setPlayerHealth(playerHp);
            System.out.println("The wolf falls to the floor, no longer a threat. Do you wish to loot the wolf? (y/n)");
            Scanner loot = new Scanner(System.in);
            String lootAnswer = loot.nextLine();
            if (lootAnswer.contains("y")) {
                if (game1.getLootChance() >= 5) {
                    int fur = (int) ((Math.random() * 10) + 1);
                    System.out.println("You successfully looted the wolf, you obtained " + fur + " fur, ");
                } else {
                    System.out.println("You try looting but eventually leave the wolf behind, ");
                }
                System.out.println("You keep traveling through the forest, until you hear a voice. The voice of a small child. Do you check it out? (y/n)");
                Scanner choices = new Scanner(System.in);
                String childChoice = choices.nextLine();
                if (childChoice.contains("y")) {
                    System.out.println("You head towards the noise, you see a small child crying.");
                    System.out.println("\u001B[34m" + "HELP ME!!!!");
                    System.out.println("Looking at the child, you notice its lil billy, The towns trickster. Do you wish to save him?(y/n)");
                    Scanner lilBilly = new Scanner(System.in);
                    String saveChild = lilBilly.nextLine();
                    if(saveChild.contains("y") || saveChild.contains("Y")) {
                        System.out.println("You go towards lil Billy, as he screams louder and louder, you notice that he isnt in trouble at all. In fact, the little turd wasnt in danger at all. \nAs you look into the distance, you see a looming figure grow bigger. What do you do next?(get closer or leave");
                    }
                } else {
                    System.out.println("You think carefully, screw that child! You head forwards and don't look back. " + "\u001B[33m" + "\n screw that kid! " + "\u001B[37m" + "you think to yourself");
                }
            }
        }


    }
}


