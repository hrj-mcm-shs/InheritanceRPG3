package jugar.mcm.edu.ph.inheritancerpg3.classes;

public class Hero extends Character {
    // HERO-EXCLUSIVE STATS \\
    private int heroLevel;
    private String heroClass;
    private double heroXp;

    private double healthGrowth;
    private double healthRegenGrowth;
    private double fuelGrowth;
    private double fuelChargeGrowth;

    private double physicalDamageGrowth;

    private double electricalAmplificationGrowth;
    private double cooldownReductionGrowth;

    // CONSTRUCTOR \\
    public Hero(int id, double health, double healthRegen, double fuel, double fuelCharge,
                double physicalDamage, double attackSpeed, double criticalChance,
                double electricalAmplification, double cooldownReduction, double movementSpeed,
                int heroLevel, String heroClass, int heroXp,
                double healthGrowth, double healthRegenGrowth, double fuelGrowth, double fuelChargeGrowth,
                double physicalDamageGrowth,
                double electricalAmplificationGrowth, double cooldownReductionGrowth) {

        super(id, health, healthRegen, fuel, fuelCharge,
                physicalDamage, attackSpeed, criticalChance,
                electricalAmplification, cooldownReduction, movementSpeed);

        this.heroLevel = heroLevel;
        this.heroClass = heroClass;
        this.heroXp = heroXp;

        this.healthGrowth = healthGrowth;
        this.healthRegenGrowth = healthRegenGrowth;
        this.fuelGrowth = fuelGrowth;
        this.fuelChargeGrowth = fuelChargeGrowth;

        this.physicalDamageGrowth = physicalDamageGrowth;

        this.electricalAmplificationGrowth = electricalAmplificationGrowth;
        this.cooldownReductionGrowth = cooldownReductionGrowth;
    }

    // CHARACTER GETTERS \\
    public int getId() {
        return super.getId();
    }
    public double getBaseHealth() {
        return super.getBaseHealth();
    }
    public double getBaseHealthRegen() {
        return super.getBaseHealthRegen();
    }
    public double getBaseFuel() {
        return super.getBaseFuel();
    }
    public double getBaseFuelCharge() {
        return super.getBaseFuelCharge();
    }
    public double getPhysicalDamage() {
        return super.getPhysicalDamage();
    }
    public double getAttackInterval() {
        return super.getAttackInterval();
    }
    public double getCriticalChance() {
        return super.getCriticalChance();
    }
    public double getElectricalAmplification() {
        return super.getElectricalAmplification();
    }
    public double getCooldownReduction() {
        return super.getCooldownReduction();
    }
    public double getMovementSpeed() {
        return super.getMovementSpeed();
    }

    // CHARACTER SETTERS \\
    public void setId(int id) {
        super.setId(id);
    }
    public void setBaseHealth(double baseHealth) {
        super.setBaseHealth(baseHealth);
    }
    public void setBaseHealthRegen(double baseHealthRegen) {
        super.setBaseHealthRegen(baseHealthRegen);
    }
    public void setBaseFuel(double baseFuel) {
        super.setBaseFuel(baseFuel);
    }
    public void setBaseFuelCharge(double baseFuelCharge) {
        super.setBaseFuelCharge(baseFuelCharge);
    }
    public void setPhysicalDamage(double physicalDamage) {
        super.setPhysicalDamage(physicalDamage);
    }
    public void setAttackInterval(double attackInterval) {
        super.setAttackInterval(attackInterval);
    }
    public void setCriticalChance(double criticalChance) {
        super.setCriticalChance(criticalChance);
    }
    public void setElectricalAmplification(double electricalAmplification) {
        super.setElectricalAmplification(electricalAmplification);
    }
    public void setCooldownReduction(double cooldownReduction) {
        super.setCooldownReduction(cooldownReduction);
    }
    public void setMovementSpeed(double movementSpeed) {
        super.setMovementSpeed(movementSpeed);
    }

    // HERO-EXCLUSIVE GETTERS \\
    public int getHeroLevel() {
        return heroLevel;
    }
    public String getHeroClass() {
        return heroClass;
    }
    public double getHeroXp() {
        return heroXp;
    }

    public double getHealthGrowth() {
        return healthGrowth;
    }
    public double getHealthRegenGrowth() {
        return healthRegenGrowth;
    }
    public double getFuelGrowth() {
        return fuelGrowth;
    }
    public double getFuelChargeGrowth() {
        return fuelChargeGrowth;
    }

    public double getPhysicalDamageGrowth() {
        return physicalDamageGrowth;
    }

    public double getElectricalAmplificationGrowth() {
        return electricalAmplificationGrowth;
    }
    public double getCooldownReductionGrowth() {
        return cooldownReductionGrowth;
    }

    // HERO-EXCLUSIVE SETTERS \\
    public void setHeroLevel(int heroLevel) {
        this.heroLevel = heroLevel;
    }
    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }
    public void setHeroXp(double heroXp) {
        this.heroXp = heroXp;
    }

    public void setHealthGrowth(double healthGrowth) {
        this.healthGrowth = healthGrowth;
    }
    public void setHealthRegenGrowth(double healthRegenGrowth) {
        this.healthRegenGrowth = healthRegenGrowth;
    }
    public void setFuelGrowth(double fuelGrowth) {
        this.fuelGrowth = fuelGrowth;
    }
    public void setFuelChargeGrowth(double fuelChargeGrowth) {
        this.fuelChargeGrowth = fuelChargeGrowth;
    }

    public void setPhysicalDamageGrowth(double physicalDamageGrowth) {
        this.physicalDamageGrowth = physicalDamageGrowth;
    }

    public void setElectricalAmplificationGrowth(double electricalAmplificationGrowth) {
        this.electricalAmplificationGrowth = electricalAmplificationGrowth;
    }
    public void setCooldownReductionGrowth(double cooldownReductionGrowth) {
        this.cooldownReductionGrowth = cooldownReductionGrowth;
    }

    // METHODS AND FORMULAS \\
    public double healthWithGrowth() { return super.getBaseHealth() + (getHealthGrowth() * getHeroLevel()); }
    public double healthRegenWithGrowth() { return super.getBaseHealthRegen() + (getHealthRegenGrowth() * getHeroLevel()); }
    public double fuelWithGrowth() { return super.getBaseFuel() + (getFuelGrowth() * getHeroLevel()); }
    public double fuelChargeWithGrowth() { return super.getBaseFuelCharge() + (getFuelChargeGrowth() * getHeroLevel()); }

    public double physicalDamageWithGrowth() { return super.getPhysicalDamage() + (getPhysicalDamageGrowth() * getHeroLevel()); }

    public double electricalDamageWithGrowth() { return super.getElectricalAmplification() + (getElectricalAmplificationGrowth() * getHeroLevel()); }
    public double cooldownReductionWithGrowth() { return  super.getCooldownReduction() + (getCooldownReductionGrowth() * getHeroLevel()); }

    public Hero() {}
}
