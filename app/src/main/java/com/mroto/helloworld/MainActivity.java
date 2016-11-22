package com.mroto.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(MainActivity.TAG, "onCreate");
        Toast.makeText(this, "MainActivity: onCreate()", Toast.LENGTH_SHORT).show();

        //lanza secondActivity con result:
        Intent myIntent = new Intent(this, SecondActivity.class);
        startActivityForResult(myIntent, 0);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(MainActivity.TAG, "onActivityResult: Todo controlado, returnValue="+data.getStringExtra("returnValue"));
        Toast.makeText(this,"onActivityResult: Todo controlado, returnValue="+data.getStringExtra("returnValue"), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MainActivity.TAG, "onStart");
        Toast.makeText(this, "MainActivity: onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MainActivity.TAG, "onResume");
        Toast.makeText(this, "MainActivity: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MainActivity.TAG, "onPause");
        Toast.makeText(this, "MainActivity: onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MainActivity.TAG, "onStop");
        Toast.makeText(this, "MainActivity: onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MainActivity.TAG, "onRestart");
        Toast.makeText(this, "MainActivity: onRestart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MainActivity.TAG, "onDestroy");
        Toast.makeText(this, "MainActivity: onDestroy()", Toast.LENGTH_SHORT).show();
    }
}
