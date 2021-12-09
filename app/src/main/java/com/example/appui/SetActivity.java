package com.example.appui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SetActivity extends AppCompatActivity {

    private EditText et_enroll;
    private Button btn_enroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        et_enroll = (EditText) findViewById(R.id.et_enroll);
        btn_enroll = (Button) findViewById(R.id.btn_enroll);
    }
}