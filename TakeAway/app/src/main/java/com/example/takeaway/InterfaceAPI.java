package com.example.takeaway;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface InterfaceAPI {
    @POST("/verify")
    Call<Void> verifyUser(@Body Users usuario);
}
