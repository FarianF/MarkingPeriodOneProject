public class adventureGame {
    private String classChosen;
    private String name;

    private String enemy;

    private int playerAtk;

    private int playerHealth;

    private int playerIntelligence;

    private int playerPlagueResistance;

    public void chooseClass(String playerClass, String playerName) {
    classChosen = playerClass;
    name = playerName;
    if(playerClass.contains("Doctor")){
        playerAtk = 10;
        playerIntelligence = 50;
        playerPlagueResistance = 10;
    } else if (playerClass.contains("Fighter")) {
        playerAtk = 50;
        playerIntelligence = 10;
        playerPlagueResistance = 5;
    } else {
        playerAtk = 30;
        playerIntelligence = -20;
        playerPlagueResistance = 30;
    }
    }

    public void adventureStart(){
        System.out.println("Great! Now, lets start your adventure");
        System.out.println("You are wandering the forest when you come across a wild wolf!");
        int attackChance = (int) (Math.random()*10) + 1;
        if (attackChance >= 5){

        }

    }
}


