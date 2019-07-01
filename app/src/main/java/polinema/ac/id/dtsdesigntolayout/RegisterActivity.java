package polinema.ac.id.dtsdesigntolayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegisterActivity extends AppCompatActivity {

    private final String TAG = RegisterActivity.class.getName();

    EditText editTextNama, editTextTanggalLahir, editTextUserName, editTextPassword;
    RadioButton radioButtonLaki, radioButtonPerempuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextNama = findViewById(R.id.edt_txt_nama);
        editTextTanggalLahir = findViewById(R.id.edt_tanggal_lahir);
        editTextUserName = findViewById(R.id.edt_username);
        editTextPassword = findViewById(R.id.edt_password);
        radioButtonLaki = findViewById(R.id.rb_laki);
        radioButtonPerempuan = findViewById(R.id.rb_perempuan);
    }

    public void postSignUp(View view) {
        String password = editTextPassword.getText().toString();
        String username = editTextUserName.getText().toString();
        String nama = editTextNama.getText().toString();
        String jk = radioButtonPerempuan.isChecked() ? "Perempuan" : "Laki-laki";
        String tanggal_lahir = editTextTanggalLahir.getText().toString();
        Log.d(TAG, "postSignUp: " + password);
        Log.d(TAG, "postSignUp: " + username);
        Log.d(TAG, "postSignUp: " + nama);
        Log.d(TAG, "postSignUp: " + jk);
        Log.d(TAG, "postSignUp: " + tanggal_lahir);
    }
}
