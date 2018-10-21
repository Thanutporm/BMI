package com.example.bmi.Model;

public class Body {
    private int height;
    private int weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWeight(){
        return this.weight;
    }
    private float calculateBmi (){
        float height = this.height / 100f ;
        float bmi = this.weight / (height*height) ;
        return  bmi ;
    }
    public String getResultText(){
        float bmi = calculateBmi() ;
        String resultText = null ;
        if (bmi < 18.5){
            resultText = "ผอมเกินไป" ;
        }
        else if (bmi < 25){
            resultText = "น้ำหนักดี ไม่อ้วนไม่ผอม";
        }
        else if (bmi < 30){
            resultText = "อ้วน";
        }
        else{
            resultText = "อ้วนมาก";
        }
        return resultText ;
    }
}

