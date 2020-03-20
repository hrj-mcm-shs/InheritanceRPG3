package jugar.mcm.edu.ph.inheritancerpg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MonsterSelectionActivity extends AppCompatActivity {

    AnimationDrawable monitorAnimation, loadingWordAnimation;
    ImageView monitorHost, loadingWordHost;
    ImageView alien, alienvoy, aliender, droidan, droider;
    ImageView alienBg, alienvoyBg, alienderBg, droidanBg, droiderBg;
    TextView alienLabel, alienvoyLabel, alienderLabel, droidanLabel, droiderLabel;
    TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monster_selection);
        hideSystemUI();

        monitorHost = findViewById(R.id.monitor_host);
        monitorHost.setBackgroundResource(R.drawable.monitor_anim);
        monitorAnimation = (AnimationDrawable) monitorHost.getBackground();
        monitorAnimation.start();

        loadingWordHost = findViewById(R.id.loading_word_host);
        loadingWordHost.setBackgroundResource(R.drawable.loading_word_anim);
        loadingWordAnimation = (AnimationDrawable) loadingWordHost.getBackground();
        loadingWordAnimation.start();

        header = findViewById(R.id.header);

        alien = findViewById(R.id.alien);
        alienvoy = findViewById(R.id.alienvoy);
        aliender = findViewById(R.id.aliender);
        droidan = findViewById(R.id.droidan);
        droider = findViewById(R.id.droider);

        alienBg = findViewById(R.id.alien_bg);
        alienvoyBg = findViewById(R.id.alienvoy_bg);
        alienderBg = findViewById(R.id.aliender_bg);
        droidanBg = findViewById(R.id.droidan_bg);
        droiderBg = findViewById(R.id.droider_bg);

        alienLabel = findViewById(R.id.alien_label);
        alienvoyLabel = findViewById(R.id.alienvoy_label);
        alienderLabel = findViewById(R.id.aliender_label);
        droidanLabel = findViewById(R.id.droidan_label);
        droiderLabel = findViewById(R.id.droider_label);

        header.setVisibility(View.GONE);

        alien.setVisibility(View.GONE);
        alienvoy.setVisibility(View.GONE);
        aliender.setVisibility(View.GONE);
        droidan.setVisibility(View.GONE);
        droider.setVisibility(View.GONE);

        alienBg.setVisibility(View.GONE);
        alienvoyBg.setVisibility(View.GONE);
        alienderBg.setVisibility(View.GONE);
        droidanBg.setVisibility(View.GONE);
        droiderBg.setVisibility(View.GONE);

        alienLabel.setVisibility(View.GONE);
        alienvoyLabel.setVisibility(View.GONE);
        alienderLabel.setVisibility(View.GONE);
        droidanLabel.setVisibility(View.GONE);
        droiderLabel.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingWordAnimation.selectDrawable(0);
                loadingWordAnimation.stop();
                loadingWordHost.setVisibility(View.GONE);

                header.setVisibility(View.VISIBLE);

                alien.setVisibility(View.VISIBLE);
                alienvoy.setVisibility(View.VISIBLE);
                aliender.setVisibility(View.VISIBLE);
                droidan.setVisibility(View.VISIBLE);
                droider.setVisibility(View.VISIBLE);

                alienLabel.setVisibility(View.VISIBLE);
                alienvoyLabel.setVisibility(View.VISIBLE);
                alienderLabel.setVisibility(View.VISIBLE);
                droidanLabel.setVisibility(View.VISIBLE);
                droiderLabel.setVisibility(View.VISIBLE);

            }
        },3000);

        alien.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alienvoyBg.setVisibility(View.GONE);
                        alienderBg.setVisibility(View.GONE);
                        droidanBg.setVisibility(View.GONE);
                        droiderBg.setVisibility(View.GONE);

                        alienBg.setVisibility(View.VISIBLE);
                    }
                }
        );

        alienvoy.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alienBg.setVisibility(View.GONE);
                        alienderBg.setVisibility(View.GONE);
                        droidanBg.setVisibility(View.GONE);
                        droiderBg.setVisibility(View.GONE);

                        alienvoyBg.setVisibility(View.VISIBLE);
                    }
                }
        );

        aliender.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alienvoyBg.setVisibility(View.GONE);
                        alienBg.setVisibility(View.GONE);
                        droidanBg.setVisibility(View.GONE);
                        droiderBg.setVisibility(View.GONE);

                        alienderBg.setVisibility(View.VISIBLE);
                    }
                }
        );

        droidan.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alienvoyBg.setVisibility(View.GONE);
                        alienderBg.setVisibility(View.GONE);
                        alienBg.setVisibility(View.GONE);
                        droiderBg.setVisibility(View.GONE);

                        droidanBg.setVisibility(View.VISIBLE);
                    }
                }
        );

        droider.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alienvoyBg.setVisibility(View.GONE);
                        alienderBg.setVisibility(View.GONE);
                        droidanBg.setVisibility(View.GONE);
                        alienBg.setVisibility(View.GONE);

                        droiderBg.setVisibility(View.VISIBLE);
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
