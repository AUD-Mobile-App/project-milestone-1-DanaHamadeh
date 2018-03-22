package com.example.a1404024898.project;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 1404024898 on 3/13/2018.
 */



public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final ArrayList<String> Name;


    public CustomListAdapter(Activity context, String[] itemname,ArrayList<String> Name) {
        super(context, R.layout.mylist, itemname);
        this.context = context;
        this.itemname = itemname;
        this.Name=Name;
    }



    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textView);
        Button Check = (Button) rowView.findViewById(R.id.button);
        txtTitle.setText(itemname[position]);

        return rowView;
    }
}
