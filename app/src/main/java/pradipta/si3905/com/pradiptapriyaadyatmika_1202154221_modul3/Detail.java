package pradipta.si3905.com.pradiptapriyaadyatmika_1202154221_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    ImageView gambar, battery;
    TextView name, detail, liter;
    int count = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Air Mineral");

        //ambil forms yang ada
        name = findViewById(R.id.detailNama);
        detail = findViewById(R.id.detailDesc);
        liter = findViewById(R.id.liter);
        battery = findViewById(R.id.battery);


        //ambil Extra yang dikirim dari activity sebelumnya
        name.setText(getIntent().getStringExtra("nama"));
        detail.setText(getIntent().getStringExtra("detail"));
        //set level gambar menjadi 0 dulu
        battery.setImageLevel(0);
    }

    //apabila minus diklik
    public void minus(View view) {
        if (battery.getDrawable().getLevel() - 1 >= 0) {
            count=count-2;
            liter.setText(count + "L");
            battery.setImageLevel(battery.getDrawable().getLevel() - 1);
        } else {
            battery.setImageLevel(0);
            Toast.makeText(this, "Almost empty!", Toast.LENGTH_LONG).show();
        }
    }

    //apabila plus diklik
    public void plus(View view) {
        if (battery.getDrawable().getLevel() + 1 <=4) {
            count=count+2;
            liter.setText(count + "L");
            battery.setImageLevel(battery.getDrawable().getLevel() + 1);
        } else {
            battery.setImageLevel(4);
            Toast.makeText(this, "Full!", Toast.LENGTH_LONG).show();
        }
    }
}