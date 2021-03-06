package thiagocury.eti.br.exciclodevidalogcatapi19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /* Atributo denominado TAG para organizar e
       localizar mais facilmente os nossos logs */
    private static final String TAG = "meusLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Entrou no onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Entrou no onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Entrou no onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Entrou no onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Entrou no onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Entrou no onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Entrou no onDestroy");
    }
}
