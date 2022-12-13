package com.example.rozkladliczbnaczynnikipierwsze

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.oblicz).setOnClickListener {
            var number= findViewById<EditText>(R.id.wpisz).text.toString().toInt()
            var blad="Podaj wieksza liczbe"
            if (number < 2)
            {
                findViewById<TextView>(R.id.wynik).text="$blad"
            }
            else
            {
                var factors= ""
                for(i in 2..number)
                {
                    while(number%i==0)
                    {
                        factors += "$i; "
                        number /= i
                    }
                }
                findViewById<TextView>(R.id.wynik).text="$factors"
            }

        }
    }

}