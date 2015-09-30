package cn.meowu.client.network;

import cn.meowu.client.network.model.SizeInfo;

public class SizeInfoResponse extends BaseResponse {

    public final SizeInfo data;

    public SizeInfoResponse(SizeInfo data, String info, int status) {
        super(info, status);
        this.data = data;
    }
}
