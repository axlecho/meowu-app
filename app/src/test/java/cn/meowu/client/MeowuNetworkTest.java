package cn.meowu.client;

import cn.meowu.client.network.LoginResponse;
import cn.meowu.client.network.MeowuNetwork;
import cn.meowu.client.utils.MeowuLog;
import java.io.IOException;
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
    private String testEmail = "axlecho@gmail.com";
    private String testPass = "";
    private String API_URL = "http://www.meowu.cn";

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
        Call<LoginResponse> call = meowu.login(testEmail, testPass);
        LoginResponse result = call.execute().body();
        Assert.assertEquals(0, result.status);
        MeowuLog.d(TAG, result.toString());
    }
}
