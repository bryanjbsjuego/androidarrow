package com.example.sistemaarrow.io

import com.example.sistemaarrow.io.response.LoginResponse
import com.example.sistemaarrow.model.Contrato
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("contratos")
    abstract fun getContratos(): Call<ArrayList<Contrato>>

    @GET("login")
    fun postLogin(@Query("email") email: String, @Query("password") password:String):
                  Call<LoginResponse>

    companion object Factory{
        private const val BASE_URL="http://192.168.0.8:8000/api/"
        fun create():ApiService{
            val retrofit=Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiService::class.java)
        }
    }
}