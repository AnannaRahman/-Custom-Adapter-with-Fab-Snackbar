package com.example.ananna.customadapter;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.example.ananna.customadapter.adapter.CustomAdapter;
import com.example.ananna.customadapter.model.Cricketer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    ArrayList<Cricketer> cricketers;
    private CoordinatorLayout coLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridView);
        coLayout = (CoordinatorLayout) findViewById(R.id.coOrdinatLayout);
        cricketers = new ArrayList<Cricketer>();
        setData();

        CustomAdapter adapter =new CustomAdapter(MainActivity.this,cricketers);
        gridView.setAdapter(adapter);

     gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                final Snackbar snackbar = Snackbar.make(coLayout,cricketers.get(position).getName(),Snackbar.LENGTH_LONG);


              //  final Snackbar snackbar = Snackbar.make(coLayout, cricketers.get(position).getName(), Snackbar.);
                snackbar.setActionTextColor(getResources().getColor(R.color.colorPrimary));
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackbar.dismiss();
                    }
                });
                snackbar.show();
            }
        });
    }

    private void setData() {
        Cricketer dhoni =new Cricketer(R.drawable.dhoni,"Dhoni");
        Cricketer lee = new Cricketer(R.drawable.brett_lee,"Bret Lee");
        Cricketer ganguli =new Cricketer(R.drawable.ganguly,"Sourav Ganguli");
        Cricketer afridi = new Cricketer(R.drawable.shahid_afridi,"Shahid Afridi");
        Cricketer mashrafi =new Cricketer(R.drawable.mashrafi,"Mashrafi Bin Murtoza");
        Cricketer mushfique = new Cricketer(R.drawable.mushfique,"Mushfiquer Rahim");
        Cricketer shaun =new Cricketer(R.drawable.pollock,"shaun pollock");
        Cricketer afrid = new Cricketer(R.drawable.shahid_afridi,"Shahid Afridi");
        cricketers.add(dhoni);
        cricketers.add(lee);
        cricketers.add(ganguli);
        cricketers.add(afridi);
        cricketers.add(mashrafi);
        cricketers.add(mushfique);
        cricketers.add(shaun);
        cricketers.add(afrid);
    }
}
