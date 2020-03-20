package jugar.mcm.edu.ph.inheritancerpg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    AnimationDrawable tabletAnimation, loadingWordAnimation, gateCloseAnimation;
    ImageView tabletHost, loadingWordHost, gateHost, gateHost2;
    ImageView title, button, buttonDark;
    Button buttonInv;
    TextView buttonLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        hideSystemUI();

        tabletHost = findViewById(R.id.tablet_host);
        tabletHost.setBackgroundResource(R.drawable.tablet_anim);
        tabletAnimation = (AnimationDrawable) tabletHost.getBackground();
        tabletAnimation.start();

        loadingWordHost = findViewById(R.id.loading_word_host);
        loadingWordHost.setBackgroundResource(R.drawable.loading_word_anim);
        loadingWordAnimation = (AnimationDrawable) loadingWordHost.getBackground();
        loadingWordAnimation.start();

        gateHost = findViewById(R.id.gate_host);
        gateHost.setBackgroundResource(R.drawable.gate_close_anim);
        gateCloseAnimation = (AnimationDrawable) gateHost.getBackground();

        title = findViewById(R.id.title);
        button = findViewById(R.id.button);
        buttonDark = findViewById(R.id.button_dark);
        buttonInv = findViewById(R.id.button_inv);
        buttonLabel = findViewById(R.id.button_label);
        buttonDark.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                tabletAnimation.selectDrawable(0);
                tabletAnimation.stop();
                loadingWordAnimation.selectDrawable(0);
                loadingWordAnimation.stop();
                loadingWordHost.setVisibility(View.GONE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        gateCloseAnimation.start();

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                tabletHost.setVisibility(View.GONE);
                                moveTitle(title);
                                moveButton(button);
                                moveButton(buttonLabel);

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        button.setVisibility(View.GONE);
                                        buttonLabel.setVisibility(View.GONE);
                                    }
                                },1450);
                            }
                        },1300);
                    }
                },1000);
            }
        },5100);

        buttonInv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonDark.setVisibility(View.VISIBLE);
                        buttonLabel.setTextColor(Color.parseColor("#AC7E2C"));

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                buttonDark.setVisibility(View.GONE);
                                buttonLabel.setTextColor(Color.parseColor("#FFA200"));

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                                        startActivity(i);
                                    }
                                },1000);
                            }
                        },100);


                    }
                }
        );

    }

    public void moveTitle(View v) {
        Animation img = new TranslateAnimation(Animation.ABSOLUTE, Animation.ABSOLUTE, Animation.ABSOLUTE, 396);
        img.setDuration(1450);
        img.setFillAfter(true);

        v.startAnimation(img);
    }

    public void moveButton(View v) {
        Animation img = new TranslateAnimation(Animation.ABSOLUTE, Animation.ABSOLUTE, Animation.ABSOLUTE, -396);
        img.setDuration(1450);
        img.setFillAfter(true);

        v.startAnimation(img);
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
