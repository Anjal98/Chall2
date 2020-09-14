package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    private TextView TextOne;
    private TextView TextTwo;
    private TextView TextThree;
    private TextView TextFour;
    private TextView TextFive;
    private TextView TextSix;
    private TextView TextSeven;
    private TextView TextEight;
    private TextView TextNine;
    private TextView TextTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextOne = findViewById(R.id.Text1);
        TextTwo = findViewById(R.id.Text2);
        TextThree = findViewById(R.id.Text3);
        TextFour = findViewById(R.id.Text4);
        TextFive = findViewById(R.id.Text5);
        TextSix = findViewById(R.id.Text6);
        TextSeven = findViewById(R.id.Text7);
        TextEight= findViewById(R.id.Text8);
        TextNine = findViewById(R.id.Text9);
        TextTen = findViewById(R.id.Text10);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Add Button Clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply1 =
                        data.getStringExtra(SecondActivity.EXTRA_REPLY);
                TextOne.setText(reply1);
                TextOne.setVisibility(View.VISIBLE);
               

            }
        }
    }
}