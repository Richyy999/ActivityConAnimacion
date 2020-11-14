package es.rbp.activityconanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Activity que se despliega desde arriba hasta abajo
 *
 * @author Ricardo Bordería Pi
 */
public class ActivityArriba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arriba);
    }
}