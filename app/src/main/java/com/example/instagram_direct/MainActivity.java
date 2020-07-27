package com.example.instagram_direct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Integer tap;
    CardView cardView;

    public void cameraclick(View view) {
        Toast.makeText(this, "camera icon click", Toast.LENGTH_SHORT).show( );

    }

    public void increase(View view) {
        if (tap < 100) {
            cardView.setVisibility(View.VISIBLE);
            tap = tap + 1;
            txt.setText(tap.toString( ));
        }
    }
        public void decrease (View view){
            if (tap > 0) {
                tap = tap - 1;
                txt.setText(tap.toString( ));
            }
            if (tap == 0) {
                cardView.setVisibility(View.INVISIBLE);

            }
        }


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            txt = findViewById(R.id.textView);
            tap = 0;
            cardView = findViewById(R.id.card);
            cardView.setVisibility(View.INVISIBLE);
        }
    }

