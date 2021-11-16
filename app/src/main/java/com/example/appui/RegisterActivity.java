package com.example.appui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText et_name;
    private EditText et_pass;
    private EditText et_mail;
    private EditText et_codenum;
    private EditText et_birth;
    private EditText et_school;
    private Button btn_request;
    private Button btn_ok;
    private Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_name = (EditText) findViewById(R.id.et_name);
        et_pass = (EditText) findViewById(R.id.et_pass);
        et_mail = (EditText) findViewById(R.id.et_mail);
        et_codenum = (EditText) findViewById(R.id.et_codenum);
        et_birth = (EditText) findViewById(R.id.et_birth);
        et_school = (EditText) findViewById(R.id.et_school);
        btn_request = (Button) findViewById(R.id.btn_request);
        btn_ok = (Button) findViewById(R.id.btn_ok);
        btn_register = (Button) findViewById(R.id.btn_register);
    }
}