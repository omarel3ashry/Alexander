package com.example.android.alexander;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
        Data data = intent.getParcelableExtra(getString(R.string.getdata));
        int imgID = data.getImgID();
        String text = data.getTitle();
        detailImage.setImageResource(imgID);
        toolbar.setTitle(text);
        if (text.equals(getString(R.string.location_in_egypt))) {
            geoClass_index_0();
        } else if (text.equals(getString(R.string.climate_txt))) {
            geoClass_index_1();
        } else if (text.equals(getString(R.string.alexander_txt))) {
            histClass_index_0();
        } else if (text.equals(getString(R.string.islams_era_txt))) {
            histClass_index_1();
        } else if (text.equals(getString(R.string.ibn_battuta_text))) {
            histClass_index_2();
        } else if (text.equals(getString(R.string.temple_txt))) {
            histClass_index_3();
        } else if (text.equals(getString(R.string.library_txt))) {
            publicPlacesClass_index_0();
        } else if (text.equals(getString(R.string.graeco_roman_txt))) {
            publicPlacesClass_index_1();
        } else if (text.equals(getString(R.string.montaza_txt))) {
            publicPlacesClass_index_2();
        } else if (text.equals(getString(R.string.alex_opera_txt))) {
            publicPlacesClass_index_3();
        } else if (text.equals(getString(R.string.san_txt))) {
            entertainClass_index_0();
        } else if (text.equals(getString(R.string.city_txt))) {
            entertainClass_index_1();
        } else if (text.equals(getString(R.string.coast_txt))) {
            entertainClass_index_2();
        } else if (text.equals(getString(R.string.greek_era_txt))) {
            eventsClass_index_0();
        } else if (text.equals(getString(R.string.byzantine_muslim_txt))) {
            eventsClass_index_1();
        } else if (text.equals(getString(R.string.the_19th_txt))) {
            eventsClass_index_2();
        } else if (text.equals(getString(R.string.the_20th_txt))) {
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
        uri = Uri.parse(getString(R.string.alex_location_coordinates));
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage(getString(R.string.google_maps_package));

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
        uri = Uri.parse(getString(R.string.alex_library_coordinates));
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage(getString(R.string.google_maps_package));

    }

    public void publicPlacesClass_index_1() {
        textView.setText(R.string.graeco_roman_museum);
        uri = Uri.parse(getString(R.string.graeco_roman_coordinates));
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage(getString(R.string.google_maps_package));

    }

    public void publicPlacesClass_index_2() {
        textView.setText(R.string.montaza_palace);
        uri = Uri.parse(getString(R.string.montaza_palace_coordinates));
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage(getString(R.string.google_maps_package));

    }

    public void publicPlacesClass_index_3() {
        textView.setText(R.string.opera_house);
        uri = Uri.parse(getString(R.string.opera_house_coordinates));
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage(getString(R.string.google_maps_package));

    }

    public void entertainClass_index_0() {
        textView.setText(R.string.san_stefano);
        uri = Uri.parse(getString(R.string.san_stefano_coordinates));
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage(getString(R.string.google_maps_package));

    }

    public void entertainClass_index_1() {
        textView.setText(R.string.city_centre);
        uri = Uri.parse(getString(R.string.city_centre_coordinates));
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage(getString(R.string.google_maps_package));
    }

    public void entertainClass_index_2() {
        textView.setText(R.string.northern_coast);
        uri = Uri.parse(getString(R.string.northern_coast_coordinates));
        locationIntent = new Intent(Intent.ACTION_VIEW, uri);
        locationIntent.setPackage(getString(R.string.google_maps_package));
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
