package cn.meowu.client.network.model;

import cn.meowu.client.utils.Tools;

public class ModelBase {
    @Override
    public String toString() {
        String log = "";
        try {
            log = Tools.getClassFieldInfo(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        log += "\n";
        return log;
    }
}
