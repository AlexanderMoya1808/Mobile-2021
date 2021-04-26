package umn.ac.id.week08_28836;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMain1, btnMain2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMain1 = findViewById(R.id.main_button_change_1);
        btnMain2 = findViewById(R.id.main_button_change_2);

        btnMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSatu = new Intent(MainActivity.this,TextEditorActivity.class);
                startActivityForResult(intentSatu,1);
            }
        });

        btnMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this,CounterActivity.class);
                startActivityForResult(intentDua,1);
            }
        });
    }
}