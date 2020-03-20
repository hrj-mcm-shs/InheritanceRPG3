package jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.mech;

import jugar.mcm.edu.ph.inheritancerpg3.classes.primary.Mech;

public class Fit extends Mech {
    public Fit(int id, double health, double healthRegen, double fuel, double fuelCharge,
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
