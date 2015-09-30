package cn.meowu.client.network;

import cn.meowu.client.network.response.MessageResponse;
import cn.meowu.client.network.response.SizeInfoResponse;
import cn.meowu.client.network.response.UserInfoResponse;
import cn.meowu.client.network.response.UserResponse;
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

    @GET("/index.php?s=/Travel/ajaxGetSiteInfo")
    Call<SizeInfoResponse> getSizeInfo(@Query("site") int id);

    @FormUrlEncoded
    @POST("/index.php?s=/Msg/ajaxGetMsg")
    Call<MessageResponse> getMessage(@Field("type") int type, @Field("page") int page, @Field("pagesize") int pagesize);
}
