package rpg.hero;

public class Boxer {
    //main attributes
    private int strength;
    private int agility;

    //strength dependent attributes
    private int damage;
    private int defence;
    private int hp;
    private int hpRecovery;

    //agility dependent attributes
    private int stamina;
    private int staminaRecovery;
    private int dodge;

    public Boxer(int strength, int agility) {
        this.strength = strength;
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}