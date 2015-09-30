package cn.meowu.client.network.model;

public class Message extends BaseModel {
    public final int id;
    public final int uid;
    public final int authorid;
    public final String note;
    public final int dateline;
    public final int type;
    public final String nickname;

    public Message(int id, int uid, int authorid, String note, int dateline, int type, String nickname) {
        this.id = id;
        this.uid = uid;
        this.authorid = authorid;
        this.note = note;
        this.dateline = dateline;
        this.type = type;
        this.nickname = nickname;
    }
}
