package com.example.madee.sga;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.DrawableImageViewTarget;


public class MainActivity2 extends AppCompatActivity {
    private Button btn,btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView imageView = (ImageView) findViewById(R.id.J);
        final ImageView imageView1 = (ImageView) findViewById(R.id.j1);
        final ImageView imageView2 = (ImageView) findViewById(R.id.j2);
        final ImageView imageView3 = (ImageView) findViewById(R.id.j3);
        final ImageView imageView4 = (ImageView) findViewById(R.id.j4);
        final ImageView imageView5 = (ImageView) findViewById(R.id.j5);
        final ImageView imageView6 = (ImageView) findViewById(R.id.j6);
        final ImageView imageView7 = (ImageView) findViewById(R.id.j7);
        final ImageView imageView8 = (ImageView) findViewById(R.id.j8);
        final ImageView imageView9 = (ImageView) findViewById(R.id.j9);
        final ImageView imageView10 = (ImageView) findViewById(R.id.j10);
        final ImageView imageView11 = (ImageView) findViewById(R.id.j11);
        final ImageView imageView12 = (ImageView) findViewById(R.id.j12);

        imageView.setVisibility(View.INVISIBLE);

        Location loc;
        GetGpsLocation gpsLocation = new GetGpsLocation(this);
        loc = gpsLocation.getLoc();
        loc.getLatitude();///waghera waghera
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView1));
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView2));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView3));
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView4));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView5));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView6));
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView7));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView8));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView9));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView10));

        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView11));
        Glide.with(this)
                .load(R.raw.loc3)
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new DrawableImageViewTarget(imageView12));
    }
}
