package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        Button ButtonDoDrugiego;
        Button otworzURL=null;
        ButtonDoDrugiego=findViewById(R.id.ButtonDoDrugiego);
        otworzURL = findViewById(R.id.otworzURL);
        ButtonDoDrugiego.setOnClickListener(this);
        otworzURL.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.ButtonDoDrugiego:
                Intent intene = new Intent(MainActivity.this, SecondActivity.class);
                Toast toast = Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT);
                toast.show();
                startActivity(intene);
                break;
            case R.id.otworzURL:
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://wp.pl"));
                toast = Toast.makeText(getApplicationContext(), "przejście do strony www", Toast.LENGTH_SHORT);
                toast.show();
                startActivity(intent);
                break;
        }
    }
}