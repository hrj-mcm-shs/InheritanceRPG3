package jugar.mcm.edu.ph.inheritancerpg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable gateOpenAnimation, factoryOneAnimation, factoryTwoAnimation, monitorAnimation;
    ImageView gateHost, factoryOneHost, factoryTwoHost, heroButton, monsterButton, heroButtonDark, monsterButtonDark, monitor;
    TextView heroButtonLabel, monsterButtonLabel;
    Button heroButtonInv, monsterButtonInv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideSystemUI();

        gateHost = findViewById(R.id.gate_host);
        gateHost.setBackgroundResource(R.drawable.gate_open_anim);
        gateOpenAnimation = (AnimationDrawable) gateHost.getBackground();

        factoryOneHost = findViewById(R.id.factory_one_host);
        factoryOneHost.setBackgroundResource(R.drawable.factory_one_anim);
        factoryOneAnimation = (AnimationDrawable) factoryOneHost.getBackground();

        factoryTwoHost = findViewById(R.id.factory_two_host);
        factoryTwoHost.setBackgroundResource(R.drawable.factory_two_anim);
        factoryTwoAnimation = (AnimationDrawable) factoryTwoHost.getBackground();
        factoryTwoHost.setVisibility(View.GONE);

        heroButton = findViewById(R.id.hero_button);
        heroButtonLabel = findViewById(R.id.hero_button_label);
        monsterButton = findViewById(R.id.monster_button);
        monsterButtonLabel = findViewById(R.id.monster_button_label);
        heroButtonDark = findViewById(R.id.hero_button_dark);
        monsterButtonDark = findViewById(R.id.monster_button_dark);
        heroButtonInv = findViewById(R.id.hero_button_inv);
        monsterButtonInv = findViewById(R.id.monster_button_inv);
        heroButton.setVisibility(View.GONE);
        heroButtonLabel.setVisibility(View.GONE);
        monsterButton.setVisibility(View.GONE);
        monsterButtonLabel.setVisibility(View.GONE);
        heroButtonDark. setVisibility(View.GONE);
        monsterButtonDark.setVisibility(View.GONE);
        heroButtonInv.setVisibility(View.GONE);
        monsterButtonInv.setVisibility(View.GONE);

        monitor = findViewById(R.id.monitor);
        monitor.setBackgroundResource(R.drawable.monitor_anim);
        monitorAnimation = (AnimationDrawable) monitor.getBackground();
        monitor.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                gateOpenAnimation.start();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        factoryOneAnimation.start();

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                factoryTwoHost.setVisibility(View.VISIBLE);
                                factoryTwoAnimation.start();

                            }
                        },1500);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                heroButton.setVisibility(View.VISIBLE);
                                heroButtonLabel.setVisibility(View.VISIBLE);
                                monsterButton.setVisibility(View.VISIBLE);
                                monsterButtonLabel.setVisibility(View.VISIBLE);
                                Animation fadeIn = new AlphaAnimation(0, 1);
                                fadeIn.setInterpolator(new DecelerateInterpolator()); //add this
                                fadeIn.setDuration(500);

                                heroButton.startAnimation(fadeIn);
                                heroButtonLabel.startAnimation(fadeIn);
                                monsterButton.startAnimation(fadeIn);
                                monsterButtonLabel.startAnimation(fadeIn);
                                heroButtonInv.setVisibility(View.VISIBLE);
                                monsterButtonInv.setVisibility(View.VISIBLE);

                            }
                        },750);

                    }
                },1500);
            }
        },500);

        heroButtonInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        heroButtonDark.setVisibility(View.VISIBLE);
                        heroButtonLabel.setTextColor(Color.parseColor("#AC7E2C"));

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                heroButtonDark.setVisibility(View.GONE);
                                heroButtonLabel.setTextColor(Color.parseColor("#FFA200"));

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        monitor.setVisibility(View.VISIBLE);
                                        ScaleAnimation zoom = new ScaleAnimation(0.001f, Animation.RELATIVE_TO_SELF, 0.001f, Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                                        zoom.setDuration(1000);
                                        zoom.setFillAfter(true);
                                        monitor.startAnimation(zoom);

                                        new Handler().postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                Intent i = new Intent(MainActivity.this, ClassSelectionActivity.class);
                                                startActivity(i);
                                            }
                                        },1000);
                                    }
                                },1000);
                            }
                        },100);

                    }
                }
        );

        monsterButtonInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        monsterButton.setVisibility(View.VISIBLE);
                        monsterButtonLabel.setTextColor(Color.parseColor("#AC7E2C"));

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                monsterButtonDark.setVisibility(View.GONE);
                                monsterButtonLabel.setTextColor(Color.parseColor("#FFA200"));

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        monitor.setVisibility(View.VISIBLE);
                                        ScaleAnimation zoom = new ScaleAnimation(0.001f, Animation.RELATIVE_TO_SELF, 0.001f, Animation.RELATIVE_TO_SELF, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                                        zoom.setDuration(1000);
                                        zoom.setFillAfter(true);
                                        monitor.startAnimation(zoom);

                                        new Handler().postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                Intent i = new Intent(MainActivity.this, MonsterSelectionActivity.class);
                                                startActivity(i);
                                            }
                                        },1500);

                                    }
                                },1000);

                            }
                        },100);

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
