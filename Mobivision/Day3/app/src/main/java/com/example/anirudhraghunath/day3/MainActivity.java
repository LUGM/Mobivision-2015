package com.example.anirudhraghunath.day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView weatherListView;
    ArrayList<String> days, weather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        days = new ArrayList<String>();
        days.add(0, "Sunday");
        days.add(1, "Monday");
        days.add(2, "Tuesday");
        days.add(3, "Wednesday");
        days.add(4, "Thursday");
        days.add(5, "Friday");
        days.add(6, "Saturday");
        weather = new ArrayList<String>();
        weather.add(0, "Sunny");
        weather.add(1, "Rainy");
        weather.add(2, "Cloudy");
        weather.add(3, "Partly Cloudy");
        weather.add(4, "Light Showers");
        weather.add(5, "Thunderstorm");
        weather.add(6, "Sunny");


        weatherListView = (ListView)findViewById(R.id.weatherListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, days);

        //weatherListView.setAdapter(adapter);
        weatherListView.setAdapter(new CustomAdapter(this, weather, days));
    }


}
