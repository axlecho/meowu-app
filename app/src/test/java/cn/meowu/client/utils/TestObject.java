package cn.meowu.client.utils;

public class TestObject {
    public static final String TAG = TestObject.class.getSimpleName();
    public int a = 0;
    protected int b = 1;
    private int c = 2;
    public final int d = 3;

    class E {
        public int f = 4;
        public int g = 5;

        public void action1() {
            MeowuLog.d(TAG, this.toString());
        }

        public void action2() throws IllegalAccessException {
            MeowuLog.d(TAG, Tools.getClassFieldInfo(this));
        }

        public String toString() {
            return "f:" + f + " g" + g;
        }
    }

    public void action() throws IllegalAccessException {
        E e = new E();
        e.action1();
        e.action2();

        TestObject a = this;
        if (this instanceof TestObjectEx) {
            TestObjectEx b = (TestObjectEx) this;
        }
    }
}
