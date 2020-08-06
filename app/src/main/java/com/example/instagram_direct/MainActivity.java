package com.example.instagram_direct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt,name;
    Integer tap;
    CardView cardView;

    Integer count;

    public void cameraclick(View view) {
        Toast.makeText(this, "camera icon click", Toast.LENGTH_SHORT).show( );

    }

    public void increase(View view) {
        if (tap <= count) {
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
            count=99;

          /**
            //to set image at left corner
            imageView=findViewById(R.id.imageView3);
            imageView.setImageResource(R.drawable.ic_baseline_camera_alt_24);

            //to set title text
            name=findViewById(R.id.name);
            name.setText("INSTAGRAM");

            //to set color for notification badge
            cardView.setCardBackgroundColor();
           //to set count limit for notification
           count=99;

            **/



        }
    }

