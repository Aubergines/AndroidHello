package com.zsq.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aubergine on 2016/6/12.
 */
public class Marriage{
    private static final List<Marriage> all = new ArrayList<Marriage>();
    private Integer code = null;
    private String name = null;

    private Marriage(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static Marriage get(Integer code) {
        Iterator<Marriage> var1 = all.iterator();
        Marriage ct;
        if (null == code){
            return null;
        }
        do {
            if (!var1.hasNext()) {
                return null;
            }
            ct = (Marriage) var1.next();
        } while (!ct.getCode().equals(code));

        return ct;
    }

    static {
        all.add(new Marriage(1, "已婚"));
        all.add(new Marriage(2, "未婚"));
        all.add(new Marriage(3, "保密"));
    }
}