package org.o7planning.predictgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button startGameBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

       startGameBtn = (Button) findViewById(R.id.startGameButton);

       startGameBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mainIntent = new Intent(MenuActivity.this,MainActivity.class);
               startActivity(mainIntent);
           }
       });

    }
}