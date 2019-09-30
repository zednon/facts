package com.jackalopehunters.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private FactBooks factBook = new FactBooks();
    private TextView factTextView;
    private Button showCatFact;
    private RelativeLayout relativeLayout;

;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Assign the View from the layout files to the corresponding variables

        factTextView =   findViewById(R.id.Fact);
        showCatFact =  findViewById(R.id.moreFact);

        relativeLayout =  findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String fact = factBook.getFacts();

                factTextView.setText(fact);


            }
        };

    }




}
