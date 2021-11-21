package com.pluralsight.candycoded;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView) findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);
//        TextView text_view_address = findViewById(R.id.text_view_address);
//        text_view_address.setOnClickListener(this);
    }

    //    @Override
//    public void onClick(View v) {
//        if(v.getId()==R.id.text_view_address){
//            openMapIntent();
//        }
//    }
    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***
    public void createMapIntent(View view) {
        String URL = ("geo:0,0?q=618 E South St Orlando, FL 32801");
        Uri location = Uri.parse(URL);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        // Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }


    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***

}
