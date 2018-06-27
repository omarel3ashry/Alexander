package com.example.android.alexander;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter {
    public Adapter(@NonNull Context context, ArrayList<Data> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Data currentData = (Data) getItem(position);
        viewHolder.imageView.setImageResource(currentData.getImgID());
        viewHolder.textView.setText(currentData.getTitle());
        return convertView;
    }

    class ViewHolder {

        ImageView imageView;
        TextView textView;

        ViewHolder(View view) {
            imageView = view.findViewById(R.id.img);
            textView = view.findViewById(R.id.title);
        }
    }
}
