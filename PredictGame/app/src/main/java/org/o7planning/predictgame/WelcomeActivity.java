package org.o7planning.predictgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try{
                    sleep(3500);
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    Intent menuIntent = new Intent(WelcomeActivity.this,MenuActivity.class);
                    startActivity(menuIntent);
                }
            }
        };

        thread.start();

    }
}