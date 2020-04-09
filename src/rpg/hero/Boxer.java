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
        //TODO calculate dependent stats
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        //TODO recalculate dependent stats
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
        //TODO recalculate dependent stats
    }

    /**
     * Just normal attack
     *
     * @return outcome damage
     */
    public int attack() {
        //TODO reduce stamina level, add critical chance???
        return damage;
    }

    /**
     * Method to calc taken damage
     *
     * @param incomeDamage damage send by another boxer
     * @return damage taken or zero if dodge
     */
    public int takeDamage(int incomeDamage) {
        //TODO calc damage done, dodge or reduce hp, take into consideration the defence
        return 0;
    }

    public void recover() {
        //TODO recover hp and stamina
    }

    /**
     * Check if the boxer dead or alive
     *
     * @return true if dead
     */
    public boolean isDead() {
        return hp <= 0;
    }
}