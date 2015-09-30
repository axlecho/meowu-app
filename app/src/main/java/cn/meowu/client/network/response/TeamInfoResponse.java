package cn.meowu.client.network.response;

import cn.meowu.client.network.model.TeamInfo;

public class TeamInfoResponse extends BaseResponse{
    public final TeamInfo[] data;
    public TeamInfoResponse(TeamInfo[] data, String info, int status) {
        super(info, status);
        this.data = data;
    }
}
