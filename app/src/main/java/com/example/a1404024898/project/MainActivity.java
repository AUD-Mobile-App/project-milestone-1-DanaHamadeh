package com.example.a1404024898.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    TextView trial;
    static final int READ_BLOCK_SIZE=100;
    String s=" ";


    ArrayList<String> Name;

    //text displayed
    String[] itemname={} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname,Name);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);




        //read text
        try {
            FileInputStream fileIn=openFileInput("myfile.txt");
            InputStreamReader InputRead=new InputStreamReader(fileIn);

            char[] buffer=new char[READ_BLOCK_SIZE];

            int charRead;
            int i=0;


            while((charRead=InputRead.read(buffer))>0)
            {

                String readstring= String.copyValueOf(buffer,0,charRead);
                s=s+readstring;
                itemname[i] = s;

                i++;


            }

            InputRead.close();

        } catch(Exception e)
        {e.printStackTrace();}


        // string to list


    }















    public void btnAdd(View v)
    {
        startActivity(new Intent(MainActivity.this,Main2Activity.class));

    }
}
