package pradipta.si3905.com.pradiptapriyaadyatmika_1202154221_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashScreen extends AppCompatActivity {

    int splashDelay = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        //buat handler untuk post delayed
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                //pindah activity ke Login
                Intent pindahactivity = new Intent(getApplicationContext(), Login.class);
                startActivity(pindahactivity);

                //menutup activity ini setelah pindah activity
                finish();
            }

            //masukkan delaynya
        }, splashDelay);

    }


}
