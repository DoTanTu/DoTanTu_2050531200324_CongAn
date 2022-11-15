package com.example.dotantu2050531200324_quanlycongan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CongAnAdapter extends ArrayAdapter<CongAn> {


    public CongAnAdapter(Context context, ArrayList<CongAn> userArrayList){

        super(context,R.layout.customer_item_congan,userArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CongAn can = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.customer_item_congan,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.image_police);
        TextView name = convertView.findViewById(R.id.name_police);
        TextView rank   = convertView.findViewById(R.id.rank);
        TextView workPlace = convertView.findViewById(R.id.work_place);
        TextView country = convertView.findViewById(R.id.country_police);

        imageView.setImageResource(Integer.parseInt(can.img));
        name.setText(can.name);
        rank.setText(can.rank);
        workPlace.setText(can.workPlace);
        country.setText(can.country);


        return convertView;
    }
}

