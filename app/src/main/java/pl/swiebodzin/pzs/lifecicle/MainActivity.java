package pl.swiebodzin.pzs.lifecicle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("life", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        Log.d("life", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("life" , "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("life" , "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("life" , "onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("life", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("life" , "onDestroy");
        super.onDestroy();
    }
}
