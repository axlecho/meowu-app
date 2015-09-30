package cn.meowu.client.network;

import cn.meowu.client.network.model.UserInfo;

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
