package com.example.dotantu2050531200324_quanlycongan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView;
import android.widget.ListAdapter;

import com.example.dotantu2050531200324_quanlycongan.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.policy,R.drawable.policy,R.drawable.policy,R.drawable.policy,R.drawable.policy,
                R.drawable.policy,R.drawable.policy,R.drawable.policy,R.drawable.policy};
        String[] name = {"Christopher","Craig","Sergio","Mubariz","Mike","Michael","Toa","Ivana","Alex"};
        String[] rank = {"Thượng úy","Trung úy","Thượng úy","Trung tá","thiếu tá",
                "Sĩ quan","Hạ sĩ quan","Thiếu tá","Trung tá"};
        String[] country = {"Việt Nam","Việt Nam","Việt Nam","Việt Nam","Việt Nam",
                "Việt Nam","Việt Nam","Pháp","Lào"};
        String[] workplace = {"TP.Đà Nẵng","Quảng Nam","Cà mau","Quân khu 5","Quân khu 4",
                "Hải Phòng","Long an","Lạng Sơn","Thái Nguyên"};


        ArrayList<CongAn> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            CongAn user = new CongAn(imageId[i], name[i],rank[i],workplace[i],country[i]);
            userArrayList.add(user);

        }


        CongAnAdapter listAdapter = new CongAnAdapter(MainActivity.this, userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
    }
}