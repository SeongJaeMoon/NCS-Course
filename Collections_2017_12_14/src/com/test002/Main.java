
	//ȭ�� ���踦 ���� �м��� ����� �ʵ�� ���� -> getter, setter ����
	/*
	--------------------------------
	ȸ������ v1.0 (�ܼ� ����)
	- ȸ�� ���� �Է�, ȸ�� ���� ��� �׼� ����
	- ȭ�� ���踦 ���� �׸� ����->  �̸�, ��ȭ��ȣ, �̸���, �����(yyyy-MM-dd) ->�ڷ��� Ŭ����
	- ȭ�� ����
	--------------------------------------------
	 */
package com.test002;

import java.util.*;

//���� �޴� �׼� Ŭ����
public class Main {

	public static void main(String[] args) {
		
		Member m1 = new Member("moon", "010-4318-0221");
		Member m2 = new Member("seong", "010-5678-9101");
		Member m3 = new Member("jae", "010-4318-0221");
		Member m4 = new Member("moon", "010-4318-0221");
		
		List<Member>list = new ArrayList<Member>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		Collections.sort(list, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				return m1.getName().compareTo(m2.getName());
			}
		});
		
		System.out.printf("���ο�:%s��%n", list.size());
		System.out.println("----------");
		
		for(Member m : list) {
			//toString() �޼ҵ� ����
			System.out.println(m);
		}
		
		//Ư�� ������ �����ϴ� �ڷḸ ���
		System.out.println("----------");
		int count = 0;
		for(Member m : list) {
			if(m.getName().equals("moon")) {
				System.out.printf("%s%n", m);
				++count;
			}
		}
		System.out.printf("��:%d��%n", count);
		System.out.println("----------");
		
		Member temp = new Member("moon", "010-4318-0221");
		temp.setMid(4);
		list.remove(temp);
		
		for(Member m : list) {
			//toString() �޼ҵ� ����
			System.out.println(m);
		}
		//����) �ߺ��� �̸��� �ִ� ��� ���ϴ� �ڷ� ������ �� �Ǵ� ��찡 �߻��Ѵ�.
		//equals �������̵� �ʿ�!
	}
}
