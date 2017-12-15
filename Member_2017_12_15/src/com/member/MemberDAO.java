package com.member;

import java.util.*;
//(�迭)����� ���� Ŭ����
public class MemberDAO {
	
	//(�迭)����� ���� �� ����
	private List<Member> members = new ArrayList<Member>();
	//(�迭)����� �ε��� ���� ����
	//ȸ�� ���� �Է� �޼ҵ�
	public void memberAdd(String name, String phone, String email, String regDate, String deptId) {

		try {
			Member m = new Member(name, phone, email, regDate, deptId);
			this.isExistMeber(m);
			members.add(m);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	public String memberList(String key) {		
		
		Collections.sort(members, new Comparator<Member>() {
			int result = 0;
			@Override
			public int compare(Member o1, Member o2) {
				switch(key) {
				case "�̸�" :
					result = o1.getName().compareTo(o2.getName());
					break;
				case "��ȭ��ȣ":
					result = o1.getPhone().compareTo(o2.getPhone());
					break;
				case "�̸���":
					result = o1.getEmail().compareTo(o2.getEmail());
					break;
				case "�����":
					result = o1.getRegDate().compareTo(o2.getRegDate());
					break;
				case "�μ�":
					result = o1.getDeptId().compareTo(o2.getDeptId());
					break;
				}
				return result;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("�� : %d��%n", this.members.size()));
		sb.append(String.format("-------------------------------------------------%n"));
		for(Member member : this.members) {
			sb.append(String.format("%s%n",member));
		}
		return sb.toString();
	}
		
	
	
	public String memberSearch(String name) {
		int index = 0; //�ε��� ����
		StringBuilder sb = new StringBuilder();
		for(Member member : this.members) {
			if(member.getName().equals(name)) {
				++index; //�ε��� ����
				sb.append(String.format("%s%n",member));//�ش� ����� �� ��������
			}
		}
		sb.insert(0,String.format("�� : %d��%n---------------------------------------------------%n", index));
		if(index==0)//index�� 0�̶��
		sb.append(String.format("%s%n","�˻� ����� �����ϴ�."));
		
		return sb.toString();		
	}
	
	public String memberSearch(String key, String value) {
		//�˻� ��� ����
		//->�Ϻ� ���븸 ��ġ�ص� �˻��ǵ��� ����
		int index = 0; //�ε��� ����
		StringBuilder sb = new StringBuilder();
		for(Member member : this.members) {
				String temp=null;
				switch(key) {
				case "�̸�": temp = member.getName(); break;
				case "��ȭ��ȣ:": temp = member.getPhone(); break;
				case "�̸���": temp = member.getEmail(); break;
				case "�����": temp = member.getRegDate(); break;
				case "�μ�����": temp = member.getDeptId(); break;
				}
				if(!value.equals("�μ�����")&&temp.contains(value)) {
					++index;
					sb.append(String.format("%s%n", member));
				}else if(value.equals("�μ�����")&&temp.equals(value)) {
					++index;
					sb.append(String.format("%s%n", member));
				}
		}
		sb.insert(0,String.format("�� : %d��%n---------------------------------------------------%n", index));
		if(index==0)//index�� 0�̶��
		sb.append(String.format("%s%n","�˻� ����� �����ϴ�."));
		
		return sb.toString();		
	}

	private void isExistMeber(Member m) throws ExistMemberException{
		for(Member member : this.members){
			if(member.equals(m)) {
				 throw new ExistMemberException("ȸ�� ���� ���忡 �����߽��ϴ�. -�ߺ� ����");
			}
		}
	}
	
}
