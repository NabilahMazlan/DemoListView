package com.example.demolistview;

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
import java.util.List;

public class FoodAdapter extends ArrayAdapter<Food> {

    private ArrayList<Food> food;
    private Context context;
    private TextView tvName;
    private ImageView imgStar;


    public FoodAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Food> objects) {
        super(context, resource, objects);

        food = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.row, parent, false);
        tvName = convertView.findViewById(R.id.tvFoodName);
        imgStar = convertView.findViewById(R.id.ivStar);

        Food currentFood = food.get(position);

        tvName.setText(currentFood.getName());
        if(currentFood.isStars()){
            imgStar.setImageResource(R.drawable.star);
        }else{
            imgStar.setImageResource(R.drawable.nostar);
        }

        return convertView;


    }

}
