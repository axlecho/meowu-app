package cn.meowu.client.network;

import java.lang.reflect.Field;

import cn.meowu.client.utils.Tools;

/**
 * Created by axlecho on 2015/9/26.
 */
public class UserInfoResponse extends BaseResponse {

    static class Data {
        public final String name;
        public final String gender;
        public final String age;
        public final String address;
        public final String univs;
        public final String aboutme;

        public Data(String name, String gender, String age, String address, String univs, String aboutme) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.address = address;
            this.univs = univs;
            this.aboutme = aboutme;
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

    public UserInfoResponse(Data data, String info, int status) {
        super(info, status);
        this.data = data;
    }

    public String toString() {
        return super.toString() + "\n" + data.toString();
    }
}
