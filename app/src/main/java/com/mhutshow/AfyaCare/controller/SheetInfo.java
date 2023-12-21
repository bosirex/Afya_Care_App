package com.mhutshow.AfyaCare.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.mhutshow.AfyaCare.R;

public class SheetInfo extends AppCompatActivity {
    TextView t1 ,t2, t3, t4, t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet_info);
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView4);
        t3=findViewById(R.id.textView5);
        t4=findViewById(R.id.textView12);
        t5=findViewById(R.id.textView13);

        t1.setText("Date of creation: "+getIntent().getStringExtra("dateCreated"));
        t2.setText(getIntent().getStringExtra("doctor"));
        t3.setText(getIntent().getStringExtra("disease"));
        t4.setText(getIntent().getStringExtra("description"));
        t5.setText(getIntent().getStringExtra("treatment"));
    }
}
