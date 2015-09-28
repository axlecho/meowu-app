package cn.meowu.client.utils;

public class TestObjectEx extends TestObject {
    public int e = 4;
    protected int f = 5;
    private int g = 6;
    public final int h = 7;

    public int a = 8;
    protected int b = 9;
    private int c = 10;

    public void action() throws IllegalAccessException {
        super.action();
        TestObjectEx a = this;
        TestObject b = this;
    }


}
