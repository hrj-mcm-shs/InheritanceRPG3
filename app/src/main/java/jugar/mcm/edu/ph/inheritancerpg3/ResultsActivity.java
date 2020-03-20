package jugar.mcm.edu.ph.inheritancerpg3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import jugar.mcm.edu.ph.inheritancerpg3.classes.primary.Technician;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.android.Electro;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.android.Voltage;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.engineer.Cybernetic;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.engineer.Technomancer;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.mech.Fit;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.mech.Heavy;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.mercenary.Hacker;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.mercenary.Hitman;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.technician.CombatMedic;
import jugar.mcm.edu.ph.inheritancerpg3.classes.secondary.technician.Desynchronizer;

public class ResultsActivity extends AppCompatActivity {

    AnimationDrawable monitorAnimation, loadingWordAnimation, characterAnimation;
    ImageView monitorHost, loadingWordHost, characterHost;
    ImageView statHealth, statFuel, statEnergy, statPhysical;
    TextView levelLabel, subclassLabel;
    TextView healthLabel, healthRegenLabel, fuelLabel, fuelChargeLabel, electricalAmpLabel, cooldownReducLabel;
    TextView physicalDamageLabel, attackIntervalLabel, criticalChanceLabel, movementSpeedLabel;
    TextView healthRegenLabelTwo, fuelChargeLabelTwo, electricalAmpLabelTwo, cooldownReducLabelTwo, criticalChanceLabelTwo;
    TextView health, healthRegen, fuel, fuelCharge, electricalAmp, cooldownReduc, physicalDamage, attackInterval, criticalChance, movementSpeed;
    EditText heroLevelInput;
    TextView levelConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        hideSystemUI();

        monitorHost = findViewById(R.id.monitor_host);
        monitorHost.setBackgroundResource(R.drawable.monitor_anim);
        monitorAnimation = (AnimationDrawable) monitorHost.getBackground();
        monitorAnimation.start();

        loadingWordHost = findViewById(R.id.loading_word_host);
        loadingWordHost.setBackgroundResource(R.drawable.loading_word_anim);
        loadingWordAnimation = (AnimationDrawable) loadingWordHost.getBackground();
        loadingWordAnimation.start();

        characterHost = findViewById(R.id.character_host);


        health = findViewById(R.id.health);
        healthRegen = findViewById(R.id.health_regen);
        fuel = findViewById(R.id.fuel);
        fuelCharge = findViewById(R.id.fuel_charge);
        electricalAmp = findViewById(R.id.electrical_amp);
        cooldownReduc = findViewById(R.id.cooldown_reduc);
        physicalDamage = findViewById(R.id.physical_damage);
        attackInterval = findViewById(R.id.attack_interval);
        criticalChance = findViewById(R.id.critical_chance);
        movementSpeed = findViewById(R.id.movement_speed);
        heroLevelInput = findViewById(R.id.input_level);

        levelConfirm = findViewById(R.id.level_confirm);

        // DESIGNS ONLY \\
        levelLabel = findViewById(R.id.level_label);
        subclassLabel = findViewById(R.id.subclass);
        statHealth = findViewById(R.id.stat_heart);
        statFuel = findViewById(R.id.stat_fuel);
        statEnergy = findViewById(R.id.stat_energy);
        statPhysical = findViewById(R.id.stat_physical);

        healthLabel = findViewById(R.id.health_label);
        healthRegenLabel = findViewById(R.id.health_regen_label);
        fuelLabel = findViewById(R.id.fuel_label);
        fuelChargeLabel =findViewById(R.id.fuel_charge_label);
        electricalAmpLabel = findViewById(R.id.electrical_amp_label);
        cooldownReducLabel = findViewById(R.id.cooldown_reduc_label);
        physicalDamageLabel = findViewById(R.id.physical_damage_label);
        attackIntervalLabel = findViewById(R.id.attack_interval_label);
        criticalChanceLabel = findViewById(R.id.critical_chance_label);
        movementSpeedLabel = findViewById(R.id.movement_speed_label);

        healthRegenLabelTwo = findViewById(R.id.health_regen_label2);
        fuelChargeLabelTwo = findViewById(R.id.fuel_charge_label2);
        electricalAmpLabelTwo = findViewById(R.id.electrical_amp_label2);
        cooldownReducLabelTwo = findViewById(R.id.cooldown_reduc_label2);
        criticalChanceLabelTwo = findViewById(R.id.critical_chance_label2);
        // DESIGNS ONLY END \\

