package com.example.zhangyangzuo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
    @Override
    public void onBackPressed(){
        Intent intent =new Intent();
        intent.putExtra("shit2", "2222222");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button2 = (Button) findViewById(R.id.button2);
//        Intent intent = getIntent();
//        final String data = intent.getStringExtra("data");
//        Log.d("shit",data);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"data",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent("com.example.zhangyangzuo.myapplication.ACTION_START");
//                intent.setClass(SecondActivity.this,ThirdActivity.class);
//                startActivity(intent);
                  Intent intent =new Intent();
                  intent.putExtra("shit2", "2222222");
                  setResult(RESULT_OK,intent);
                  finish();
            }

        });
    }
}
