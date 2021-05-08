package com.khcpietro.smc.grandtheftalarm.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api/reportTheft")
    Call<DefaultResponse> reportTheft(@Query("deviceId") String deviceId, @Query("userName") String userName);
}
