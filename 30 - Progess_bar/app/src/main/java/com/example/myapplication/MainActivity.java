package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDownload;

    ProgressBar pbXuly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDownload = (Button) findViewById(R.id.buttonDownload);

        pbXuly = (ProgressBar) findViewById(R.id.progressBarXuLy);

        btnDownload.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                CountDownTimer countDownTimer = new CountDownTimer(10000, 500){
                    @Override
                    public void onTick(long l){

                        int current = pbXuly.getProgress();
                        if(current >= pbXuly.getMax()){
                            current = 0;
                        }
                        pbXuly.setProgress(current + 10);
                    }

                    @Override
                    public void onFinish(){
                        // chay nua :

                       // this.start();
                        Toast.makeText(MainActivity.this,"Time is over",Toast.LENGTH_LONG).show();
                    }

                    };
                countDownTimer.start();
                };


        });

    }
}