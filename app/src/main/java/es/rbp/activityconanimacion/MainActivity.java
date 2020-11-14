package es.rbp.activityconanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Activity principal desde la que se despliegan las demás activities
 *
 * @author Ricardo Bordería Pi
 * @see ActivityArriba
 * @see ActivityAbajo
 * @see ActivityDerecha
 * @see ActivityIzquierda
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnArriba = findViewById(R.id.btnArriba);
        ImageButton btnAbajo = findViewById(R.id.btnAbajo);
        ImageButton btnDerecha = findViewById(R.id.btnDerecha);
        ImageButton btnIzquierda = findViewById(R.id.btnIzquierda);

        btnArriba.setOnClickListener(this);
        btnAbajo.setOnClickListener(this);
        btnDerecha.setOnClickListener(this);
        btnIzquierda.setOnClickListener(this);
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
            case R.id.btnDerecha:
                toActivityDerecha();
                break;
            case R.id.btnIzquierda:
                toActivityIzquierda();
                break;
        }
    }

    /**
     * Crea el activity {@link ActivityArriba}
     */
    private void toActivityArriba() {
        Intent intent = new Intent(this, ActivityArriba.class);
        startActivity(intent);
    }

    /**
     * Crea el activity {@link ActivityAbajo}
     */
    private void toActivityAbajo() {
        Intent intent = new Intent(this, ActivityAbajo.class);
        startActivity(intent);
    }

    /**
     * Crea el activity {@link ActivityDerecha}
     */
    private void toActivityDerecha() {
        Intent intent = new Intent(this, ActivityDerecha.class);
        startActivity(intent);
    }

    /**
     * Crea el activity {@link ActivityIzquierda}
     */
    private void toActivityIzquierda() {
        Intent intent = new Intent(this, ActivityIzquierda.class);
        startActivity(intent);
    }
}