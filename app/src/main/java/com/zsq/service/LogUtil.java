package com.zsq.service;

import android.util.Log;

/**
 * 日志统一管理
 *
 * @author ZhangChangAn
 */
public class LogUtil {

    private static int LENGTH = 3000;
    public static void e(String tag, String msg) {
            printMsg(tag, msg);
    }

    public static void printMsg(String tag, String msg){
        int length = msg.length();
        if (length <= LENGTH){
            Log.e(tag, msg);
        }else {
            String substring = msg.substring(0, LENGTH);
            Log.e(tag, substring);
            msg = msg.substring(LENGTH);
            printMsg(tag,msg);
        }
    }


    public static void i(String tag, Object msg) {
            printMsg(tag, String.valueOf(msg));
    }
}
