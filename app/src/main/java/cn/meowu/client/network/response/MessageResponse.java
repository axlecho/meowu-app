package cn.meowu.client.network.response;

import cn.meowu.client.network.model.Message;

public class MessageResponse extends BaseResponse {

    public final Message data[];

    public MessageResponse(Message data[], String info, int status) {
        super(info, status);
        this.data = data;
    }
}
