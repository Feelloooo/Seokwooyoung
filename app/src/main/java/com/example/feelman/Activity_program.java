package com.example.feelman;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_program extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("초중고 체험프로그램");

        Button button1 = findViewById(R.id.button1); //다른 버튼 사용할 때 변수명 바꿔서 사용
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_program_1.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button2); //다른 버튼 사용할 때 변수명 바꿔서 사용
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_program_2.class);
                startActivity(intent);
            }
        });
        Button button3 = findViewById(R.id.button3); //다른 버튼 사용할 때 변수명 바꿔서 사용
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_program_3.class);
                startActivity(intent);
            }
        });

    }
}