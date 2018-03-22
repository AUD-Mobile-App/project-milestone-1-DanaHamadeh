package com.example.a1404024898.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main2Activity extends AppCompatActivity {
    EditText content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       content=(EditText)findViewById(R.id.txtContent);

    }


    //writing
    public void btnSave (View v)
    {try {
        FileOutputStream fileout=openFileOutput("myfile.txt",MODE_APPEND);
        OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
        outputWriter.append(content.getText().toString());
        outputWriter.close();
        Toast.makeText(getBaseContext(),"Content Added !",Toast.LENGTH_SHORT).show();

    }catch (Exception e)
    {e.printStackTrace();}

startActivity(new Intent(Main2Activity.this,MainActivity.class));


    }
}
