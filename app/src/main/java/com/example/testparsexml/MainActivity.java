package com.example.testparsexml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.testparsexml.model.Codebeautify;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "TAG";

    @Override
    protected void onStart() {
        super.onStart();
        getAllProviders();
    }

//    public static void main(String[] args) {
//        getAllProviders();
//    }
    public static void getAllProviders() {
        MyServicesInterface myServicesInterface = RetrofitInstance.getService();
        Call<Codebeautify> call = null;
        myServicesInterface.getAppointmentData().enqueue(new Callback<Codebeautify>() {
            @Override
            public void onResponse(Call<Codebeautify> call, Response<Codebeautify> response) {
                if (response.isSuccessful()) {

                    if (response.body() != null) {
                        Log.e(TAG, response.body().getInventoryUpdateResponse().getProduct().toString());
                    } else {
                        Log.e(TAG, "No Data for body");
                    }
                } else if (response.code() == 404) {
                    Log.e(TAG, " server error 404 not found ");

                }
            }

            @Override
            public void onFailure(Call<Codebeautify> call, Throwable t) {
                Log.e(TAG, t.getMessage());
            }
        });



    }
}
