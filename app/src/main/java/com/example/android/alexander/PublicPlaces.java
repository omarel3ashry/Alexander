package com.example.android.alexander;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PublicPlaces extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        final ArrayList<Data> publicPlaces = new ArrayList<>();
        publicPlaces.add(new Data(R.drawable.alex_library, "Library of Alexandria"));
        publicPlaces.add(new Data(R.drawable.graeco_roman_museum, "Graeco-Roman Museum"));
        publicPlaces.add(new Data(R.drawable.montaza_palace, "Montaza Palace"));
        publicPlaces.add(new Data(R.drawable.alexandria_opera_house, "Alexandria Opera House"));
        Adapter adapter = new Adapter(getActivity(), publicPlaces);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra("getdata", (Parcelable) publicPlaces.get(position));
                startActivity(intent);
            }
        });

        return rootView;
    }
}
