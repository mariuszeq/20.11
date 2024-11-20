package com.example.a2011;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<ImageView> obrazy = new ArrayList<>();

    Button buttonRczucKoscmi;
    Button buttonResetWyniku;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    TextView textViewWynikLosowania;
    TextView textViewWynikGry;
    int liczba1;
    int liczba2;
    int liczba3;
    int liczba4;
    int liczba5;
    int wynikLosowania;
    int wynikGry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageView4 = findViewById(R.id.imageView5);
        imageView5 = findViewById(R.id.imageView6);
        obrazy.add(imageView1);
        obrazy.add(imageView2);
        obrazy.add(imageView3);
        obrazy.add(imageView4);
        obrazy.add(imageView5);

        buttonRczucKoscmi = findViewById(R.id.button);
        buttonResetWyniku = findViewById(R.id.button2);

        textViewWynikLosowania = findViewById(R.id.textView2);
        textViewWynikGry = findViewById(R.id.textView3);

        int [] kosci = new int[]{R.drawable.kostka1, R.drawable.kostka2, R.drawable.kostka3, R.drawable.kostka4, R.drawable.kostka5};

        buttonRczucKoscmi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        liczba1 = (int) (Math.random() * 5 + 1);
                        liczba2 = (int) (Math.random() * 5 + 1);
                        liczba3 = (int) (Math.random() * 5 + 1);
                        liczba4 = (int) (Math.random() * 5 + 1);
                        liczba5 = (int) (Math.random() * 5 + 1);

                        if (liczba1 == 1){
                            imageView1.setImageResource(R.drawable.kostka1);
                        }else if(liczba1 == 2){
                            imageView1.setImageResource(R.drawable.kostka2);
                        }else if(liczba1 == 3){
                            imageView1.setImageResource(R.drawable.kostka3);
                        }else if(liczba1 == 4){
                            imageView1.setImageResource(R.drawable.kostka4);
                        }else {
                            imageView1.setImageResource(R.drawable.kostka5);
                        }
                        if (liczba2 == 1){
                            imageView2.setImageResource(R.drawable.kostka1);
                        }else if(liczba2 == 2){
                            imageView2.setImageResource(R.drawable.kostka2);
                        }else if(liczba2 == 3){
                            imageView2.setImageResource(R.drawable.kostka3);
                        }else if(liczba2 == 4){
                            imageView2.setImageResource(R.drawable.kostka4);
                        }else {
                            imageView2.setImageResource(R.drawable.kostka5);
                        }

                        if (liczba3 == 1){
                            imageView3.setImageResource(R.drawable.kostka1);
                        }else if(liczba3 == 2){
                            imageView3.setImageResource(R.drawable.kostka2);
                        }else if(liczba3 == 3){
                            imageView3.setImageResource(R.drawable.kostka3);
                        }else if(liczba3 == 4){
                            imageView3.setImageResource(R.drawable.kostka4);
                        }else {
                            imageView3.setImageResource(R.drawable.kostka5);
                        }

                        if (liczba4 == 1){
                            imageView4.setImageResource(R.drawable.kostka1);
                        }else if(liczba4 == 2){
                            imageView4.setImageResource(R.drawable.kostka2);
                        }else if(liczba4 == 3){
                            imageView4.setImageResource(R.drawable.kostka3);
                        }else if(liczba4 == 4){
                            imageView4.setImageResource(R.drawable.kostka4);
                        }else {
                            imageView4.setImageResource(R.drawable.kostka5);
                        }
                        if (liczba5 == 1){
                            imageView5.setImageResource(R.drawable.kostka1);
                        }else if(liczba5 == 2){
                            imageView5.setImageResource(R.drawable.kostka2);
                        }else if(liczba5 == 3){
                            imageView5.setImageResource(R.drawable.kostka3);
                        }else if(liczba5 == 4){
                            imageView5.setImageResource(R.drawable.kostka4);
                        }else {
                            imageView5.setImageResource(R.drawable.kostka5);
                        }
                        wynikLosowania = liczba1 + liczba2 + liczba3 + liczba4 + liczba5;
                        wynikGry = wynikLosowania + wynikGry;
                        textViewWynikLosowania.setText("wynik losowania " + wynikLosowania);
                        textViewWynikGry.setText("wynik Gry " + wynikGry);
                    }
                }
        );


        buttonResetWyniku.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        imageView1.setImageResource(R.drawable.kosci);
                        imageView2.setImageResource(R.drawable.kosci);
                        imageView3.setImageResource(R.drawable.kosci);
                        imageView4.setImageResource(R.drawable.kosci);
                        imageView5.setImageResource(R.drawable.kosci);

                        wynikGry = 0;
                        wynikLosowania = 0;
                        textViewWynikLosowania.setText("wynik losowania " + wynikLosowania);
                        textViewWynikGry.setText("wynik Gry " + wynikGry);

                    }
                }
        );





    }
}