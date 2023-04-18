package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.i("tag", "onCreate: ");


        setContentView(R.layout.activity_main);


        TextView textView=findViewById(R.id.textView);





        textView.setText("dddddddddddddd");



Button btn =findViewById(R.id.btn);
btn.setOnClickListener(c->{


    Intent intent=new Intent(this,MainActivity2.class);
   intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
    startActivity(intent);


});



    }

    @Override
    protected void onResume() {
        super.onResume();


        Log.i("tag", "onResume: ");

    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.i("tag", "onStart: ");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();


        Log.i("tag", "onDestroy: ");


    }


    @Override
    protected void onStop() {
        super.onStop();


        Log.i("tag", "onStop: ");

    }
}