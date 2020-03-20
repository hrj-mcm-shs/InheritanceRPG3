package jugar.mcm.edu.ph.inheritancerpg3.classes;

public class Character {
    private int id;

    // STATS \\
    private double baseHealth;
    private double baseHealthRegen;
    private double baseFuel;    // basically the futuristic version of mana
    private double baseFuelCharge;  // basically the futuristic version of mana regen

    private double physicalDamage;
    private double attackInterval;
    private double criticalChance;

    private double electricalAmplification; // basically the futuristic version of magic damage
    private double cooldownReduction;

    private double movementSpeed;

    // CONSTRUCTOR \\
    public Character(int id, double baseHealth, double baseHealthRegen, double baseFuel, double baseFuelCharge,
                     double physicalDamage, double attackInterval, double criticalChance,
                     double electricalAmplification, double cooldownReduction, double movementSpeed) {
        this.id = id;
        this.baseHealth = baseHealth;
        this.baseHealthRegen = baseHealthRegen;
        this.baseFuel = baseFuel;
        this.baseFuelCharge = baseFuelCharge;
        this.physicalDamage = physicalDamage;
        this.attackInterval = attackInterval;
        this.criticalChance = criticalChance;
        this.electricalAmplification = electricalAmplification;
        this.cooldownReduction = cooldownReduction;
        this.movementSpeed = movementSpeed;
    }

    // GETTERS \\
    public int getId() {
        return id;
    }
    public double getBaseHealth() {
        return baseHealth;
    }
    public double getBaseHealthRegen() {
        return baseHealthRegen;
    }
    public double getBaseFuel() {
        return baseFuel;
    }
    public double getBaseFuelCharge() {
        return baseFuelCharge;
    }
    public double getPhysicalDamage() {
        return physicalDamage;
    }
    public double getAttackInterval() {
        return attackInterval;
    }
    public double getCriticalChance() {
        return criticalChance;
    }
    public double getElectricalAmplification() {
        return electricalAmplification;
    }
    public double getCooldownReduction() {
        return cooldownReduction;
    }
    public double getMovementSpeed() {
        return movementSpeed;
    }

    // SETTERS \\
    public void setId(int id) {
        this.id = id;
    }
    public void setBaseHealth(double baseHealth) {
        this.baseHealth = baseHealth;
    }
    public void setBaseHealthRegen(double baseHealthRegen) {
        this.baseHealthRegen = baseHealthRegen;
    }
    public void setBaseFuel(double baseFuel) {
        this.baseFuel = baseFuel;
    }
    public void setBaseFuelCharge(double baseFuelCharge) {
        this.baseFuelCharge = baseFuelCharge;
    }
    public void setPhysicalDamage(double physicalDamage) {
        this.physicalDamage = physicalDamage;
    }
    public void setAttackInterval(double attackInterval) {
        this.attackInterval = attackInterval;
    }
    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }
    public void setElectricalAmplification(double electricalAmplification) {
        this.electricalAmplification = electricalAmplification;
    }
    public void setCooldownReduction(double cooldownReduction) {
        this.cooldownReduction = cooldownReduction;
    }
    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public Character() {}
}