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
        publicPlaces.add(new Data(R.drawable.alex_library, getString(R.string.library_txt)));
        publicPlaces.add(new Data(R.drawable.graeco_roman_museum, getString(R.string.graeco_roman_txt)));
        publicPlaces.add(new Data(R.drawable.montaza_palace, getString(R.string.montaza_txt)));
        publicPlaces.add(new Data(R.drawable.alexandria_opera_house, getString(R.string.alex_opera_txt)));
        Adapter adapter = new Adapter(getActivity(), publicPlaces);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra(getString(R.string.getdata), (Parcelable) publicPlaces.get(position));
                startActivity(intent);
            }
        });

        return rootView;
    }
}
