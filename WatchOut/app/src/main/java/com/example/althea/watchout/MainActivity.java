package com.example.althea.watchout;

import clarifai2.api.ClarifaiBuilder;
import clarifai2.api.ClarifaiClient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ClarifaiClient client = new ClarifaiBuilder("LtmIDE212RqiaK-5_vfHolQa4FNbMBCMN_YhH1B1", "OG8KvigqZhec_FNO02iC2LHEpJ-m9fwrSlCBWdeL").buildSync();  
    }
}
