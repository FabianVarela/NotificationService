package com.developer.fabian.notificationservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText texto = findViewById(R.id.texto_mensaje);

        Intent intent = new Intent(this, MessageService.class);
        intent.putExtra(MessageService.MENSAJE_EXTRA,texto.getText()+"");
        startService(intent);
    }
}
