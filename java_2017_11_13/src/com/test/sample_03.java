package com.test;

import java.util.Arrays;


public class sample_03 {

	public static void main(String[] args) {
		
		//Arrays class
		//java.util.Arrays Ŭ������ sort() �޼ҵ带 ���
		//->java.util ��Ű�� ��� �ʿ�
		//��ü ������ �Ұ���!
		
		int [] a = {1,3,5,4,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		String [] str = {"json", "xml", "nodejs", "angularjs", "rubyonrails"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
	}
}
