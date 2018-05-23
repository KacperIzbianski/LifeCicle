package pl.swiebodzin.pzs.lifecicle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "aplikacja";
    private static final String NUMBER = "numer";
    //losowanie liczby
    Random random;
    TextView textView;
    int result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("life", "onCreate"); // tworzy logi
        Log.d(NUMBER, String.valueOf(result));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = new Random(); //losowanie i wyświetlenie tej liczby
        textView = findViewById(R.id.textView);
        result = random.nextInt(100);
        textView.setText(String.valueOf(result));
    }
// control + o pokazyje liste wszystkich metod
    //cykle życia aplikacji
    @Override
    protected void onStart() {
        Log.d(TAG, "onStart");
        Log.d(NUMBER, String.valueOf(result));
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG , "onResume");
        Log.d(NUMBER, String.valueOf(result));
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG , "onPause");
        Log.d(NUMBER, String.valueOf(result));
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG , "onStop");
        Log.d(NUMBER, String.valueOf(result));
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart");
        Log.d(NUMBER, String.valueOf(result));
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG , "onDestroy");
        Log.d(NUMBER, String.valueOf(result));
        super.onDestroy();
    }
}
