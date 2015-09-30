package cn.meowu.client.network.model;

public class UserInfo extends BaseModel {
    public final String name;
    public final String gender;
    public final String age;
    public final String address;
    public final String univs;
    public final String aboutme;

    public UserInfo(String name, String gender, String age, String address, String univs, String aboutme) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.univs = univs;
        this.aboutme = aboutme;
    }
}