        // VIEW GONE STUFF \\
        characterHost.setVisibility(View.GONE);
        health.setVisibility(View.GONE);
        healthRegen.setVisibility(View.GONE);
        fuel.setVisibility(View.GONE);
        fuelCharge.setVisibility(View.GONE);
        electricalAmp.setVisibility(View.GONE);
        cooldownReduc.setVisibility(View.GONE);
        physicalDamage.setVisibility(View.GONE);
        attackInterval.setVisibility(View.GONE);
        criticalChance.setVisibility(View.GONE);
        movementSpeed.setVisibility(View.GONE);
        heroLevelInput.setVisibility(View.GONE);
        levelConfirm.setVisibility(View.GONE);

        levelLabel.setVisibility(View.GONE);
        subclassLabel.setVisibility(View.GONE);
        statHealth.setVisibility(View.GONE);
        statPhysical.setVisibility(View.GONE);
        statFuel.setVisibility(View.GONE);
        statEnergy.setVisibility(View.GONE);
        statPhysical.setVisibility(View.GONE);
        healthLabel.setVisibility(View.GONE);
        healthRegenLabel.setVisibility(View.GONE);
        fuelLabel.setVisibility(View.GONE);
        fuelChargeLabel.setVisibility(View.GONE);
        electricalAmpLabel.setVisibility(View.GONE);
        cooldownReducLabel.setVisibility(View.GONE);
        physicalDamageLabel.setVisibility(View.GONE);
        attackIntervalLabel.setVisibility(View.GONE);
        criticalChanceLabel.setVisibility(View.GONE);
        movementSpeedLabel.setVisibility(View.GONE);
        healthRegenLabelTwo.setVisibility(View.GONE);
        fuelChargeLabelTwo.setVisibility(View.GONE);
        electricalAmpLabelTwo.setVisibility(View.GONE);
        cooldownReducLabelTwo.setVisibility(View.GONE);
        criticalChanceLabelTwo.setVisibility(View.GONE);
        // VIEW GONE STUFF END \\

        int heroLevel = Integer.parseInt(String.valueOf(heroLevelInput.getText()));
        final String subclass = getIntent().getStringExtra("subclass");

