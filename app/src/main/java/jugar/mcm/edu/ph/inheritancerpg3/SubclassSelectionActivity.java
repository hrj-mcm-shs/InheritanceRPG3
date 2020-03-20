package jugar.mcm.edu.ph.inheritancerpg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SubclassSelectionActivity extends AppCompatActivity {

    AnimationDrawable monitorAnimation, loadingWordAnimation, subclassOneAnimation, subclassTwoAnimation;
    ImageView monitorHost, loadingWordHost, subclassOneHost, subclassTwoHost;
    ImageView subclassOneBg, subclassTwoBg, subclassOneInv, subclassTwoInv;
    TextView subclassOneLabel, subclassTwoLabel;
    TextView header;

    String subclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subclass_selection);
        hideSystemUI();

        monitorHost = findViewById(R.id.monitor_host);
        monitorHost.setBackgroundResource(R.drawable.monitor_anim);
        monitorAnimation = (AnimationDrawable) monitorHost.getBackground();
        monitorAnimation.start();

        loadingWordHost = findViewById(R.id.loading_word_host);
        loadingWordHost.setBackgroundResource(R.drawable.loading_word_anim);
        loadingWordAnimation = (AnimationDrawable) loadingWordHost.getBackground();
        loadingWordAnimation.start();

        subclassOneHost = findViewById(R.id.character_host);
        subclassTwoHost = findViewById(R.id.subclass2_host);

        subclassOneLabel = findViewById(R.id.subclass1_label);
        subclassTwoLabel = findViewById(R.id.subclass2_label);
        header = findViewById(R.id.header);

        subclassOneBg = findViewById(R.id.subclass1_bg);
        subclassTwoBg = findViewById(R.id.subclass2_bg);

        subclassOneInv = findViewById(R.id.subclass1_inv);
        subclassTwoInv = findViewById(R.id.subclass2_inv);

        final String category = getIntent().getStringExtra("category");

        if (category.equals("mech")) {
            subclassOneLabel.setText("HEAVY");
            subclassTwoLabel.setText("FIT");

            subclassOneHost.setBackgroundResource(R.drawable.heavy_mech_anim);
            subclassOneAnimation = (AnimationDrawable) subclassOneHost.getBackground();

            subclassTwoHost.setBackgroundResource(R.drawable.fit_mech_anim);
            subclassTwoAnimation = (AnimationDrawable) subclassTwoHost.getBackground();
        } else if (category.equals("technician")) {
            subclassOneLabel.setText("COMBAT MEDIC");
            subclassTwoLabel.setText("DESYNCHRO");

            subclassOneHost.setBackgroundResource(R.drawable.combat_medic_anim);
            subclassOneAnimation = (AnimationDrawable) subclassOneHost.getBackground();

            subclassTwoHost.setBackgroundResource(R.drawable.desynchronizer_anim);
            subclassTwoAnimation = (AnimationDrawable) subclassTwoHost.getBackground();
        } else if (category.equals("android")) {
            subclassOneLabel.setText("ELECTRO");
            subclassTwoLabel.setText("VOLTAGE");

            subclassOneHost.setBackgroundResource(R.drawable.electro_anim);
            subclassOneAnimation = (AnimationDrawable) subclassOneHost.getBackground();

            subclassTwoHost.setBackgroundResource(R.drawable.voltage_anim);
            subclassTwoAnimation = (AnimationDrawable) subclassTwoHost.getBackground();
        } else if (category.equals("engineer")) {
            subclassOneLabel.setText("TECHNOMANCER");
            subclassTwoLabel.setText("CYBERNETIC");

            subclassOneHost.setBackgroundResource(R.drawable.technomancer_anim);
            subclassOneAnimation = (AnimationDrawable) subclassOneHost.getBackground();

            subclassTwoHost.setBackgroundResource(R.drawable.cybernetic_anim);
            subclassTwoAnimation = (AnimationDrawable) subclassTwoHost.getBackground();
        } else if (category.equals("mercenary")) {
            subclassOneLabel.setText("HACKER");
            subclassTwoLabel.setText("HITMAN");

            subclassOneHost.setBackgroundResource(R.drawable.hacker_anim);
            subclassOneAnimation = (AnimationDrawable) subclassOneHost.getBackground();

            subclassTwoHost.setBackgroundResource(R.drawable.hitman_anim);
            subclassTwoAnimation = (AnimationDrawable) subclassTwoHost.getBackground();
        }

        subclassOneHost.setVisibility(View.GONE);
        subclassTwoHost.setVisibility(View.GONE);
        subclassOneLabel.setVisibility(View.GONE);
        subclassTwoLabel.setVisibility(View.GONE);
        header.setVisibility(View.GONE);
        subclassOneBg.setVisibility(View.GONE);
        subclassTwoBg.setVisibility(View.GONE);
        subclassOneInv.setVisibility(View.GONE);
        subclassTwoInv.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingWordAnimation.selectDrawable(0);
                loadingWordAnimation.stop();
                loadingWordHost.setVisibility(View.GONE);

                header.setVisibility(View.VISIBLE);

                subclassOneHost.setVisibility(View.VISIBLE);
                subclassTwoHost.setVisibility(View.VISIBLE);

                subclassOneLabel.setVisibility(View.VISIBLE);
                subclassTwoLabel.setVisibility(View.VISIBLE);
            }
        },3000);

        subclassOneHost.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        subclassTwoAnimation.selectDrawable(0);
                        subclassTwoAnimation.stop();

                        subclassTwoBg.setVisibility(View.GONE);
                        subclassTwoInv.setVisibility(View.GONE);

                        subclassOneAnimation.start();
                        subclassOneBg.setVisibility(View.VISIBLE);
                        subclassOneInv.setVisibility(View.VISIBLE);
                    }
                }
        );

        subclassTwoHost.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        subclassOneAnimation.selectDrawable(0);
                        subclassOneAnimation.stop();

                        subclassOneBg.setVisibility(View.GONE);
                        subclassOneInv.setVisibility(View.GONE);

                        subclassTwoAnimation.start();
                        subclassTwoBg.setVisibility(View.VISIBLE);
                        subclassTwoInv.setVisibility(View.VISIBLE);
                    }
                }
        );

        subclassOneInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (category.equals("mech")) {
                            subclass = "heavy";
                        } else if (category.equals("technician")) {
                            subclass = "desynchronizer";
                        } else if (category.equals("android")) {
                            subclass = "electro";
                        } else if (category.equals("engineer")) {
                            subclass = "technomancer";
                        } else if (category.equals("mercenary")) {
                            subclass = "hacker";
                        }

                        monitorAnimation.selectDrawable(0);

                        Intent i = new Intent(SubclassSelectionActivity.this, ResultsActivity.class);
                        i.putExtra("subclass", subclass);
                        startActivity(i);
                    }
                }
        );

        subclassTwoInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (category.equals("mech")) {
                            subclass = "fit";
                        } else if (category.equals("technician")) {
                            subclass = "combatmedic";
                        } else if (category.equals("android")) {
                            subclass = "voltage";
                        } else if (category.equals("engineer")) {
                            subclass = "cybernetic";
                        } else if (category.equals("mercenary")) {
                            subclass = "hitman";
                        }

                        monitorAnimation.selectDrawable(0);

                        Intent i = new Intent(SubclassSelectionActivity.this, ResultsActivity.class);
                        i.putExtra("subclass", subclass);
                        startActivity(i);
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
