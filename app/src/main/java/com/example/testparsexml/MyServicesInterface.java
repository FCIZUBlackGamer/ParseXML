package com.example.testparsexml;

import com.example.testparsexml.model.Codebeautify;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MyServicesInterface {

    @GET("/test.php")
    Call<Codebeautify> getAppointmentData();

}
