package cn.meowu.client.utils;

import java.lang.reflect.Field;

/**
 * Created by axlecho on 2015/9/26.
 */
public class Tools {

    public static String TAG = Tools.class.getSimpleName();

    /**
     * get class field info by reflect
     *
     * @param o
     * @return the class info
     */
    public static String getClassFieldInfo(Class c, Object o) throws IllegalAccessException {
        MeowuLog.d(TAG, c.getSimpleName() + "\n" + o.getClass().getSimpleName());
        String info = "";
        Field[] fields = c.getFields();
        for (Field field : fields) {
            info += field.getName() + ":" + field.get(o) + " ";
        }
        return info;
    }
}
