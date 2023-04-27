package com.zhang.designpatterns.designpatterns.proxy.dbroute;

/**
 * @Description
 * @Author 往事随风
 * @Data 2023/4/27 21:45
 */

public class DynamicDataSourceUtil {

    public final static String DEFAULT_SOURCE = null;
    private static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceUtil(){}

    public static String get(){
        return local.get();
    }
    //重试
    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }

    //DB_2022
    //DB_2023
    public static void set(String source){
        local.set(source);
    }
    public static void set(int year){
        local.set("DB_"+year);
    }
}
