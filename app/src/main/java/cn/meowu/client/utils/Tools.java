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
//        MeowuLog.d(TAG, c.getSimpleName());
        String info = "";
        Field[] fields = c.getFields();
        for (Field field : fields) {
            String key = field.getName();
            Object value = field.get(o);

            if (value.getClass().isArray()) {
                Object[] arr = (Object[]) value;
                for (Object a : arr) {
                    info += getClassFieldInfo(a);
                    info += " ";
                }
            } else {
                info += key + ":" + value + " ";
            }
        }

        return info;
    }
}
