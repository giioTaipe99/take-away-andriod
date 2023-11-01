package com.example.takeaway;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    private static final String BASE_URL = "https://a2b9-92-189-156-145.ngrok-free.app/";

    static final retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static InterfaceAPI getApiService() {
        return retrofit.create(InterfaceAPI.class);
    }
}
