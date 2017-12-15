package com.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//부서 정보 관리용 클래스
public class Dept {
	//부서 정보는 개발부(B01), 마케팅부(B02), 총무부(B03)만 존재한다고 가정.
	private static Map<String, String> map = new HashMap<String, String>();
	
	static {
		map.put("B01", "개발부");
		map.put("B02", "마케팅부");
		map.put("B03", "총무부");
	}
	
	public static Map<String, String>getMap(){
		return Dept.map;
	}
	
	public static String getValue(String key) {
		return Dept.map.get(key);
	}
	
	//"(B01-개발부, B02-마케팅부, B03-총무부);
	public static String getList() {
		StringBuilder sb = new StringBuilder();
		Set<String> set = Dept.map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			sb.append(String.format("(%s)-%s ", temp, Dept.map.get(temp)));
		}
		return sb.toString();
	}
}
