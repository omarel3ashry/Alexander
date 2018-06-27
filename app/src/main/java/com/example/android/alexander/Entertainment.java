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

public class Entertainment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        final ArrayList<Data> ent = new ArrayList<>();
        ent.add(new Data(R.drawable.san_stefano, getString(R.string.san_txt)));
        ent.add(new Data(R.drawable.city_centre, getString(R.string.city_txt)));
        ent.add(new Data(R.drawable.northern_coast, getString(R.string.coast_txt)));
        Adapter adapter = new Adapter(getActivity(),ent);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),DetailsActivity.class);
                intent.putExtra(getString(R.string.getdata), (Parcelable) ent.get(position));
                startActivity(intent);
            }
        });
        return rootView;
    }
}
