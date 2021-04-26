package umn.ac.id.week10_28836;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMain1, btnMain2, btnMain3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMain1 = findViewById(R.id.main_button_change_1);
        btnMain2 = findViewById(R.id.main_button_change_2);
        btnMain3 = findViewById(R.id.main_button_change_3);

        btnMain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSatu = new Intent(MainActivity.this,AsyncTaskActivity.class);
                startActivityForResult(intentSatu,1);
            }
        });

        btnMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDua = new Intent(MainActivity.this,AsyncTaskLoaderActivity.class);
                startActivityForResult(intentDua,1);
            }
        });
        btnMain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTiga = new Intent(MainActivity.this,ServiceActivity.class);
                startActivityForResult(intentTiga,1);
            }
        });
    }
}