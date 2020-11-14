package es.rbp.activityconanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Activity que se despliega desde la izquierda hasta la derecha
 */
public class ActivityIzquierda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izquierda);
    }
}