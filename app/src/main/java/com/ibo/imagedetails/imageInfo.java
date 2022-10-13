package com.ibo.imagedetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class imageInfo extends AppCompatActivity {
    ImageView imageViewIn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_info);

        imageViewIn=findViewById(R.id.imageViewInfo);
        textView=findViewById(R.id.textViewInfo);

        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");
        String key=bundle.getString("myKey");
        if(key.equals("android")){
                imageViewIn.setImageDrawable(getResources().getDrawable(R.drawable.android));
                textView.setText(name);
        }else {
            imageViewIn.setImageDrawable(getResources().getDrawable(R.drawable.java));
            textView.setText(name);
        }


    }
}