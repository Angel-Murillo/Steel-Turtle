package com.example.andriod.protosteelturtle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManageLineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_line);
    }
    public void queuerListPage(View view)
    {
        Intent i = new Intent(this,QueuersListActivity.class);
        startActivity(i);
    }
}
