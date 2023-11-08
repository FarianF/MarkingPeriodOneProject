public class enemy {
    private int enemyHealth;

    private int enemyDamage;

    private int bossHealth;

    private int bossDamage;

    public void enemyBuilder() {
     enemyDamage = (int) (Math.random()*10)+1;
     enemyHealth = (int) (Math.random()*50)+50;
    }

    public int getEnemyHp() {
        return enemyHealth;
    }

    public int getEnemyDmg() {
        return enemyDamage;
    }
    public void setEnemyHp(int health) {
        enemyHealth = health;
    }
    public void bossBuilder() {
        bossDamage = (int) (Math.random()*200)+100;
        bossHealth = (int) (Math.random()*100)+50;
    }

    public int getBossHp() {
        return bossHealth;
    }

    public int getBossDmg() {
        return bossDamage;
    }
}
