package cn.meowu.client.network.response;

import cn.meowu.client.network.model.SizeInfo;
import cn.meowu.client.network.response.BaseResponse;

public class SizeInfoResponse extends BaseResponse {

    public final SizeInfo data;

    public SizeInfoResponse(SizeInfo data, String info, int status) {
        super(info, status);
        this.data = data;
    }
}
