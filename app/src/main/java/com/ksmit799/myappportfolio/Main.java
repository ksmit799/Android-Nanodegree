package com.ksmit799.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View v)
    {
        //Display Message
        switch (v.getId())
        {
            case(R.id.moviesButton):
                Toast.makeText(getApplicationContext(), "This button will launch my movies app!", Toast.LENGTH_SHORT).show();
                //Load app here
            break;
            case(R.id.hawkButton):
                Toast.makeText(getApplicationContext(), "This button will launch my stock hawk app!", Toast.LENGTH_SHORT).show();
                //Load app here
            break;
            case(R.id.buildButton):
                Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
                //Load app here
            break;
            case(R.id.materialButton):
                Toast.makeText(getApplicationContext(), "This button will launch my make your app material app!", Toast.LENGTH_SHORT).show();
                //Load app here
            break;
            case(R.id.goButton):
                Toast.makeText(getApplicationContext(), "This button will launch my go ubiquitous app!", Toast.LENGTH_SHORT).show();
                //Load app here
            break;
            case(R.id.capstoneButton):
                Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
                //Load app here
            break;
        }
    }

}
