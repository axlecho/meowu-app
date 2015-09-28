package cn.meowu.client.utils;

import cn.meowu.client.BuildConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

/**
 * Created by axlecho on 2015/9/26.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ToolsTest {
    public final static String TAG = ToolsTest.class.getSimpleName();
    public int a = 0;
    protected int b = 1;
    private int c = 2;
    int d = 3;

    class E {
        public int f = 4;
        protected int g = 5;
        private int h = 6;
        public final int j = 7;
    }

    @Before
    public void init() {
        ShadowLog.stream = System.out;  // 日志输出
    }

    @Test
    public void testGetClassFieldInfo() throws IllegalAccessException {
        MeowuLog.d(TAG, Tools.getClassFieldInfo(this));
    }

    @Test
    public void testGetClassFieldInfo2() throws IllegalAccessException {
        E e = new E();
        MeowuLog.d(TAG, Tools.getClassFieldInfo(e));
    }

    @Test
    public void testGetClassFieldInfo3() throws IllegalAccessException {
        TestObject o = new TestObject();
        MeowuLog.d(TAG, Tools.getClassFieldInfo(o));
    }

    @Test
    public void testGetClassFieldInfo4() throws IllegalAccessException {
        TestObjectEx ox = new TestObjectEx();
        MeowuLog.d(TAG, Tools.getClassFieldInfo(ox));
    }

    @Test
    public void testReflectAccess() throws IllegalAccessException {
        TestObject o = new TestObject();
        o.action();

        TestObjectEx ox = new TestObjectEx();
        ox.action();

        TestObject oxx = new TestObjectEx();
        oxx.action();
    }
}
