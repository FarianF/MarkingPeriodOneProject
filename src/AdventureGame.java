
public class AdventureGame {
    private String classChosen;
    private String name;


    private String playerChoice;


    private Enemy basicEnemy = new Enemy();

    private Enemy bossFight = new Enemy();


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

    public void setPlayerHealth(int hp){
        playerHealth = hp;
    }


    public int getPlayerAtk() {
        return playerAtk;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public int getPlayerPlagueResistance() {
        return playerPlagueResistance;
    }

    public int getPlayerIntelligence() {
        return playerIntelligence;
    }


    public int enemyHp() {
        int enemyHealth = basicEnemy.getEnemyHp();
        return enemyHealth;
    }


    public int newEnemyHp(int newHpStat) {
        basicEnemy.setEnemyHp(newHpStat);
        return newHpStat;
    }


    public int getLootChance(){
        return basicEnemy.enemyLootChance();
    }

    public int getEnemyAtk(){
        return basicEnemy.getEnemyDmg();
    }


    public void adventureStart(){
        basicEnemy.enemyBuilder();
        int damage = basicEnemy.getEnemyDmg();
        int enemyHealth = basicEnemy.getEnemyHp();
        playerHealth = playerHealth-damage;
    }

    public void bossBuilder(){
        bossFight.bossBuilder();;
        int bossDmg = bossFight.getBossDmg();
        int bossHealth = bossFight.getBossHp();
        playerHealth = playerHealth - bossDmg;
    }

    public int getBossDmg() {
        int damage = bossFight.getBossDmg();
        return damage;
    }

    public int getBossHp(){
        int health = bossFight.getBossHp();
        return health;
    }

    public void setBossHealth(int health) {
        bossFight.setBossHealth(health);
    }
}





