package pradipta.si3905.com.pradiptapriyaadyatmika_1202154221_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //ambil edittext
    EditText inputUser;
    EditText inputPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //ambil berdasarkan id
        inputUser = (EditText) findViewById(R.id.user);
        inputPass = (EditText) findViewById(R.id.pass);

    }

    public void toMain(View view) {

        //ubah text menjadi string
        String username = inputUser.getText().toString();
        String password = inputPass.getText().toString();

        if(username.equals("EAD") && password.equals("MOBILE")){

            //pindah activity
            Intent login = new Intent(getApplicationContext(),RecyclerViewActivity.class);

            //Toast login berhasil
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();

            //lakukan pindah activity
            startActivity(login);

            //hentikan activity
            finish();

        } else {

            //Toast login gagal
            Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();

        }


    }
}
