package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.default_toast);
        button2 = findViewById(R.id.gravity_toast);
        button3 = findViewById(R.id.nested_gravity_toast);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Default Toast", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast toast = Toast.makeText(MainActivity.this,"Gravity Toast",Toast.LENGTH_LONG);
              toast.setGravity(Gravity.CENTER,0,0);
              toast.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,"Nested Gravity Toast",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);
                toast.show();

            }
        });
    }
}