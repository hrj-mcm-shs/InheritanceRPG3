package jugar.mcm.edu.ph.inheritancerpg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassSelectionActivity extends AppCompatActivity {

    AnimationDrawable monitorAnimation, mechAnimation, technicianAnimation, androidAnimation, engineerAnimation, mercenaryAnimation, loadingWordAnimation;
    ImageView monitorHost, mechHost, technicianHost, androidHost, engineerHost, mercenaryHost, loadingWordHost;
    ImageView mechBg, technicianBg, androidBg, engineerBg, mercenaryBg;
    ImageView mechInv, technicianInv, androidInv, engineerInv, mercenaryInv;
    TextView mechLabel, technicianLabel, androidLabel, engineerLabel, mercenaryLabel;
    TextView header;

    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_selection);
        hideSystemUI();

        monitorHost = findViewById(R.id.monitor_host);
        monitorHost.setBackgroundResource(R.drawable.monitor_anim);
        monitorAnimation = (AnimationDrawable) monitorHost.getBackground();
        monitorAnimation.start();

        loadingWordHost = findViewById(R.id.loading_word_host);
        loadingWordHost.setBackgroundResource(R.drawable.loading_word_anim);
        loadingWordAnimation = (AnimationDrawable) loadingWordHost.getBackground();
        loadingWordAnimation.start();

        mechHost = findViewById(R.id.alien);
        mechHost.setBackgroundResource(R.drawable.mech_anim);
        mechAnimation = (AnimationDrawable) mechHost.getBackground();

        technicianHost = findViewById(R.id.alienvoy);
        technicianHost.setBackgroundResource(R.drawable.technician_anim);
        technicianAnimation = (AnimationDrawable) technicianHost.getBackground();

        androidHost = findViewById(R.id.aliender);
        androidHost.setBackgroundResource(R.drawable.android_anim);
        androidAnimation = (AnimationDrawable) androidHost.getBackground();

        engineerHost = findViewById(R.id.droidan);
        engineerHost.setBackgroundResource(R.drawable.engineer_anim);
        engineerAnimation = (AnimationDrawable) engineerHost.getBackground();

        mercenaryHost = findViewById(R.id.droider);
        mercenaryHost.setBackgroundResource(R.drawable.mercenary_anim);
        mercenaryAnimation = (AnimationDrawable) mercenaryHost.getBackground();

        mechBg = findViewById(R.id.alien_bg);
        technicianBg = findViewById(R.id.alienvoy_bg);
        androidBg = findViewById(R.id.aliender_bg);
        engineerBg = findViewById(R.id.droidan_bg);
        mercenaryBg = findViewById(R.id.droider_bg);

        mechLabel = findViewById(R.id.alien_label);
        technicianLabel = findViewById(R.id.alienvoy_label);
        androidLabel = findViewById(R.id.aliender_label);
        engineerLabel = findViewById(R.id.droidan_label);
        mercenaryLabel = findViewById(R.id.droider_label);

        mechInv = findViewById(R.id.back_inv);
        technicianInv = findViewById(R.id.alienvoy_inv);
        androidInv = findViewById(R.id.aliender_inv);
        engineerInv = findViewById(R.id.droidan_inv);
        mercenaryInv = findViewById(R.id.droider_inv);

        mechHost.setVisibility(View.GONE);
        technicianHost.setVisibility(View.GONE);
        androidHost.setVisibility(View.GONE);
        engineerHost.setVisibility(View.GONE);
        mercenaryHost.setVisibility(View.GONE);
        mechBg.setVisibility(View.GONE);
        technicianBg.setVisibility(View.GONE);
        androidBg.setVisibility(View.GONE);
        engineerBg.setVisibility(View.GONE);
        mercenaryBg.setVisibility(View.GONE);
        mechInv.setVisibility(View.GONE);
        technicianInv.setVisibility(View.GONE);
        androidInv.setVisibility(View.GONE);
        engineerInv.setVisibility(View.GONE);
        mercenaryInv.setVisibility(View.GONE);
        mechLabel.setVisibility(View.GONE);
        technicianLabel.setVisibility(View.GONE);
        androidLabel.setVisibility(View.GONE);
        engineerLabel.setVisibility(View.GONE);
        mercenaryLabel.setVisibility(View.GONE);

        header = findViewById(R.id.header);
        header.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingWordAnimation.selectDrawable(0);
                loadingWordAnimation.stop();
                loadingWordHost.setVisibility(View.GONE);

                header.setVisibility(View.VISIBLE);

                mechHost.setVisibility(View.VISIBLE);
                technicianHost.setVisibility(View.VISIBLE);
                androidHost.setVisibility(View.VISIBLE);
                engineerHost.setVisibility(View.VISIBLE);
                mercenaryHost.setVisibility(View.VISIBLE);

                mechLabel.setVisibility(View.VISIBLE);
                technicianLabel.setVisibility(View.VISIBLE);
                androidLabel.setVisibility(View.VISIBLE);
                engineerLabel.setVisibility(View.VISIBLE);
                mercenaryLabel.setVisibility(View.VISIBLE);

            }
        },3000);

        mechHost.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        technicianAnimation.selectDrawable(0);
                        androidAnimation.selectDrawable(0);
                        engineerAnimation.selectDrawable(0);
                        mercenaryAnimation.selectDrawable(0);
                        technicianAnimation.stop();
                        androidAnimation.stop();
                        engineerAnimation.stop();
                        mercenaryAnimation.stop();

                        technicianBg.setVisibility(View.GONE);
                        androidBg.setVisibility(View.GONE);
                        engineerBg.setVisibility(View.GONE);
                        mercenaryBg.setVisibility(View.GONE);

                        technicianInv.setVisibility(View.GONE);
                        androidInv.setVisibility(View.GONE);
                        engineerInv.setVisibility(View.GONE);
                        mercenaryInv.setVisibility(View.GONE);

                        mechAnimation.start();
                        mechBg.setVisibility(View.VISIBLE);
                        mechInv.setVisibility(View.VISIBLE);
                    }
                }
        );

        technicianHost.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mechAnimation.selectDrawable(0);
                        androidAnimation.selectDrawable(0);
                        engineerAnimation.selectDrawable(0);
                        mercenaryAnimation.selectDrawable(0);
                        mechAnimation.stop();
                        androidAnimation.stop();
                        engineerAnimation.stop();
                        mercenaryAnimation.stop();

                        mechBg.setVisibility(View.GONE);
                        androidBg.setVisibility(View.GONE);
                        engineerBg.setVisibility(View.GONE);
                        mercenaryBg.setVisibility(View.GONE);


                        mechInv.setVisibility(View.GONE);
                        androidInv.setVisibility(View.GONE);
                        engineerInv.setVisibility(View.GONE);
                        mercenaryInv.setVisibility(View.GONE);

                        technicianAnimation.start();
                        technicianBg.setVisibility(View.VISIBLE);
                        technicianInv.setVisibility(View.VISIBLE);
                    }
                }
        );

        androidHost.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        technicianAnimation.selectDrawable(0);
                        mechAnimation.selectDrawable(0);
                        engineerAnimation.selectDrawable(0);
                        mercenaryAnimation.selectDrawable(0);
                        technicianAnimation.stop();
                        mechAnimation.stop();
                        engineerAnimation.stop();
                        mercenaryAnimation.stop();

                        technicianBg.setVisibility(View.GONE);
                        mechBg.setVisibility(View.GONE);
                        engineerBg.setVisibility(View.GONE);
                        mercenaryBg.setVisibility(View.GONE);

                        mechInv.setVisibility(View.GONE);
                        technicianInv.setVisibility(View.GONE);
                        engineerInv.setVisibility(View.GONE);
                        mercenaryInv.setVisibility(View.GONE);

                        androidAnimation.start();
                        androidBg.setVisibility(View.VISIBLE);
                        androidInv.setVisibility(View.VISIBLE);
                    }
                }
        );

        engineerHost.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        technicianAnimation.selectDrawable(0);
                        androidAnimation.selectDrawable(0);
                        mechAnimation.selectDrawable(0);
                        mercenaryAnimation.selectDrawable(0);
                        technicianAnimation.stop();
                        androidAnimation.stop();
                        mechAnimation.stop();
                        mercenaryAnimation.stop();

                        technicianBg.setVisibility(View.GONE);
                        androidBg.setVisibility(View.GONE);
                        mechBg.setVisibility(View.GONE);
                        mercenaryBg.setVisibility(View.GONE);

                        mechInv.setVisibility(View.GONE);
                        technicianInv.setVisibility(View.GONE);
                        androidInv.setVisibility(View.GONE);
                        mercenaryInv.setVisibility(View.GONE);

                        engineerAnimation.start();
                        engineerBg.setVisibility(View.VISIBLE);
                        engineerInv.setVisibility(View.VISIBLE);
                    }
                }
        );

        mercenaryHost.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        technicianAnimation.selectDrawable(0);
                        androidAnimation.selectDrawable(0);
                        engineerAnimation.selectDrawable(0);
                        mechAnimation.selectDrawable(0);
                        technicianAnimation.stop();
                        androidAnimation.stop();
                        engineerAnimation.stop();
                        mechAnimation.stop();

                        technicianBg.setVisibility(View.GONE);
                        androidBg.setVisibility(View.GONE);
                        engineerBg.setVisibility(View.GONE);
                        mechBg.setVisibility(View.GONE);

                        mechInv.setVisibility(View.GONE);
                        technicianInv.setVisibility(View.GONE);
                        androidInv.setVisibility(View.GONE);
                        engineerInv.setVisibility(View.GONE);

                        mercenaryAnimation.start();
                        mercenaryBg.setVisibility(View.VISIBLE);
                        mercenaryInv.setVisibility(View.VISIBLE);
                    }
                }
        );

        mechInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        monitorAnimation.selectDrawable(0);
                        category = "mech";

                        Intent i = new Intent(ClassSelectionActivity.this, SubclassSelectionActivity.class);
                        i.putExtra("category", category);
                        startActivity(i);
                    }
                }
        );

        technicianInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        monitorAnimation.selectDrawable(0);
                        category = "technician";

                        Intent i = new Intent(ClassSelectionActivity.this, SubclassSelectionActivity.class);
                        i.putExtra("category", category);
                        startActivity(i);
                    }
                }
        );

        androidInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        monitorAnimation.selectDrawable(0);
                        category = "android";

                        Intent i = new Intent(ClassSelectionActivity.this, SubclassSelectionActivity.class);
                        i.putExtra("category", category);
                        startActivity(i);
                    }
                }
        );

        engineerInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        monitorAnimation.selectDrawable(0);
                        category = "engineer";

                        Intent i = new Intent(ClassSelectionActivity.this, SubclassSelectionActivity.class);
                        i.putExtra("category", category);
                        startActivity(i);
                    }
                }
        );

        mercenaryInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        monitorAnimation.selectDrawable(0);
                        category = "mercenary";

                        Intent i = new Intent(ClassSelectionActivity.this, SubclassSelectionActivity.class);
                        i.putExtra("category", category);
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
