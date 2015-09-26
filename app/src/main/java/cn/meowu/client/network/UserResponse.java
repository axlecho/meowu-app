package cn.meowu.client.network;

import cn.meowu.client.utils.Tools;

public class UserResponse extends BaseResponse {
    static class Data {
        public final int uid;
        public final String uname;

        public Data(int uid, String uname) {
            this.uid = uid;
            this.uname = uname;
        }

        @Override
        public String toString() {
            String log = "";
            try {
                log = Tools.getClassFieldInfo(this.getClass(), this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return log;
        }
    }

    public final Data data;

    public UserResponse(Data data, String info, int status) {
        super(info, status);
        this.data = data;
    }

    public String toString() {
        return super.toString() + "\n" + data.toString();
    }
}
