package com.example.jinming.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("ansari","second Activity created");
        /*resultTextView = (TextView) findViewById(R.id.textViewResult);
        *//*Bundle b = getIntent().getExtras();
        String r = b.getString("un");*//*
        String result = getIntent().getExtras().getString("un");

        Toast.makeText(this, "Data Received is : " + result , Toast.LENGTH_LONG).show();

        resultTextView.setText(result);*/

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ansari","second Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ansari","second Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ansari","second Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("ansari","second Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ansari","second Activity destroyed");
    }
}
