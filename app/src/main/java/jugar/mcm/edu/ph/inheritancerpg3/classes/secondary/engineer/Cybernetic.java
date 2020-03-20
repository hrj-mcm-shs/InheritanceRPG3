package jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.engineer;

import jugar.mcm.edu.ph.inheritancerpg3.classes.primary.Engineer;

public class Cybernetic extends Engineer {
    public Cybernetic(int id, double health, double healthRegen, double fuel, double fuelCharge,
               double physicalDamage, double attackSpeed, double criticalChance,
               double electricalAmplification, double cooldownReduction, double movementSpeed,
               int heroLevel, String heroClass, int heroXp,
               double healthGrowth, double healthRegenGrowth, double fuelGrowth, double fuelChargeGrowth,
               double physicalDamageGrowth,
               double electricalAmplificationGrowth, double cooldownReductionGrowth) {
        super(id, health, healthRegen, fuel, fuelCharge,
                physicalDamage, attackSpeed, criticalChance,
                electricalAmplification, cooldownReduction, movementSpeed,
                heroLevel, heroClass, heroXp,
                healthGrowth, healthRegenGrowth, fuelGrowth, fuelChargeGrowth,
                physicalDamageGrowth,
                electricalAmplificationGrowth, cooldownReductionGrowth);
    }
}
