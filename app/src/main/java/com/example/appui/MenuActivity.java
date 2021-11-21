package com.example.appui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    private ImageView img_banner;
    private ImageView img_child;
    private ImageView img_choose;
    private ImageView img_set;
    private ImageView img_school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        img_banner = (ImageView) findViewById(R.id.img_banner);
        img_child = (ImageView) findViewById(R.id.img_child);
        img_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MapActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
        img_choose = (ImageView) findViewById(R.id.img_recommend);
        img_set = (ImageView) findViewById(R.id.img_set);
        img_school = (ImageView) findViewById(R.id.img_school);


    }
}