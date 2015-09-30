package cn.meowu.client.network.model;

public class UserInfoShort extends BaseModel {
    public final int uid;
    public final String uname;

    public UserInfoShort(int uid, String uname) {
        this.uid = uid;
        this.uname = uname;
    }
}