        if(subclass.equals("heavy")) {
            Heavy hero = new Heavy(1, 450, 7.5, 200, 2.5,
                    20, 0.88, 0,
                    0, 0.1, 5,
                    heroLevel, subclass, 50,
                    50, 0.25, 10, 0.025,
                    5, 0, 0);
            subclassLabel.setText("HEAVY");
            characterHost.setBackgroundResource(R.drawable.heavy_mech_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("fit")) {
            Fit hero = new Fit(2, 350, 8.25, 200, 2.5,
                    7.5, 0.92, 0,
                    0, 0.1, 8.25,
                    heroLevel, subclass, 50,
                    40, 0.30, 10, 0.025,
                    5, 0 ,0);
            subclassLabel.setText("FIT");
            characterHost.setBackgroundResource(R.drawable.fit_mech_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("combatmedic")) {
            CombatMedic hero = new CombatMedic(3, 350, 6.25, 300, 10,
                    7.5,0.92,0,
                    0.225,0.2625,5,
                    heroLevel, subclass, 50,
                    15, 0.075,25,0.1,
                    2, 0.01, 0);
            subclassLabel.setText("COMBAT MEDIC");
            characterHost.setBackgroundResource(R.drawable.combat_medic_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("desynchronizer")) {
            Desynchronizer hero = new Desynchronizer(4, 150, 2.5, 250, 10,
                    7.5, 0.92, 0,
                    0.45, 0.4, 9,
                    heroLevel, subclass, 50,
                    10, 0.025, 20, .1,
                    2, 0.03, 0);
            subclassLabel.setText("DESYNCHRONIZER");
            characterHost.setBackgroundResource(R.drawable.desynchronizer_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("electro")) {
            Electro hero = new Electro(5, 150, 2.5, 325, 9,
                    7.5, 0.96,0,
                    0.45,0.4, 7.5,
                    heroLevel, subclass, 50,
                    10,0.025,27.5,0.085,
                    2,0.03, 0);
            subclassLabel.setText("ELECTRO");
            characterHost.setBackgroundResource(R.drawable.electro_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("voltage")) {
            Voltage hero = new Voltage(6, 150, 2.5, 350, 8,
                    7.5, 0.96, 0,
                    0.8, 0.25, 5,
                    heroLevel, subclass, 50,
                    10, 0.025, 30, 0.0725,
                    2, 0.06, 0);
            subclassLabel.setText("VOLTAGE");
            characterHost.setBackgroundResource(R.drawable.voltage_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("technomancer")) {
            Technomancer hero = new Technomancer(7, 350, 2.5, 500, 10,
                    7.5, 0.92, 0,
                    0.15, 0.25, 5,
                    heroLevel, subclass, 50,
                    15, 0.025, 40, 0.1,
                    2, 0.01, 0);
            subclassLabel.setText("TECHNOMANCER");
            characterHost.setBackgroundResource(R.drawable.technomancer_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("cybernetic")) {
            Cybernetic hero = new Cybernetic(8, 150, 2.5, 300, 10,
                    7.5, 0.92, 0,
                    0.40, 0.325, 9,
                    heroLevel, subclass, 50,
                    10, 0.025, 20, 0.0575,
                    2, 0.2625, 0);
            subclassLabel.setText("CYBERNETIC");
            characterHost.setBackgroundResource(R.drawable.cybernetic_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("hacker")) {
            Hacker hero = new Hacker(9, 150, 3, 150, 3.5,
                    30, 0.75, 0.2,
                    0, 0, 9,
                    heroLevel, subclass, 50,
                    10, 0.04, 10, 0.025,
                    8, 0, 0);
            subclassLabel.setText("HACKER");
            characterHost.setBackgroundResource(R.drawable.hacker_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        } else if (subclass.equals("hitman")) {
            Hitman hero = new Hitman(10, 150, 3, 150, 3.5,
                    22.5, 0.6, 0.135,
                    0, 0, 8.75,
                    heroLevel, subclass, 50,
                    10, 0.04, 10, 0.025,
                    6.25, 0, 0);
            subclassLabel.setText("HITMAN");
            characterHost.setBackgroundResource(R.drawable.hitman_anim);
            characterAnimation = (AnimationDrawable) characterHost.getBackground();
            characterAnimation.start();

            health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
            healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
            fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
            fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
            physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
            attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
            criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
            electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
            cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
            movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingWordAnimation.selectDrawable(0);
                loadingWordAnimation.stop();
                loadingWordHost.setVisibility(View.GONE);

                // VIEW VISIBLE STUFF \\
                characterHost.setVisibility(View.VISIBLE);
                health.setVisibility(View.VISIBLE);
                healthRegen.setVisibility(View.VISIBLE);
                fuel.setVisibility(View.VISIBLE);
                fuelCharge.setVisibility(View.VISIBLE);
                electricalAmp.setVisibility(View.VISIBLE);
                cooldownReduc.setVisibility(View.VISIBLE);
                physicalDamage.setVisibility(View.VISIBLE);
                attackInterval.setVisibility(View.VISIBLE);
                criticalChance.setVisibility(View.VISIBLE);
                movementSpeed.setVisibility(View.VISIBLE);
                heroLevelInput.setVisibility(View.VISIBLE);
                levelConfirm.setVisibility(View.VISIBLE);

                levelLabel.setVisibility(View.VISIBLE);
                subclassLabel.setVisibility(View.VISIBLE);
                statPhysical.setVisibility(View.VISIBLE);
                statHealth.setVisibility(View.VISIBLE);
                statFuel.setVisibility(View.VISIBLE);
                statEnergy.setVisibility(View.VISIBLE);
                statPhysical.setVisibility(View.VISIBLE);
                healthLabel.setVisibility(View.VISIBLE);
                healthRegenLabel.setVisibility(View.VISIBLE);
                fuelLabel.setVisibility(View.VISIBLE);
                fuelChargeLabel.setVisibility(View.VISIBLE);
                electricalAmpLabel.setVisibility(View.VISIBLE);
                cooldownReducLabel.setVisibility(View.VISIBLE);
                physicalDamageLabel.setVisibility(View.VISIBLE);
                attackIntervalLabel.setVisibility(View.VISIBLE);
                criticalChanceLabel.setVisibility(View.VISIBLE);
                movementSpeedLabel.setVisibility(View.VISIBLE);
                healthRegenLabelTwo.setVisibility(View.VISIBLE);
                fuelChargeLabelTwo.setVisibility(View.VISIBLE);
                electricalAmpLabelTwo.setVisibility(View.VISIBLE);
                cooldownReducLabelTwo.setVisibility(View.VISIBLE);
                criticalChanceLabelTwo.setVisibility(View.VISIBLE);
                // VIEW VISIBLE STUFF END \\
            }
        },3000);

        levelConfirm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int heroLevel = Integer.parseInt(String.valueOf(heroLevelInput.getText()));

                        if((heroLevel < 1) || (heroLevel > 50)) {
                            Toast.makeText(ResultsActivity.this, "Invalid level value. Levels are only from 1-50.", Toast.LENGTH_SHORT).show();
                        } else {
                            if(subclass.equals("heavy")) {
                                Heavy hero = new Heavy(1, 450, 7.5, 200, 2.5,
                                        20, 0.88, 0,
                                        0, 0.1, 5,
                                        heroLevel, subclass, 50,
                                        50, 0.25, 10, 0.025,
                                        5, 0, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("fit")) {
                                Fit hero = new Fit(2, 350, 8.25, 200, 2.5,
                                        7.5, 0.92, 0,
                                        0, 0.1, 8.25,
                                        heroLevel, subclass, 50,
                                        40, 0.30, 10, 0.025,
                                        5, 0 ,0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("combatmedic")) {
                                CombatMedic hero = new CombatMedic(3, 350, 6.25, 300, 10,
                                        7.5,0.92,0,
                                        0.225,0.2625,5,
                                        heroLevel, subclass, 50,
                                        15, 0.075,25,0.1,
                                        2, 0.01, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("desynchronizer")) {
                                Desynchronizer hero = new Desynchronizer(4, 150, 2.5, 250, 10,
                                        7.5, 0.92, 0,
                                        0.45, 0.4, 9,
                                        heroLevel, subclass, 50,
                                        10, 0.025, 20, .1,
                                        2, 0.03, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("electro")) {
                                Electro hero = new Electro(5, 150, 2.5, 325, 9,
                                        7.5, 0.96,0,
                                        0.45,0.4, 7.5,
                                        heroLevel, subclass, 50,
                                        10,0.025,27.5,0.085,
                                        2,0.03, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("voltage")) {
                                Voltage hero = new Voltage(6, 150, 2.5, 350, 8,
                                        7.5, 0.96, 0,
                                        0.8, 0.25, 5,
                                        heroLevel, subclass, 50,
                                        10, 0.025, 30, 0.0725,
                                        2, 0.06, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("technomancer")) {
                                Technomancer hero = new Technomancer(7, 350, 2.5, 500, 10,
                                        7.5, 0.92, 0,
                                        0.15, 0.25, 5,
                                        heroLevel, subclass, 50,
                                        15, 0.025, 40, 0.1,
                                        2, 0.01, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("cybernetic")) {
                                Cybernetic hero = new Cybernetic(8, 150, 2.5, 300, 10,
                                        7.5, 0.92, 0,
                                        0.40, 0.325, 9,
                                        heroLevel, subclass, 50,
                                        10, 0.025, 20, 0.0575,
                                        2, 0.2625, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("hacker")) {
                                Hacker hero = new Hacker(9, 150, 3, 150, 3.5,
                                        30, 0.75, 0.2,
                                        0, 0, 9,
                                        heroLevel, subclass, 50,
                                        10, 0.04, 10, 0.025,
                                        8, 0, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            } else if (subclass.equals("hitman")) {
                                Hitman hero = new Hitman(10, 150, 3, 150, 3.5,
                                        22.5, 0.6, 0.135,
                                        0, 0, 8.75,
                                        heroLevel, subclass, 50,
                                        10, 0.04, 10, 0.025,
                                        6.25, 0, 0);

                                health.setText(String.valueOf(Math.round(hero.healthWithGrowth())));
                                healthRegen.setText(String.valueOf(Math.round(hero.healthRegenWithGrowth())));
                                fuel.setText(String.valueOf(Math.round(hero.fuelWithGrowth())));
                                fuelCharge.setText(String.valueOf(Math.round(hero.fuelChargeWithGrowth())));
                                physicalDamage.setText(String.valueOf(Math.round(hero.physicalDamageWithGrowth())));
                                attackInterval.setText(String.valueOf(Math.round(hero.getAttackInterval())));
                                criticalChance.setText(String.valueOf(Math.round(hero.getCriticalChance())));
                                electricalAmp.setText(String.valueOf(Math.round(hero.electricalDamageWithGrowth()*100)));
                                cooldownReduc.setText(String.valueOf(Math.round(hero.cooldownReductionWithGrowth()*100)));
                                movementSpeed.setText(String.valueOf(Math.round(hero.getMovementSpeed())));
                            }
                        }


                    }
                }
        );
    }

    public void hideSystemUI() {
        // Set the IMMERSIVE flag.
        // Set the content to appear under the system bars so that the content
        // doesn't resize when the system bars hide and show.
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}
