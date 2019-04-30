package com.example.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Food> alfood;
    ArrayAdapter aafood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvFood);

        alfood = new ArrayList<Food>();
        alfood.add(new Food("Ah Lat Coffee", false));
        alfood.add(new Food("Rocky Choc", true));
        alfood.add(new Food("Kid Cat Choc", true));

        aafood = new FoodAdapter(this, R.layout.row, alfood);
        lv.setAdapter(aafood);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Food selectedFood = alfood.get(i);

                Toast.makeText(MainActivity.this, selectedFood.getName() + " Star: " + selectedFood.isStars(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
