package com.sahelsd.repbekooo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sahelsd.rep.LogBekooo;

public class MainActivity extends AppCompatActivity {

    private Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ok = findViewById(R.id.btn_ok);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogBekooo.noorpayy(MainActivity.this);
            }
        });

        LogBekooo.bekooo("bekoooooooooooooooooooooooooooo");
    }
}
