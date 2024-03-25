package com.example.mireaapp_41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment,BlankFragment1.class, null).commit();

        FragmentManager fragmentManager = getSupportFragmentManager();


        btn1 = findViewById(R.id.btn_frg1);
        btn2 = findViewById(R.id.btn_frg2);
        btn3 = findViewById(R.id.btn_frg3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment1 blankFragment1 = new BlankFragment1();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_imp, blankFragment1, "fragment1");
                fragmentTransaction.commit();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment2 blankFragment2 = new BlankFragment2();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_imp, blankFragment2, "fragment2");
                fragmentTransaction.commit();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment3 blankFragment3 = new BlankFragment3();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_imp, blankFragment3, "fragment3");
                fragmentTransaction.commit();

            }
        });


    }
}