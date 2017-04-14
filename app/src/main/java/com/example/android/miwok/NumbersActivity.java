package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //Find Numbers activity layout and store it in a LinearLayout variable
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //Using for loop instead:
        for (int index = 0; index < words.size(); index++) {
            //Create new TextView object (child view):
            TextView wordView = new TextView(this);

            //call setText on view object + pass element index as input.
            wordView.setText(words.get(index));

            //Update counter variable
            rootView.addView(wordView);
        }


    }
}
