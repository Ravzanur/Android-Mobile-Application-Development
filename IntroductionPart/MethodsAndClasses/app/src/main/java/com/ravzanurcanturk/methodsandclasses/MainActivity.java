package com.ravzanurcanturk.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");

        testMode();

        System.out.println(math(7,8));
        System.out.println(newMethod("ravzaa"));

        makeMusicians();
        makeSimpsons();

    }

    public void makeSimpsons(){

        Simpsons homer = new Simpsons("Homer", 50, "Nuclear");
        homer.age= 51;
        System.out.println(homer.age);

    }

    public void makeMusicians(){

        Musicians james = new Musicians("James", "Guitar", 50);
        System.out.println(james.instrument);

    }

    public void testMode(){
        int x = 4 + 4;
        System.out.println("value of x: " + x);
    }

    public int math(int a, int b){

        return a + b;
    }

    public String newMethod(String string){

        return string + " new method";
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }

}