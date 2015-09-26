package cn.meowu.client;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

import java.io.IOException;

import cn.meowu.client.network.BaseResponse;
import cn.meowu.client.network.UserInfoResponse;
import cn.meowu.client.network.UserResponse;
import cn.meowu.client.network.MeowuNetwork;
import cn.meowu.client.utils.MeowuLog;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MeowuNetworkTest {

    private MeowuNetwork meowu;
    private String testEmail = "123456@qq.com";
    private String testPass = "123456";
    private String API_URL = "http://www.meowu.cn";
    private int testUid = 311;
    private static final String TAG = MeowuNetworkTest.class.getSimpleName();

    @Before
    public void init() {
        ShadowLog.stream = System.out;  // 日志输出
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        meowu = retrofit.create(MeowuNetwork.class);
    }

    @Test
    public void testLogin() throws IOException {
        Call<UserResponse> call = meowu.login(testEmail, testPass);
        UserResponse result = call.execute().body();
        Assert.assertEquals(0, result.status);
        MeowuLog.d(TAG, result.toString());
    }

    @Test
    public void testRegister() throws IOException {
        Call<UserResponse> call = meowu.register(testEmail, testPass, testPass);
        UserResponse result = call.execute().body();
        Assert.assertEquals(100, result.status);
        MeowuLog.d(TAG, result.toString());
    }

    @Test
    public void testGetUserInfo() throws IOException {
        Call<UserInfoResponse> call = meowu.getUserInfo(testUid);
        UserInfoResponse result = call.execute().body();
        Assert.assertEquals(0, result.status);
        MeowuLog.d(TAG, result.toString());
    }
}
