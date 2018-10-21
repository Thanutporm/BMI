package com.example.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bmi.Model.Body;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculateButton = findViewById(R.id.calculate_button);
        calculateButton.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                EditText heightEditText = findViewById(R.id.height_edit_text);
                EditText weightEditText = findViewById(R.id.weight_edit_text);

               int h = Integer.parseInt(heightEditText.getText().toString());
               int w = Integer.parseInt(weightEditText.getText().toString());
                Body body = new Body(h,w);


                float bmi = calculateBmi(body.getHeight(),body.getWeight());


                //String msg = (" BMI เท่ากับ ="+ String.format(Locale.US, "%.2f",bmi));
                String msg = "เกณฑ์น้ำหนักของคุณ : " + body.getResultText();

                //Toast.makeText()
                Toast t = Toast.makeText(MainActivity.this,"ค่า BMI เท่ากับ "+ String.format(Locale.US, "%.2f",bmi),Toast.LENGTH_LONG);
                t.show();

                //Method chaining
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Result");
                dialog.setMessage(msg);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //โค้ดที่ให้ทำเมื่อuserคลิกปุ่มOK at dialog

                    }
                });

                dialog.setNegativeButton("No",null);
                dialog.setCancelable(false);
                dialog.show();

                new AlertDialog.Builder(MainActivity.this).setTitle("Result")
                        .setMessage(msg)
                        .setPositiveButton("OK",null)
                        .setNegativeButton("No",null)
                        .show();
            }
        });
    }
    private float calculateBmi(int heightInCm,int weightInKg){
        //bmi = kg / m*2
        float height = heightInCm / 100f;
        Log.i(TAG," ความสูงหน่วยเมตร = " + String.valueOf(height));
        float bmi = weightInKg/(height * height);
        return bmi;
    }
}
