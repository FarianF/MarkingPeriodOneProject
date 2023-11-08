public class adventureGame {
    private String classChosen;
    private String name;

    private String playerChoice;

    private enemy basicEnemy = new enemy();

    private int playerAtk;

    private int playerHealth;

    private int playerIntelligence;

    private int playerPlagueResistance;

    public void chooseClass(String playerClass, String playerName) {
    classChosen = playerClass;
    name = playerName;
    playerHealth = 100;
    if(playerClass.contains("Doctor") || playerClass.contains("doctor")){
        playerAtk = 10;
        playerIntelligence = 50;
        playerPlagueResistance = 10;
    } else if (playerClass.contains("Fighter") || playerClass.contains("fighter")) {
        playerAtk = 50;
        playerIntelligence = 10;
        playerPlagueResistance = 5;
    } else {
        playerAtk = 30;
        playerIntelligence = -20;
        playerPlagueResistance = 30;
    }
    }
    public String setPlayerChoice(String choice){
        playerChoice = choice;
        return choice;
    }

    public int getPlayerAtk() {
        return playerAtk;
    }

    public int enemyHp() {
        int enemyHealth = basicEnemy.getEnemyHp();
        return enemyHealth;
    }

    public void adventureStart(){
        System.out.println("Great! Now, lets start your adventure");
        System.out.println("You are wandering the forest when you come across a wild wolf!");
        basicEnemy.enemyBuilder();
            int damage = basicEnemy.getEnemyDmg();
            int enemyHealth = basicEnemy.getEnemyHp();
            System.out.println("The wolf lunges at you! it deals " + damage + " damage!");
            playerHealth = playerHealth-damage;
            System.out.println("Current health: " + playerHealth);
    }
}


