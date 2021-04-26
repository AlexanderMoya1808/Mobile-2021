package umn.ac.id.week11_28836;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Services postServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        postServices = API.getClient().create(Services.class);
        setup();
    }

    private void setup() {
        Call<ArrayList<Model>> callPost = postServices.getPost();
        callPost.enqueue(new Callback<ArrayList<Model>>() {
            @Override
            public void onResponse(Call<ArrayList<Model>> call, Response<ArrayList<Model>> response) {
                ArrayList<Model> hasilPost = response.body();
                recyclerView.setAdapter(new Adapter(hasilPost));
            }

            @Override
            public void onFailure(Call<ArrayList<Model>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Gagal!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}