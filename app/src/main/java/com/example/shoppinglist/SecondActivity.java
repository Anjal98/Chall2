package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.example.android.shopping-list.extra.REPLY";


    private static final String LOG_TAG =
            SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void selectWater(View view) {
        Log.d(LOG_TAG, "Water Selected");
        String reply = getString(R.string.Text1);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectApple(View view) {
        Log.d(LOG_TAG, "Apple Selected");
        String reply = getString(R.string.Text2);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectOats(View view) {
        Log.d(LOG_TAG, "Oats Selected");
        String reply = getString(R.string.Text3);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectGum(View view) {
        Log.d(LOG_TAG, "Gum Selected");
        String reply = getString(R.string.Text4);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectMask(View view) {
        Log.d(LOG_TAG, "Mask Selected");
        String reply = getString(R.string.Text5);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectDrinks(View view) {
        Log.d(LOG_TAG, "Drinks Selected");
        String reply = getString(R.string.Text6);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectEggs(View view) {
        Log.d(LOG_TAG, "Eggs Selected");
        String reply = getString(R.string.Text7);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectChicken(View view) {
        Log.d(LOG_TAG, "Chicken Selected");
        String reply = getString(R.string.Text8);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectBroocoli(View view) {
        Log.d(LOG_TAG, "Broocoli Selected");
        String reply = getString(R.string.Text9);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectBeans(View view) {
        Log.d(LOG_TAG, "Beans Selected");
        String reply = getString(R.string.Text10);
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}