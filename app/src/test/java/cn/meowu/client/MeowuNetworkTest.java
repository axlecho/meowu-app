package cn.meowu.client;

import cn.meowu.client.network.MeowuNetwork;
import cn.meowu.client.network.response.MessageResponse;
import cn.meowu.client.network.response.SizeInfoResponse;
import cn.meowu.client.network.response.UserInfoResponse;
import cn.meowu.client.network.response.UserResponse;
import cn.meowu.client.utils.MeowuLog;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;
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
    private int testSizeId = 1210;
    private static final String TAG = MeowuNetworkTest.class.getSimpleName();

    @Before
    public void init() {
        ShadowLog.stream = System.out;  // 日志输出
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getManageCookieClient())
                .build();

        meowu = retrofit.create(MeowuNetwork.class);
    }


    // User
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


    // Travel
    @Test
    public void testGetSiteInfo() throws IOException {
        Call<SizeInfoResponse> call = meowu.getSizeInfo(testSizeId);
        SizeInfoResponse result = call.execute().body();
        Assert.assertEquals(0, result.status);
        MeowuLog.d(TAG, result.toString());
    }

    // Message
    @Test
    public void testGetMessage() throws IOException {
        Call<UserResponse> logincall = meowu.login("axlecho@gmail.com", "!me433978029");
        logincall.execute();

        Call<MessageResponse> call = meowu.getMessage(4, 0, 15);
        MessageResponse result = call.execute().body();
        Assert.assertEquals(0, result.status);
        MeowuLog.d(TAG, result.toString());
    }

    private OkHttpClient getManageCookieClient() {
        OkHttpClient client = new OkHttpClient();
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        client.setCookieHandler(cookieManager);
        return client;
    }


}
