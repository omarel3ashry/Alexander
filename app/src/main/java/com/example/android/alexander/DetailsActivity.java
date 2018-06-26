package com.example.android.alexander;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class DetailsActivity extends AppCompatActivity {

    ImageView detailImage;
    TextView textView;
    Uri uri;
    Intent locationIntent;
    FloatingActionButton locationActionButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);

        locationActionButton = findViewById(R.id.location_action_button);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        detailImage = findViewById(R.id.detail_img);
        textView = findViewById(R.id.detail_txt);
        final Intent intent = getIntent();
        Data data = intent.getParcelableExtra("getdata");
        int imgID = data.getImgID();
        String text = data.getTitle();
        detailImage.setImageResource(imgID);
        toolbar.setTitle(text);
        if (text.equals("Location in Egypt")) {
            geoClass_index_0();
        } else if (text.equals("Climate")) {
            geoClass_index_1();
        } else if (text.equals("Alexander The Great")) {
            histClass_index_0();
        } else if (text.equals("Muhammad's era")) {
            histClass_index_1();
        } else if (text.equals("Ibn Battuta in Alex")) {
            histClass_index_2();
        } else if (text.equals("Temple of Taposiris Magna")) {
            histClass_index_3();
        } else if (text.equals("Library of Alexandria")) {
            publicPlacesClass_index_0();
        } else if (text.equals("Graeco-Roman Museum")) {
            publicPlacesClass_index_1();
        } else if (text.equals("Montaza Palace")) {
            publicPlacesClass_index_2();
        } else if (text.equals("Montaza Palace")) {
            publicPlacesClass_index_2();
        } else if (text.equals("Alexandria Opera House")) {
            publicPlacesClass_index_3();
        } else if (text.equals("San Stefano Grand Plaza")) {
            entertainClass_index_0();
        } else if (text.equals("City Centre")) {
            entertainClass_index_1();
        } else if (text.equals("Northern Coast")) {
            entertainClass_index_2();
        } else if (text.equals("Greek era")) {
            eventsClass_index_0();
        } else if (text.equals("Byzantine & Muslim Rules")) {
            eventsClass_index_1();
        } else if (text.equals("19th Century")) {
            eventsClass_index_2();
        } else if (text.equals("20th Century")) {
            eventsClass_index_3();
        }


        locationActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(locationIntent);
                }
            }
        });


    }

    public void geoClass_index_0() {

        textView.setText(R.string.alex_location);
        uri = Uri.parse("geo:31.2,29.916667");
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage("com.google.android.apps.maps");

    }

    public void geoClass_index_1() {
        textView.setText(R.string.climate);
        locationActionButton.setVisibility(View.GONE);

    }

    public void histClass_index_0() {
        textView.setText(R.string.alexander_the_great);
        locationActionButton.setVisibility(View.GONE);
    }

    public void histClass_index_1() {
        textView.setText(R.string.Muhammads_era);
        locationActionButton.setVisibility(View.GONE);
    }

    public void histClass_index_2() {
        textView.setText(R.string.ibn_battuta);
        locationActionButton.setVisibility(View.GONE);
    }

    public void histClass_index_3() {
        textView.setText(R.string.temple_of_tapo);
        locationActionButton.setVisibility(View.GONE);
    }

    public void publicPlacesClass_index_0() {
        textView.setText(R.string.library_of_alex);
        uri = Uri.parse("geo:31.208889,29.909167");
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage("com.google.android.apps.maps");

    }

    public void publicPlacesClass_index_1() {
        textView.setText(R.string.graeco_roman_museum);
        uri = Uri.parse("geo:31.199259,29.906872");
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage("com.google.android.apps.maps");

    }

    public void publicPlacesClass_index_2() {
        textView.setText(R.string.montaza_palace);
        uri = Uri.parse("geo:31.2886,30.0159");
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage("com.google.android.apps.maps");

    }

    public void publicPlacesClass_index_3() {
        textView.setText(R.string.opera_house);
        uri = Uri.parse("geo:31.196667,29.901389");
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage("com.google.android.apps.maps");

    }

    public void entertainClass_index_0() {
        textView.setText(R.string.san_stefano);
        uri = Uri.parse("geo:31.245755,29.965982");
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage("com.google.android.apps.maps");

    }

    public void entertainClass_index_1() {
        textView.setText(R.string.city_centre);
        uri = Uri.parse("geo:31.168703,29.932259");
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage("com.google.android.apps.maps");
    }

    public void entertainClass_index_2() {
        textView.setText(R.string.northern_coast);
        uri = Uri.parse("geo:30.9279041,29.2986713");
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage("com.google.android.apps.maps");
    }

    public void eventsClass_index_0() {
        textView.setText(R.string.greek_era);
        locationActionButton.setVisibility(View.GONE);
    }

    public void eventsClass_index_1() {
        textView.setText(R.string.rules);
        locationActionButton.setVisibility(View.GONE);
    }

    public void eventsClass_index_2() {
        textView.setText(R.string.the_19th_century);
        locationActionButton.setVisibility(View.GONE);
    }

    public void eventsClass_index_3() {
        textView.setText(R.string.the_20th_century);
        locationActionButton.setVisibility(View.GONE);
    }

}
