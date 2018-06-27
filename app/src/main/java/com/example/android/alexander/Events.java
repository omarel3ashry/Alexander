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

public class Events extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        final ArrayList<Data> events = new ArrayList<>();
        events.add(new Data(R.drawable.hourglass, getString(R.string.greek_era_txt)));
        events.add(new Data(R.drawable.hourglass, getString(R.string.byzantine_muslim_txt)));
        events.add(new Data(R.drawable.hourglass, getString(R.string.the_19th_txt)));
        events.add(new Data(R.drawable.hourglass, getString(R.string.the_20th_txt)));
        Adapter adapter = new Adapter(getActivity(), events);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailsActivity.class);
                intent.putExtra(getString(R.string.getdata), (Parcelable) events.get(position));
                startActivity(intent);
            }
        });

        return rootView;
    }
}
