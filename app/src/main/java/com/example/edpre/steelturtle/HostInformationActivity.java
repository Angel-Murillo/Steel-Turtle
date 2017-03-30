package com.example.edpre.steelturtle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HostInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_information);
    }
    public void manageLinePage(View view)
    {
        Intent i = new Intent(this,ManageLineActivity.class);
        startActivity(i);
    }
}
