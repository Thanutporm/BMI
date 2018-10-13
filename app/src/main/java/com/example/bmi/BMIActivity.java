package com.example.bmi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


//2 public class BMIActivity extends AppCompatActivity implements View.OnClickListener{
public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        Toast t2 = Toast.makeText(this , "Android" , Toast.LENGTH_SHORT);
        t2.show();

        Button startButton = findViewById(R.id.Start_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Hello";
                Toast t = Toast.makeText(BMIActivity.this, "Hello", Toast.LENGTH_SHORT);
                t.show();
            }
        } );

        Toast t3 = Toast.makeText(this , "Studio" , Toast.LENGTH_SHORT);
        t3.show();

        final Button Start_button = findViewById(R.id.Start_button);
        Start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BMIActivity.this, MainActivity.class);

                startActivity(i);
            }
        });

        Button exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

       //1 MyListener listener= new MyListener();
        //1 startButton.setOnClickListener(listener);

        //2 startButton.setOnClickListener(this);

       //3 startButton.setOnClickListener(new View.OnClickListener() {
          //3  @Override
           //3 public void onClick(View v) {

           //3 }
       //3 });
    }

   //2 @Override
  //2  public void onClick(View v) {
       //2 Log.d("bmi", "Hello Android");
   //2 }

    //1 private class MyListener implements View.OnClickListener{

        //1 @Override
      // 1 public void onClick(View v) {
           //1 Log.d("bmi", "OK");
       //1 }
    //1}
}

