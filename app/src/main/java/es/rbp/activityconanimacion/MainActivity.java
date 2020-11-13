package es.rbp.activityconanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnArriba = findViewById(R.id.btnArriba);
        Button btnAbajo = findViewById(R.id.btnAbajo);

        btnArriba.setOnClickListener(this);
        btnAbajo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnArriba:
                toActivityArriba();
                break;
            case R.id.btnAbajo:
                toActivityAbajo();
                break;
        }
    }

    /**
     * Crea el activity ActivityArriba
     */
    private void toActivityArriba() {
        Intent intent = new Intent(this, ActivityArriba.class);
        startActivity(intent);
    }

    /**
     * Crea el activity ActivityAbajo
     */
    private void toActivityAbajo() {
        Intent intent = new Intent(this, ActivityAbajo.class);
        startActivity(intent);
    }
}