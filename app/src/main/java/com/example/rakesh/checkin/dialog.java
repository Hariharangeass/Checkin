package com.example.rakesh.checkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void checkin(View view)
    {
        Toast.makeText(getApplicationContext(),"CHCECKED IN",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(dialog.this,Daydialog.class);
        String day_no = "Day 1";//pass from backend accordingly
        intent.putExtra("day",day_no);
        startActivity(intent);
        finish();
    }

    public void close(View view)
    {
        finish();
    }
}
