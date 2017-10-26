package com.example.ananna.customadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ananna.customadapter.R;
import com.example.ananna.customadapter.model.Cricketer;

import java.util.ArrayList;

/**
 * Created by Ananna on 10/25/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    ArrayList<Cricketer> arrayList;


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = inflater.inflate(R.layout.grid_view_item,null);
        ImageView imageCricketer = customView.findViewById(R.id.gridImage);
        TextView textCricketer = customView.findViewById(R.id.textGridName);

        imageCricketer.setImageResource(arrayList.get(position).getImageID());
        textCricketer.setText(arrayList.get(position).getName());

        return customView;
    }

    public CustomAdapter(Context c, ArrayList<Cricketer> arrayList) {
        this.c = c;
        this.arrayList = arrayList;
    }
}
