package com.example.carrito_compra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView tvCounter;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        tvCounter = (TextView) findViewById(R.id.tvCounter);
        boton = (Button) findViewById(R.id.botonAñadirProducto);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = Integer.parseInt(tvCounter.getText().toString());
                ++counter;
                tvCounter.setText(String.valueOf(counter));
            }
        });
    }
}
