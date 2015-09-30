package cn.meowu.client.network.model;

public class TeamInfo extends BaseModel {
    public final int id;
    public final int uid;
    public final int num;
    public final String teamname;
    public final String plandate;
    public final int days;
    public final String despt;
    public final int replys;
    public final int dateline;
    public final String tags;

    //    public SizeInfoShort for[];
    public final SizeInfoShort[] go;

    public TeamInfo(int id, int uid, int num, String teamname, String plandate, int days, String despt, int replys, int dateline, String tags, SizeInfoShort[] go) {
        this.id = id;
        this.uid = uid;
        this.num = num;
        this.teamname = teamname;
        this.plandate = plandate;
        this.days = days;
        this.despt = despt;
        this.replys = replys;
        this.dateline = dateline;
        this.tags = tags;
        this.go = go;
    }
}
