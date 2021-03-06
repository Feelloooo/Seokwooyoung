package com.example.feelman;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_program_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("GO! GO! 고고학!");

        Button button = findViewById(R.id.button); //다른 버튼 사용할 때 변수명 바꿔서 사용
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ggoomgil.go.kr/index.jsp"));
                startActivity(intent);
            }
        });
    }
}