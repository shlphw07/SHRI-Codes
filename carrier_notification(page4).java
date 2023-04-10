package com.example.shripage4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent fromAct = getIntent();
        String company_name = fromAct.getStringExtra("Company Name");
        String location = fromAct.getStringExtra("Location");
        String vehicle_type = fromAct.getStringExtra("Vehicle type");
        String source = fromAct.getStringExtra("Source");
        String destination = fromAct.getStringExtra("Destination");
        int Price = fromAct.getIntExtra("Price", 0);

        TextView txtOrderInfo;

        txtOrderInfo = findViewById(R.id.txtOrderInfo);
    }
}
