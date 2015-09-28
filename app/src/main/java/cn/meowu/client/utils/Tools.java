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
     * @return the class info
     */
    public static String getClassFieldInfo(Object o) throws IllegalAccessException {
        Class c = o.getClass();
        MeowuLog.d(TAG, c.getSimpleName());
        String info = "";
        Field[] fields = c.getFields();
        for (Field field : fields) {
            info += field.getName() + ":" + field.get(o) + " ";
        }
        return info;
    }
}
