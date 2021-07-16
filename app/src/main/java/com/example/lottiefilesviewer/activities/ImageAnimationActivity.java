package com.example.lottiefilesviewer.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.lottiefilesviewer.Constantes;
import com.example.lottiefilesviewer.R;
import com.example.lottiefilesviewer.models.Item;

public class ImageAnimationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView mGridView;
    private GridAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_animation);

        mGridView = findViewById(R.id.grid_view);
        mGridView.setOnItemClickListener(this);
        mAdapter = new GridAdapter();
        mGridView.setAdapter(mAdapter);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item item = (Item) parent.getItemAtPosition(position);

        Intent i = new Intent(ImageAnimationActivity.this, ImageDetailActivity.class);
        i.putExtra(Constantes.EXTRA_ID, item.getId());

        // obtenemos una referencia a los elemntos visuales que qwueremos transicionar

        ImageView ivPhoto = view.findViewById(R.id.imageview_item);
        TextView tvTitulo = view.findViewById(R.id.textview_name);

        // Aqui creamos la transicion de elementos
        ActivityOptionsCompat activityOptions = ActivityOptionsCompat
                .makeSceneTransitionAnimation(this,
                        new Pair<View, String>(ivPhoto, Constantes.SHARED_VIEW_PHOTO),
                        new Pair<View, String>(tvTitulo, Constantes.SHARED_VIEW_TITLE)
                        );

        ActivityCompat.startActivity(this, i, activityOptions.toBundle());

        // startActivity(i);
    }

    private class GridAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Item.ITEMS.length;
        }

        @Override
        public Item getItem(int position) {
            return Item.ITEMS[position];
        }

        @Override
        public long getItemId(int position) {
            return getItem(position).getId();
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = getLayoutInflater().inflate(R.layout.grid_item, viewGroup, false);

            }

            final Item item = getItem(position);

            // Cargar thumbnail
            ImageView image = view.findViewById(R.id.imageview_item);

            /*Glide.with(ImageAnimationActivity.this)
                    .load(item.getThumbnailUrl())
                    .centerCrop()
                    .into(image);*/

            Glide.with(ImageAnimationActivity.this)
                    .load(item.getThumbnailUrl())
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .centerCrop()
                    .placeholder(R.drawable.spinner)
                    .skipMemoryCache(false)
                    .into(image);

            /*Glide.with(ImageAnimationActivity.this)
                    .load(item.getThumbnailUrl())
                    .dontAnimate()
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .centerCrop()
                    .placeholder(R.drawable.spinner)
                    .skipMemoryCache(false)
                    .into(image);*/

            /*Picasso.with(image.getContext())
                    .load(item.getThumbnailUrl())
                    .into(image);*/

            // Setear el texto
            TextView name = view.findViewById(R.id.textview_name);
            name.setText(item.getName());

            return view;

        }
    }

}