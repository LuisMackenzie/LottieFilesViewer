package com.example.lottiefilesviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieConfig;
import com.example.lottiefilesviewer.activities.ViewerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn10, btn11, btn12;
    private Button btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24;
    private int selection = 0;
    private Bundle bun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpElements();
        setUpListeners();
        bun = new Bundle();

        // view = findViewById(R.id.animation_view);
        // view2 = findViewById(R.id.animation_view2);


        /*Lottie.initialize(new LottieConfig.Builder()
                .setEnableSystraceMarkers(true)
                // .setNetworkFetcher()
                .setNetworkCacheDir()
        );*/

    }

    private void setUpElements() {
        btn01 = findViewById(R.id.button);
        btn02 = findViewById(R.id.button2);
        btn03 = findViewById(R.id.button3);
        btn04 = findViewById(R.id.button4);
        btn05 = findViewById(R.id.button5);
        btn06 = findViewById(R.id.button6);
        btn07 = findViewById(R.id.button7);
        btn08 = findViewById(R.id.button8);
        btn09 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);
        btn11 = findViewById(R.id.button11);
        btn12 = findViewById(R.id.button12);
        btn13 = findViewById(R.id.button13);
        btn14 = findViewById(R.id.button14);
        btn15 = findViewById(R.id.button15);
        btn16 = findViewById(R.id.button16);
        btn17 = findViewById(R.id.button17);
        btn18 = findViewById(R.id.button18);
        btn19 = findViewById(R.id.button19);
        btn20 = findViewById(R.id.button20);
        btn21 = findViewById(R.id.button21);
        btn22 = findViewById(R.id.button22);
        btn23 = findViewById(R.id.button23);
        btn24 = findViewById(R.id.button24);
    }

    private void setUpListeners() {
        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
        btn03.setOnClickListener(this);
        btn04.setOnClickListener(this);
        btn05.setOnClickListener(this);
        btn06.setOnClickListener(this);
        btn07.setOnClickListener(this);
        btn08.setOnClickListener(this);
        btn09.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
    }

    private void abrirViewer(int selection) {
        // Animacion entre la transicion de la activity
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);

        Intent in = new Intent(MainActivity.this, ViewerActivity.class);
        bun.putInt("selection", selection);
        // agregamos el bundle al intent
        in.putExtra("bundle", bun);
        startActivity(in, options.toBundle());
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button:
                selection= 1;
                abrirViewer(selection);
                break;
            case R.id.button2:
                selection= 2;
                abrirViewer(selection);
                break;
            case R.id.button3:
                selection= 3;
                abrirViewer(selection);
                break;
            case R.id.button4:
                selection= 4;
                abrirViewer(selection);
                break;
            case R.id.button5:
                selection= 5;
                abrirViewer(selection);
                break;
            case R.id.button6:
                selection= 6;
                abrirViewer(selection);
                break;
            case R.id.button7:
                selection= 7;
                abrirViewer(selection);
                break;
            case R.id.button8:
                selection= 8;
                abrirViewer(selection);
                break;
            case R.id.button9:
                selection= 9;
                abrirViewer(selection);
                break;
            case R.id.button10:
                selection= 10;
                abrirViewer(selection);
                break;
            case R.id.button11:
                selection= 11;
                abrirViewer(selection);
                break;
            case R.id.button12:
                selection= 12;
                abrirViewer(selection);
                break;
            case R.id.button13:
                selection= 13;
                abrirViewer(selection);
                break;
            case R.id.button14:
                selection= 14;
                abrirViewer(selection);
                break;
            case R.id.button15:
                selection= 15;
                abrirViewer(selection);
                break;
            case R.id.button16:
                selection= 16;
                abrirViewer(selection);
                break;
            case R.id.button17:
                selection= 17;
                abrirViewer(selection);
                break;
            case R.id.button18:
                selection= 18;
                abrirViewer(selection);
                break;
            case R.id.button19:
                selection= 19;
                abrirViewer(selection);
                break;
            case R.id.button20:
                selection= 20;
                abrirViewer(selection);
                break;
            case R.id.button21:
                selection= 21;
                abrirViewer(selection);
                break;
            case R.id.button22:
                selection= 22;
                abrirViewer(selection);
                break;
            case R.id.button23:
                selection= 23;
                abrirViewer(selection);
                break;
            case R.id.button24:
                selection= 24;
                abrirViewer(selection);
                break;
        }

    }

}