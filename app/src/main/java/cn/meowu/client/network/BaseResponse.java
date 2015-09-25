package cn.meowu.client.network;

public class BaseResponse {
    public final String info;
    public final int status;

    public BaseResponse(String info, int status) {
        this.info = info;
        this.status = status;
    }
}
