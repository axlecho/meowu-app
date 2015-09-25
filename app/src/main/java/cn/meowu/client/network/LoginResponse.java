package cn.meowu.client.network;

public class LoginResponse extends BaseResponse {
    static class Data {
        public final int uid;
        public final String uname;

        public Data(int uid, String uname) {
            this.uid = uid;
            this.uname = uname;
        }

        @Override
        public String toString() {
            return "uid:" + uid + " uname:" + uname;
        }
    }

    public final Data data;

    public LoginResponse(Data data, String info, int status) {
        super(info, status);
        this.data = data;
    }

    public String toString() {
        return super.toString() + "\n" + data.toString();
    }
}
