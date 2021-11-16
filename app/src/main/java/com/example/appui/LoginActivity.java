package com.example.appui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    private EditText et_name;
    private EditText et_pass;
    private Button btn_login;
    private Button btn_register;
    private Button btn_find;
    private Button btn_question;

    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference IDRef = mRootRef.child("login").child("ID");
    DatabaseReference PWRef = mRootRef.child("login").child("PW");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_name = (EditText) findViewById(R.id.et_name);
        et_pass = (EditText) findViewById(R.id.et_pass);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        btn_register = (Button) findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        btn_find = (Button) findViewById(R.id.btn_find);
        btn_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, FindActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        btn_question = (Button) findViewById(R.id.btn_question);
        btn_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, QuestionActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        IDRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                et_name.setText(text);
            }
            @Override
            public void onCancelled(DatabaseError databaseError){

            }

        });

        PWRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                et_pass.setText(text);
            }
            @Override
            public void onCancelled(DatabaseError databaseError){

            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IDRef.setValue(et_name.getText().toString());
                PWRef.setValue(et_pass.getText().toString());
            }
        });
    }

}