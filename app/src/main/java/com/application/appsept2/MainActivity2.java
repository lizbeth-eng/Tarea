package com.application.appsept2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    //agregar tag para invocar los estados de la app
    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");

        Context context = getApplicationContext();
        CharSequence text = "Acivity 2 se ha creado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 150, 150);
        toast.show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(regresar);
            }
        });
    }

    //evento on start
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart");
        Context context = getApplicationContext();
        CharSequence text = "Acivity 2 se ha iniciado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };

    //evento on resume
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume");
        Context context = getApplicationContext();
        CharSequence text = "Acivity 2 se ha recuperado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };

    //evento on pause
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");
        Context context = getApplicationContext();
        CharSequence text = "Acivity 2 se ha pausado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };

    //evento on stop
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop");
        Context context = getApplicationContext();
        CharSequence text = "Haz salido de Acivity 2";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };

    //evento on Destroy
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy");
        Context context = getApplicationContext();
        CharSequence text = "Acivity 2 se ha cerrado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };
}