package cn.meowu.client.network;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface MeowuNetwork {

    @FormUrlEncoded
    @POST("/index.php?s=/User/checkLogin")
    Call<LoginResponse> login(@Field("email") String email, @Field("pass") String pass);
}
