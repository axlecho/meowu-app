package cn.meowu.client.network;

import cn.meowu.client.utils.Tools;

public class BaseResponse {
    public final String info;
    public final int status;

    public BaseResponse(String info, int status) {
        this.info = info;
        this.status = status;
    }

    @Override
    public String toString() {
        String log = "";
        try {
            BaseResponse b = (BaseResponse) this;
            log = Tools.getClassFieldInfo(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return log;
    }
}
