package rpg.hero;

public class Boxer {
    //main attributes
    private int strength;
    private int agility;

    //strength dependent attributes
    private double damage;
    private double defence;
    private double hp;
    private double hpRecovery;
    private double currentHP;

    //agility dependent attributes
    private double stamina;
    private double staminaRecovery;
    private double currentStamina;
    private double dodge;

    public Boxer(int strength, int agility) {
        this.strength = strength;
        this.agility = agility;
        //TODO calculate dependent stats
	damage = 10 + (strength * 1.6);
	defence = 2 + strength;
	hp = 100 + (0.20 + strength);
	hpRecovery = (0.01 * hp) * strength;
	currentHP = hp;
	stamina = 25 + (agility * 0.5);
	staminaRecovery = 2 + (0.33 * agility);
	currentStamina = stamina;
	dodge = 0.025 * agility;        
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
    public double attack() {
        //TODO reduce stamina level, add critical chance???
        currentStamina = currentStamina - (5 + (0.25 * strength));
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
	double injury = incomeDamage - defence;
	if (injury > 0) {
	currentHP = currentHP - injury;
        }
        return 0;
    }

    public void recover() {
        //TODO recover hp and stamina
        currentHP = currentHP + hpRecovery;
	currentStamina = currentStamina + staminaRecovery;
    }

    /**
     * Check if the boxer dead or alive
     *
     * @return true if dead
     */
    public boolean isDead() {
        return currentHP <= 0;
    }
}
