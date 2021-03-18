package umn.ac.id.alexandermoyahin_28836;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    TextView tvError;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        tvError = findViewById(R.id.errorMessage);
        btnLogin = findViewById(R.id.login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etUsername.getText().toString().equals("uasmobile") && etPassword.getText().toString().equals("uasmobilegenap") ){
                    Intent intentLogin = new Intent(LoginActivity.this,TabActivity.class);
                    startActivityForResult(intentLogin,1);
                }else{
                    tvError.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}