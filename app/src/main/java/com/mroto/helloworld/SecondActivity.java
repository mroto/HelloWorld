package com.mroto.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.PersistableBundle;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //logs:
        Log.e(SecondActivity.TAG, "onCreate");
        Toast.makeText(this, "SecondActivity: onCreate()", Toast.LENGTH_SHORT).show();
        //tornar valors a traves d'un Intent,setResult i finish:
        Intent resultIntent = new Intent();
        resultIntent.putExtra("returnValue", "string return value");
        setResult(Activity.RESULT_OK,resultIntent);
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(SecondActivity.TAG, "onStart");
        Toast.makeText(this, "SecondActivity: onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(SecondActivity.TAG, "onResume");
        Toast.makeText(this, "SecondActivity: onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(SecondActivity.TAG, "onPause");
        Toast.makeText(this, "SecondActivity: onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(SecondActivity.TAG, "onStop");
        Toast.makeText(this, "SecondActivity: onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(SecondActivity.TAG, "onRestart");
        Toast.makeText(this, "SecondActivity: onRestart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(SecondActivity.TAG, "onDestroy");
        Toast.makeText(this, "SecondActivity: onDestroy()", Toast.LENGTH_SHORT).show();
    }
}
