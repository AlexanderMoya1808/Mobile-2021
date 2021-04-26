package umn.ac.id.week11_28836;

import java.util.ArrayList;

import retrofit2.http.GET;
import retrofit2.Call;

public interface Services {

    @GET("posts")
    Call<ArrayList<Model>> getPost();
}