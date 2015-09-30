package cn.meowu.client.network.response;

import cn.meowu.client.network.model.UserInfoShort;

public class UserResponse extends BaseResponse {

    public final UserInfoShort data;

    public UserResponse(UserInfoShort data, String info, int status) {
        super(info, status);
        this.data = data;
    }
}
