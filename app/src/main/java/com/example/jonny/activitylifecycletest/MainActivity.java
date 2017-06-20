package com.example.jonny.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"OnRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"OnCreate");
        setContentView(R.layout.activity_main);
        Button startNormalActivity = (Button)findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button)findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });


    }
}
