package cn.meowu.client.network;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

public interface MeowuNetwork {

    @FormUrlEncoded
    @POST("/index.php?s=/User/checkLogin")
    Call<UserResponse> login(@Field("email") String email, @Field("pass") String pass);

    @FormUrlEncoded
    @POST("/index.php?s=/User/add")
    Call<UserResponse> register(@Field("email") String email, @Field("pass") String pass, @Field("repass") String repass);

    @GET("/index.php?s=/User/nameCard")
    Call<UserInfoResponse> getUserInfo(@Query("uid") int uid);
}
