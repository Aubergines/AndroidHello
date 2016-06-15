package com.zsq.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aubergine on 2016/6/12.
 */
public class Sex{
    private static final List<Sex> all = new ArrayList<Sex>();
    private Integer code = null;
    private String name = null;

    private Sex(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static Sex get(Integer code) {
        Iterator<Sex> var1 = all.iterator();
        Sex ct;
        if (null == code){
            return null;
        }
        do {
            if (!var1.hasNext()) {
                return null;
            }
            ct = (Sex) var1.next();
        } while (!ct.getCode().equals(code));
        return ct;
    }

    static {
        all.add(new Sex(1, "男"));
        all.add(new Sex(2, "女"));
        all.add(new Sex(3, "保密"));
    }
}
