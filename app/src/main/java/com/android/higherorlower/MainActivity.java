package com.android.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;

    }

    public void guess(View view) {
        EditText guessEditText = (EditText) findViewById(R.id.et_number);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt > randomNumber) {
            makeToast("Lower!");
        } else if (guessInt < randomNumber) {
            makeToast("Higher!");
        } else {
            makeToast("That's right! Try again!");

            Random rand = new Random();

            randomNumber = rand.nextInt(20) + 1;
        }

    }

    public void makeToast(String string) {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

}
