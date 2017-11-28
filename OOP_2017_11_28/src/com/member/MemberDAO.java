package com.member;

import java.util.Scanner;

//(�迭)����� ���� Ŭ����
public class MemberDAO {
	
	//(�迭)����� ���� �� ����
	private Member[] members = new Member[5];
	//(�迭)����� �ε��� ���� ����
	private int idx;
	
	//ȸ�� ���� �Է� �޼ҵ�
	
	public void memberAdd(String name, String phone, String email, String regDate) {
		
		//Member ��ü ���� �� (�迭)����ҿ� ����
		Member m = new Member(name, phone, email, regDate);
		this.members[this.idx] = m;
		//�ε��� ����
		++this.idx;
	}
	
	public String memberList() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("�� : %d��%n", this.idx));
		sb.append(String.format("-------------------------------------------------%n"));
		for(Member member : this.members) {
			if(member == null)continue;
			sb.append(String.format("%s%n",member.getMemberInfo()));
		}
		return sb.toString();
	}
	public String memberSearch(String name) {
		Member m = null; //���Ÿ���� ���� ����
		int index = 0; //�ε��� ����
		StringBuilder sb = new StringBuilder();
		for(Member member : this.members) {
			if(member == null)continue;
			if(member.getName().equals(name)) {
				m=member;//ã�� ����� �ִٸ� �� �Ҵ�
				++index; //�ε��� ����
				sb.append(String.format("%s%n",m.getMemberInfo()));//�ش� ����� �� ��������
			}
		}
		sb.insert(0,String.format("�� : %d��%n---------------------------------------------------%n", index));
		if(m==null)//ã�� ����� null�̶��
		sb.append(String.format("%s%n","�˻� ����� �����ϴ�."));
		
		return sb.toString();		
	}
}
