package com.example.lottiefilesviewer.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.lottiefilesviewer.Constantes;
import com.example.lottiefilesviewer.R;
import com.example.lottiefilesviewer.models.Item;

public class ImageDetailActivity extends AppCompatActivity {

    private ImageView ivHeader;
    private TextView tvTitle;
    private Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);

        Bundle bun = getIntent().getExtras();
        int id = bun.getInt(Constantes.EXTRA_ID, 0);
        item = Item.getItem(id);

        ivHeader = findViewById(R.id.iv_header);
        tvTitle = findViewById(R.id.tv_title);

        // Conexión de los elementos que están compartidos
        ViewCompat.setTransitionName(ivHeader, Constantes.SHARED_VIEW_PHOTO);
        ViewCompat.setTransitionName(tvTitle, Constantes.SHARED_VIEW_TITLE);

        loadItem();

    }

    private void loadItem() {
        tvTitle.setText(item.getName());

        /*Picasso.with(this)
                .load(item.getPhotoUrl())
                .into(ivHeader);*/

        /*Glide.with(ImageDetailActivity.this)
                .load(item.getPhotoUrl())
                .centerInside()
                .into(ivHeader);*/

        Glide.with(ImageDetailActivity.this)
                .load(item.getPhotoUrl())
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .centerCrop()
                .placeholder(R.drawable.spinner)
                .fallback(R.drawable.error)
                .skipMemoryCache(false)
                .into(ivHeader);

        Log.e("URL", item.getPhotoUrl());

    }
}