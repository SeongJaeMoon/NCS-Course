package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sample_10 {

	public static void main(String[] args) {
		
		//�������� ����
		Integer[]arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		//�������� ���� �׼�
		//����) Integer �ڷ����� �迭�� ��� ����
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}
