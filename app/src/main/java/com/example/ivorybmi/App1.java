package com.example.ivorybmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

//Alex CODE
//ALEXCODE225
public class App1 extends AppCompatActivity {

    //necessary variables
    private TextView currWeight, currHeight;

    private Button btnCalculate;
    private ImageView decrementbtn,incrementbtn ;
    SeekBar   SeekHeight;
    RelativeLayout maleimg, femaleimg;


    //necessary variables
    int mweight =80;
    int currProgress;
  String typeofuser ="0";
  String mintprogress ="170";
  String weight2= "80";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app1);

//Alex CODE
//ALEXCODE225



        Button btnCalculate = findViewById(R.id.btnCalculate);
        TextView currHeight = findViewById(  R.id.currHeight) ;
        TextView currWeight = findViewById(  R.id.currWeight) ;

        incrementbtn = findViewById(R.id.incrementbtn);
        decrementbtn = findViewById(R.id.decrementbtn);
        SeekHeight = findViewById(R.id.SeekHeight);
        ImageView maleimg = findViewById(R.id.maleimg);
        ImageView femaleimg = findViewById(R.id.femaleimg);



        maleimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//Alex CODE
//ALEXCODE225
                maleimg.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.female));
               femaleimg.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.maleic));
              typeofuser = "male";
            }
        });

        femaleimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                femaleimg.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.male)); //when it is selected
                maleimg.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fmaleic));// when the other is selected
                typeofuser = "female";
            }
        });

//Alex CODE
//ALEXCODE225



        SeekHeight.setMax(300); //seekbar max
        SeekHeight.setProgress(150);
        SeekHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               currProgress = progress;
                mintprogress= String.valueOf(currProgress);
                currHeight.setText(mintprogress);
            }



            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            //Alex CODE
//ALEXCODE225
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





//increment weight
        incrementbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mweight= mweight+1  ;
                weight2= String.valueOf(mweight);
                currWeight.setText(weight2);

            }
        });

//decrement weight
        decrementbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mweight= mweight-1  ;// weight-1
                weight2= String.valueOf(mweight);
                currWeight.setText(weight2);//decrement weight

            }
        });

//Alex CODE
//ALEXCODE225










        // Set an OnClickListener for the button
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (typeofuser.equals("0"))
               {

                   Toast.makeText(getApplicationContext(),"select Gender first", Toast.LENGTH_LONG).show();
               }

               else if (mintprogress.equals("0"))
               {

                   Toast.makeText(getApplicationContext(),"Please enter correct Height", Toast.LENGTH_LONG).show();
               }
               else if (mweight<0 || mweight==0 )
               {

                   Toast.makeText(getApplicationContext(),"Please enter correct Weight", Toast.LENGTH_LONG).show();
               }
//Alex CODE
//ALEXCODE225
               else {

                   // Start the new activity
                   Intent intent = new Intent(App1.this, Checkit.class);
                //   intent.putExtra("gender", typeofuser);
                   intent.putExtra("height", mintprogress);
                   intent.putExtra("weight", weight2);

                   startActivity(intent);
               }




//Alex CODE
//ALEXCODE225

            }
        });


//Alex CODE
//ALEXCODE225


    }





    }


//Alex CODE
//ALEXCODE225



