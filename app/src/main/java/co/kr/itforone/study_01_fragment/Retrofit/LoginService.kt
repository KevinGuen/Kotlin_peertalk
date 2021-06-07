package co.kr.itforone.study_01_fragment.Retrofit

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginService {

    @FormUrlEncoded
    @POST("chk_login.php")
    fun signup(
        @Field("userid") userid: String,
        @Field("userpwd") userpwd: String,
    ): Call<DataSignin>



}