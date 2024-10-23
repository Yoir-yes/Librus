package com.example.moblina.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("student/{id}/grades/")
    Call<List<Grade>> getStudentsGrades(@Path("id") int studentId);
}
