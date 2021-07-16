package com.example.lottiefilesviewer.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.example.lottiefilesviewer.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ViewerActivity extends AppCompatActivity {

    private Bundle bun;
    private int selection;
    private Fragment fragment;
    private LottieAnimationView view, view2;
    private FloatingActionButton btnFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);
        view = findViewById(R.id.animation_view);
        btnFab = findViewById(R.id.floatingActionButton);
        view2 = (LottieAnimationView) findViewById(R.id.animation_view2);



        // fragment = new ViewerFragment();
        // Aqui reemplazamos el contenido del FrameLayout y el fragment y lo mostramos
        // getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment).commit();

        // Recuperamos los datos del bundle que esta dentro del intent
        bun = getIntent().getBundleExtra("bundle");
        if (bun != null) {
            // Recuperamos el name del bundle
            selection = bun.getInt("selection");

            lanzarAnimacion(selection);

        }

        btnFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(ViewerActivity.this, ImageAnimationActivity.class);
                startActivity(in);
            }
        });

    }

    private void lanzarAnimacion(int selection) {
        switch (selection) {
            case 1:
                view.setAnimation(R.raw.loading);
                view2.setAnimation(R.raw.loading);
                break;
            case 2:
                view.setAnimation(R.raw.loading2);
                view2.setAnimation(R.raw.loading2);
                break;
            case 3:
                view.setAnimation(R.raw.loading3);
                view2.setAnimation(R.raw.loading3);
                break;
            case 4:
                view.setAnimation(R.raw.loading4);
                view2.setAnimation(R.raw.loading4);
                break;
            case 5:
                view.setAnimation(R.raw.blackguy);
                view2.setAnimation(R.raw.blackguy);
                break;
            case 6:
                view.setAnimation(R.raw.buttondelete);
                view2.setAnimation(R.raw.buttondelete);
                break;
            case 7:
                view.setAnimation(R.raw.check);
                view2.setAnimation(R.raw.check);
                break;
            case 8:
                view.setAnimation(R.raw.delivery);
                view2.setAnimation(R.raw.delivery);
                break;
            case 9:
                view.setAnimation(R.raw.googlelogo);
                view2.setAnimation(R.raw.googlelogo);
                break;
            case 10:
                view.setAnimation(R.raw.happygarbage);
                view2.setAnimation(R.raw.happygarbage);
                break;
            case 11:
                view.setAnimation(R.raw.heartburst);
                view2.setAnimation(R.raw.heartburst);
                break;
            case 12:
                view.setAnimation(R.raw.heartlike);
                view2.setAnimation(R.raw.heartlike);
                break;
            case 13:
                view.setAnimation(R.raw.loadingfail);
                view2.setAnimation(R.raw.loadingfail);
                break;
            case 14:
                view.setAnimation(R.raw.loadingpassed);
                view2.setAnimation(R.raw.loadingpassed);
                break;
            case 15:
                view.setAnimation(R.raw.monitorprogress);
                view2.setAnimation(R.raw.monitorprogress);
                break;
            case 16:
                view.setAnimation(R.raw.paperplane);
                view2.setAnimation(R.raw.paperplane);
                break;
            case 17:
                view.setAnimation(R.raw.remotework);
                view2.setAnimation(R.raw.remotework);
                break;
            case 18:
                view.setAnimation(R.raw.rocket);
                view2.setAnimation(R.raw.rocket);
                break;
            case 19:
                view.setAnimation(R.raw.sleeping404);
                view2.setAnimation(R.raw.sleeping404);
                break;
            case 20:
                view.setAnimation(R.raw.telegram);
                view2.setAnimation(R.raw.telegram);
                break;
            case 21:
                view.setAnimation(R.raw.videocall);
                view2.setAnimation(R.raw.videocall);
                break;
            case 22:
                view.setAnimation(R.raw.videoediting);
                view2.setAnimation(R.raw.videoediting);
                break;
            case 23:
                view.setAnimation(R.raw.videoplay);
                view2.setAnimation(R.raw.videoplay);
                break;
            case 24:
                view.setAnimation(R.raw.videoplay2);
                view2.setAnimation(R.raw.videoplay2);
                break;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                view.playAnimation();
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view2.playAnimation();
            }
        });
        // view.playAnimation();

    }
}