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

public class HistInfo extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        final ArrayList<Data> hist = new ArrayList<>();
        hist.add(new Data(R.drawable.alexander_the_great,"Alexander The Great"));
        hist.add(new Data(R.drawable.alexandria_nabi_daniel_mosque,"Muhammad's era"));
        hist.add(new Data(R.drawable.ibn_battuta,"Ibn Battuta in Alex"));
        hist.add(new Data(R.drawable.temple_of_taposiris_magna,"Temple of Taposiris Magna"));
        Adapter adapter = new Adapter(getActivity(),hist);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra("getdata", (Parcelable) hist.get(position));
                startActivity(intent);
            }
        });
        return rootView;
    }
}
