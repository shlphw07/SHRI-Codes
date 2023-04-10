package com.example.shripage4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext;

        btnNext = findViewById(R.id.btnSend);

        Intent iNext;
        iNext = new Intent(MainActivity.this,MainActivity2.class);
        iNext.putExtra("Company Name","abc");
        iNext.putExtra("Location","Ram");
        iNext.putExtra("Vehicle type","abc");
        iNext.putExtra("Source","abc");
        iNext.putExtra("Destination","abc");
        iNext.putExtra("Price",10);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){startActivity(iNext);}
        });
    }
}
