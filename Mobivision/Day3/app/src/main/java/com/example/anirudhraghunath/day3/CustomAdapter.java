package com.example.anirudhraghunath.day3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{
    ArrayList<String> weather;
    ArrayList<String> day;
    Context context;
    private static LayoutInflater inflater=null;
    public CustomAdapter(Context context, ArrayList<String> weatherList, ArrayList<String> dayList) {
        // TODO Auto-generated constructor stub
        weather = weatherList;
        day = dayList;
        this.context = context;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return day.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView day, weather;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.program_list, null);
        holder.day=(TextView) rowView.findViewById(R.id.dayTextView);
        holder.weather=(TextView) rowView.findViewById(R.id.weatherTextView);
        holder.day.setText(day.get(position));
        holder.weather.setText(weather.get(position));
        /*rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });*/
        return rowView;
    }

}
