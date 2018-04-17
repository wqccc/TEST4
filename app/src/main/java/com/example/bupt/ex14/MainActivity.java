package com.example.bupt.ex14;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button1 = (Button) findViewById(R.id.button_main);
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)!=
//                        PackageManager.PERMISSION_GRANTED) {
//                    Toast.makeText(MainActivity.this, "缺少打电话权限", Toast.LENGTH_LONG).show();
//                    return;
//                }
//                String phonenumber = "13800138000";
//                String encodePhonenumber = null;
//                try{
//                    encodePhonenumber = URLEncoder.encode(phonenumber,"UTF-8");
//                }catch (UnsupportedEncodingException e){
//                    e.printStackTrace();
//                }
//                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + encodePhonenumber)));
//            }
//        });

        Button button2 = (Button) findViewById(R.id.button_main2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction("kjzxijfzi_f_nksnv");
                intent.addCategory("android.intent.category.DEFAULT");
                startActivity(intent);
            }
        });

    }
}