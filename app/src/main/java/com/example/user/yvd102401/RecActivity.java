package com.example.user.yvd102401;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);
        TextView tv = (TextView) findViewById(R.id.textView2);
        Intent it = getIntent();
        String data = it.getStringExtra(Intent.EXTRA_TEXT);
        tv.setText(data);
    }
}
