package com.example.appui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FindActivity extends AppCompatActivity {

    private TextView tv_state;
    private TextView tv_pass;
    private EditText et_name;
    private EditText et_mail;
    private Button btn_compare;
    private Button btn_find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        tv_state = (TextView) findViewById(R.id.tv_state);
        tv_pass = (TextView) findViewById(R.id.tv_pass);
        et_name = (EditText) findViewById(R.id.et_name);
        et_mail = (EditText) findViewById(R.id.et_mail);
        btn_compare = (Button) findViewById(R.id.btn_compare);
        btn_find = (Button) findViewById(R.id.btn_find);
    }
}