package com.example.zhangyangzuo.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LogDemo extends AppCompatActivity {
    @Override
    //create activity menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    //add toast response for each menu
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"Remove",Toast.LENGTH_SHORT).show();
                break;

            default:
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode)
        {
            case 1:
                if( resultCode == RESULT_OK)
                {
                    String returndata = data.getStringExtra("shit2");
                    Log.d("shitnumber",returndata);
                }
                break;
                default:
        }
    }

    //  private static final String Activity_tag = "LogDemo";
//  private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button = (Button) findViewById(R.id.button);
        Button close =(Button) findViewById(R.id.close);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LogDemo.this,"You click button",
                Toast.LENGTH_SHORT).show();
                //Intent start
                Intent intent =new Intent(LogDemo.this , SecondActivity.class);
//                Intent intent = new Intent("com.example.zhangyangzuo.myapplication.ACTION_START");
//                intent.setClass(LogDemo.this,SecondActivity.class);
//                intent.addCategory("com.example.zhangyangzuo.myapplication.My_Category");
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                String data = "hhhhhha";
//                intent.putExtra("data",data);
//                startActivity(intent);
                startActivityForResult(intent,1);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        setContentView(R.layout.main);

//        Log.d("LogDemo","shitt++");
//        Log.d(Activity_tag, "onCreate: shitt++");
//        bt = (Button)findViewById(R.id.bt);
//        bt.setOnClickListener(new Button.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Log.v(LogDemo.Activity_tag,"This is Verbose");
//                Log.d(LogDemo.Activity_tag, "This is Debug");
//                Log.e(LogDemo.Activity_tag, "this is Error");
//                Log.i(LogDemo.Activity_tag, "This is information");
//                Log.w(LogDemo.Activity_tag,"this is warning");
//            }
//        });
    }
}
