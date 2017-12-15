package com.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//�μ� ���� ������ Ŭ����
public class Dept {
	//�μ� ������ ���ߺ�(B01), �����ú�(B02), �ѹ���(B03)�� �����Ѵٰ� ����.
	private static Map<String, String> map = new HashMap<String, String>();
	
	static {
		map.put("B01", "���ߺ�");
		map.put("B02", "�����ú�");
		map.put("B03", "�ѹ���");
	}
	
	public static Map<String, String>getMap(){
		return Dept.map;
	}
	
	public static String getValue(String key) {
		return Dept.map.get(key);
	}
	
	//"(B01-���ߺ�, B02-�����ú�, B03-�ѹ���);
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
