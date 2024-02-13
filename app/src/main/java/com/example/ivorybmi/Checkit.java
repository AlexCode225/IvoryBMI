package com.example.ivorybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
//Alex CODE
//ALEXCODE225
public class Checkit extends AppCompatActivity {

    TextView BMIresult, checkis;

    ImageView checkimgview;
    String bmi ;
    float mBmi;
    Intent intent;
    String height;
    String weight;
    float intheight, mweight;
    RelativeLayout  Ttextop;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkit);


        //     getSupportActionBar().setTitle("BMI-result");

        //getSupportActionBar().setTitle(Html.fromHtml("<font color=\"red\"></font>"));
        //ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#800000"));
        //getSupportActionBar().setBackgroundDrawable(colorDrawable);

//Alex CODE
//ALEXCODE225
       intent = getIntent(); //get intent

        BMIresult = findViewById(R.id.BMIresult);//get  result number
        checkis = findViewById(R.id.checkis);//get  result note
        checkimgview = findViewById(R.id.checkimgview);// image that changes according to result
        Ttextop =  findViewById(R.id.textop);

        // Get a reference to the button
        Button  CalculateAgain = findViewById(R.id.CalculateAgain);




        height=  intent.getStringExtra("height");
        weight=  intent.getStringExtra("weight");

        intheight = Float.parseFloat(height);
        mweight = Float.parseFloat(weight);


   intheight = (intheight/100);
   mBmi = mweight/( intheight * intheight);
   bmi = Float.toString(mBmi);

   //displaying result bmi to user  (<16)
//Alex CODE
//ALEXCODE225
if (mBmi <16) {

    checkis.setText("severe underweight, Please consult a specialist");
  // Ttextop.setBackground(Color.RED);
    checkimgview.setImageResource(R.drawable.warningic);
}
        if (mBmi < 16.2) {
            checkis.setText("Severely Underweight");
            checkimgview.setImageResource(R.drawable.underweightic);
        } else if (mBmi < 18.5) {
            checkis.setText("Underweight");
            checkimgview.setImageResource(R.drawable.underweightic);

        } else if  (mBmi >= 18.5 && mBmi < 25) {
            checkis.setText("Healthy Weight");
            checkimgview.setImageResource(R.drawable.healthyic);
        }

        else if  (mBmi >= 25 && mBmi < 30) {
            checkis.setText("Overweight");
            checkimgview.setImageResource(R.drawable.healthyic);
        }


//Alex CODE
//ALEXCODE225
        else {
            checkis.setText("Obese, Please Consult a Specialist");
            checkimgview.setImageResource(R.drawable.dangic);
        }



      BMIresult.setText(bmi);// display the calculation of the bmi

//Alex CODE
//ALEXCODE225
        // Set an OnClickListener for the button
        CalculateAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity (replace `BMICalculatorActivity` with your desired activity)
                Intent intent = new Intent(Checkit.this, App1.class);
                startActivity(intent);
                finish();
                //Alex CODE
//ALEXCODE225
            }
        });
    }
    }
//Alex CODE
//ALEXCODE225