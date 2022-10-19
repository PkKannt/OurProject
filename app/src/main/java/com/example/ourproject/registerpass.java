package com.example.ourproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class registerpass extends Activity {
    Button btnReturn,btnExit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_password);
        btnExit = (Button) findViewById(R.id.btnExit1);
        btnReturn = (Button) findViewById(R.id.btnReturn1);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registerpass.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
