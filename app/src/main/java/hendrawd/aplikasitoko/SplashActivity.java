package hendrawd.aplikasitoko;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    // konstan yang digunakan untuk memberikan delay
    private static final long SPLASH_DELAY_IN_MILLIS = 3_000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //memberi delay 3 detik sebelum membukan activity main
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // membuat intent baru untuk membuka MainActivity
                Intent openMainActivityIntent = new Intent(
                        SplashActivity.this,
                        MainActivity.class
                );

                // menghapus semua activity sebelumnya dari backstack
                openMainActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                // buka MainActivity
                startActivity(openMainActivityIntent);
            }
        }, SPLASH_DELAY_IN_MILLIS);
    }
}
