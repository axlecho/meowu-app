package cn.meowu.client.network.response;

import cn.meowu.client.network.model.UserInfo;
import cn.meowu.client.network.response.BaseResponse;

/**
 * Created by axlecho on 2015/9/26.
 */
public class UserInfoResponse extends BaseResponse {
    public final UserInfo data;

    public UserInfoResponse(UserInfo data, String info, int status) {
        super(info, status);
        this.data = data;
    }
}
