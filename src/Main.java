import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        AdventureGame game1 = new AdventureGame();
        System.out.println("Hello adventurer! Welcome to the 14th century. Times are rough nowadays since the black plague. But luckily for us you're here,\nbefore we begin choose your class between these 3 options");
        System.out.println("Class:\n Barbarian: +30 damage\n -5 plague resistance\n -20 intelligence\n\n Doctor: +50 intelligence\n +10 plague resistance\n -10 damage\n\n Scavenger: +30 plague resistance\n-20 intelligence\n+10 damage");
        Scanner cahracterMaker = new Scanner(System.in);
        System.out.println("\nPick a class(Type it exactly as it is): ");
        String newClass = cahracterMaker.nextLine();
        System.out.println("Now, what is your name?");
        String name = cahracterMaker.nextLine();
        game1.chooseClass(newClass, name);




        game1.adventureStart();
        int playerDmg = game1.getPlayerAtk();
        int enemyHp = game1.enemyHp();
        int playerHp = game1.getPlayerHealth();
        int enemyDmg = game1.getEnemyAtk();
        System.out.println("Great, lets start your adventure");
        System.out.println("You are wandering the forest when you come across a wild wolf!");
        System.out.println("The wolf lunges at you! it deals " + enemyDmg + " damage!");
        System.out.println("Current health: " + playerHp);
        System.out.println("What shall you do? (run or attack)");
        Scanner move = new Scanner(System.in);
        String movement = move.nextLine();
        game1.setPlayerChoice(movement);
        if (movement.contains("run away") || movement.contains("run")) {
                System.out.println("You managed to narrowly escape with your life");
        } else {
            String choice = game1.setPlayerChoice(movement);
            while (enemyHp > 0) {
                enemyHp -= playerDmg;
                playerHp -= enemyDmg;
                System.out.println("You hit the wolf with your bare hands, dealing " + playerDmg + "\n Wolf hp: " + enemyHp + "\n Player health: " + playerHp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                game1.setPlayerHealth(playerHp);
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
            }

        }
        System.out.println("You keep traveling through the forest, until you hear a voice. The voice of a small child. Do you check it out? (y/n)");
        Scanner choices = new Scanner(System.in);
        String childChoice = choices.nextLine();
        if (childChoice.contains("y")) {
            System.out.println("You head towards the noise, you see a small child crying.");
            System.out.println("\u001B[34m" + "HELP ME!!!!");
            System.out.println("\u001B[37m" + "Looking at the child, you notice its lil billy, The towns trickster. Do you wish to save him?(y/n)");
            Scanner lilBilly = new Scanner(System.in);
            String saveChild = lilBilly.nextLine();
            if(saveChild.contains("y") || saveChild.contains("Y")) {
                System.out.println("You go towards lil Billy, as he screams louder and louder, you notice that he isnt in trouble at all. In fact, the little turd wasn't in danger at all. \nAs you look into the distance, you see a looming figure grow bigger. What do you do next?(get closer or leave)");
                Scanner boss = new Scanner(System.in);
                String bossFight = boss.nextLine();
                if(bossFight.contains("get closer")) {
                    game1.bossBuilder();
                    int bossDmg = game1.getBossDmg();
                    int hp = game1.getBossHp();
                    System.out.println("You get closer, until eventually seeing a giant creature! It strikes, dealing " + bossDmg);
                    while(hp > 0 && playerHp > 0){
                        System.out.println("You strike back, dealing " + playerDmg + "\nCurrent hp: " + playerHp + "\nBoss hp: " + hp);
                        if(playerHp < 0) {
                            System.out.println("\u001B[31m" + "Game over");
                            break;
                        }
                        playerHp -= bossDmg;
                        game1.setPlayerHealth(playerHp);
                        game1.setBossHealth(hp);

                    }
                    System.out.println("You successfully defeated the boss, turns out that he was made of some material that holds the cure to the virus. You take it back to the village and make a cure. \nThe End");
                } else {
                    System.out.println("You take lil billy and run, you make back to your village and look around. Sadly, many are dead because of the virus. \n The End");
                }
            }
        } else {
            System.out.println("You think carefully, eventually you head forwards and don't look back. " + "\u001B[33m" + "\n screw that kid! ");
            System.out.print("\u001B[37m" + "you think to yourself");
            System.out.println(" You run from billy and head towards the village, but you are shunned for letting a child fend for themselves. \n The End");
        }


    }
}


