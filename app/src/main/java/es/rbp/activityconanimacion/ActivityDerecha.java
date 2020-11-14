package es.rbp.activityconanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Activity que se despliega desde la derecha hacia la izquierda
 *
 * @author Ricardo Bordería Pi
 */
public class ActivityDerecha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derecha);
    }
}