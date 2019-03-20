package com.rminfo.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: SeaRan
 * Date: 2019/3/6
 * Time: 14:22
 * 项目名：SSpringMvcMSso
 * 描述：token工具类，管理token
 * Description: No Description
 */
public class TokenUtil {
    public static Map<String,String> TOKEN_MAP=new HashMap<String, String>();

    public static void put(String token, String userName) {
        TOKEN_MAP.put(token, userName);

    }

    public static String get(String token) {
        return TOKEN_MAP.get(token);

    }

    public static void remove(String token) {
        TOKEN_MAP.remove(token);

    }
}
