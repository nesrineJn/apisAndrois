package com.isetb.regressapis;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("users")
    Call<UserResponse> getUsers();
}
