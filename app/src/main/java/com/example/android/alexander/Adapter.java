package com.example.android.alexander;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter {
    public Adapter(@NonNull Context context, ArrayList<Data> data) {
        super(context, 0,data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Data currentData = (Data) getItem(position);
        ImageView imageView = listItemView.findViewById(R.id.img);
        imageView.setImageResource(currentData.getImgID());
        TextView textView = listItemView.findViewById(R.id.title);
        textView.setText(currentData.getTitle());

        return listItemView;
    }
}
