package com.rminfo.util;

import java.util.HashMap;

import java.util.Map;

public class UrlUtil {

public static Map<String,String> CLIENTURL_MAP=new HashMap<String, String>();
	
	public static void put(String sessionId, String url) {
		CLIENTURL_MAP.put(sessionId, url);

	}

	public static String get(String allSessionId) {
		return CLIENTURL_MAP.get(allSessionId);

	}

	public static void remove(String sessionId) {
		CLIENTURL_MAP.remove(sessionId);

	}
	

}
