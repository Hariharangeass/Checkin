package com.example.rakesh.checkin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Daydialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daydialog);
        TextView t = (TextView) findViewById(R.id.dayno);
        String day_no = getIntent().getStringExtra("day");
        t.setText(day_no);
    }
    public void OK(View view)
    {
        finish();
    }
}
