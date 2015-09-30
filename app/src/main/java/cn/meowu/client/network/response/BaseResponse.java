package cn.meowu.client.network.response;

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
            log = Tools.getClassFieldInfo(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return log;
    }
}
