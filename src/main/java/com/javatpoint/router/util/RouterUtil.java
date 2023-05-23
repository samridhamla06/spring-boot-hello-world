package com.javatpoint.router.util;

public class RouterUtil {
    public static boolean isAMatch(String key, String path){
        key = key.replace("/*", "(.*)");
        return path.matches(key);
    }

    public static void main(String[] args) {
        System.out.println(isAMatch("/boo/boo/foo", "/boo/*/foo"));
    }
}
