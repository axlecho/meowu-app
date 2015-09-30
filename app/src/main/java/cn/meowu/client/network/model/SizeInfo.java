package cn.meowu.client.network.model;

public class SizeInfo extends ModelBase {
    public final int id;
    public final String name;
    public final String reid;
    public final String loved;
    public final String visited;
    public final String teams;
    public final String loc;
    public final String intro;

    public SizeInfo(int id, String name, String reid, String loved, String visited, String teams, String loc, String intro) {
        this.id = id;
        this.name = name;
        this.reid = reid;
        this.loved = loved;
        this.visited = visited;
        this.teams = teams;
        this.loc = loc;
        this.intro = intro;
    }


}
