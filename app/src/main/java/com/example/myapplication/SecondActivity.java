package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button ButtonDoPierwszego;
    private ActionBar toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ButtonDoPierwszego =(Button) findViewById(R.id.ButtonDoPierwszego);
        ButtonDoPierwszego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intene = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intene);
                toast.show();
            }
        });
    }
}