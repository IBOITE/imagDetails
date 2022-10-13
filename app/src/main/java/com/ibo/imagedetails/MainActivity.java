package com.ibo.imagedetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageandroid,imagejava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageandroid=findViewById(R.id.imageAndroid);
        imagejava=findViewById(R.id.imageJava);

        imageandroid.setOnClickListener(this);
        imagejava.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageAndroid:
                //Toast.makeText(MainActivity.this,"android",Toast.LENGTH_SHORT).show();
                Intent intentandroid=new Intent(MainActivity.this,imageInfo.class);
                intentandroid.putExtra("name","android os");
                intentandroid.putExtra("myKey","android");
                startActivity(intentandroid);
                break;
            case R.id.imageJava:
                //Toast.makeText(MainActivity.this,"java",Toast.LENGTH_SHORT).show();
                Intent intentjava=new Intent(MainActivity.this,imageInfo.class);
                intentjava.putExtra("name","java programing");
                intentjava.putExtra("myKey","java");
                startActivity(intentjava);
                break;

        }

    }
}