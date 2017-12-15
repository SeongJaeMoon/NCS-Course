package com.member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

//(�ܼ�)���� ���� Ŭ����
public class MemberService {
	
	//(�迭)����� ��ü
	private MemberDAO dao = new MemberDAO();
	
	public void memberAdd(Scanner sc) {
		
		System.out.println("------------");
		System.out.println("ȸ������ �Է�.");
		System.out.println("------------");
		System.out.print("�̸�:");
		String name = sc.next();
		System.out.print("��ȭ��ȣ:");
		String phone = sc.next();
		while(true) {
			try {
				this.phonepatternCheck(phone);
				break;
			}catch(Exception e) {		
				System.out.println(e.getMessage());
				System.out.print("��ȭ��ȣ:");
				phone = sc.next();
			}
		}
		System.out.print("�̸���:");
		String email = sc.next();
		while(true) {
			try {
				this.emailpatternCheck(email);
				break;
			}catch(Exception e) {	
				System.out.println(e.getMessage());
				System.out.print("�̸���:");
				email = sc.next();
			}
		}
		System.out.print("�����:(yyyy-MM-dd)");
		String regDate = sc.next();
		while(true) {
			try {
				this.isRegDate(regDate);
				break;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.print("�����:(yyyy-MM-dd)");
				regDate = sc.next();
			}
		}
		System.out.println(Dept.getList());
		System.out.print("�μ�����:");
		String deptId = sc.next();
		this.dao.memberAdd(name, phone, email, regDate, deptId);
		System.out.println("ȸ������ ����� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void memberList(Scanner sc){
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("ȸ������ ���� ���");
			System.out.println("1. �̸�  2. ��ȭ��ȣ 3. �̸���  4. ����� 5. �μ�");
			System.out.println("--------------------------------------------------");
			System.out.println("����(1~5, 0 quit?)");
			int selectNo = sc.nextInt();
			if(selectNo==0)break;
			switch (selectNo) {
			case 1:System.out.println(this.dao.memberList("�̸�"));break;
			case 2:System.out.println(this.dao.memberList("��ȭ��ȣ"));break;
			case 3:System.out.println(this.dao.memberList("�̸���"));break;
			case 4:System.out.println(this.dao.memberList("�����"));break;
			case 5:System.out.println(this.dao.memberList("�μ�"));break;
			}
		}
	}
	public void memberSearch(Scanner sc){
		
		while(true) {
		System.out.println("--------------------------------------------------");
		System.out.println("ȸ�� ���� �˻�>");
		System.out.println("1. �̸� ���� 2. ��ȭ��ȣ ���� 3. �̸��� ���� 4. ����� ���� 5.�μ� ����");
		System.out.println("--------------------------------------------------");
		System.out.println("����(1~5, 0 quit?)");
		int selectNo = sc.nextInt();
		if(selectNo==0)break;
		switch(selectNo) {
			case 1: this.memberSearch(sc, "�̸�"); break;
			case 2: this.memberSearch(sc, "��ȭ��ȣ"); break;
			case 3: this.memberSearch(sc, "�̸���"); break;
			case 4: this.memberSearch(sc, "�����"); break;
			case 5: this.memberSearch(sc, "�μ�����"); break;
			}
		}
		//System.out.print(this.dao.memberSearch(name));
	}
	//ȸ�� ���� �˻� ����޴� �޼ҵ�
	//key : �˻� ����
	//value : �˻� ���
	public void memberSearch(Scanner sc, String key) {
		System.out.println("-------------------");
		System.out.printf("ȸ�� ���� �˻�(%s����)%n", key);
		System.out.println("-------------------");
		String value = sc.next();
		System.out.printf("%s%n", value);
		System.out.println(this.dao.memberSearch(key, value));
	}
	
	private void isRegDate(String regDate) throws ParseException, DateFormatException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(regDate);
		String pattern = sdf.format(date);
		if(!regDate.equals(pattern)) {
			throw new DateFormatException("�߸��� ��¥ ���� �Է��Դϴ�.");
		}
	}
	
	 //���Խ� ����
    private void phonepatternCheck(String phone) throws PatternFormatException{
        String regExp = "010-\\d{4}-\\d{4}";
        boolean result = Pattern.matches(regExp, phone);
        if(!result) {
            throw new  PatternFormatException("��ȭ��ȣ ������ Ʋ�Ƚ��ϴ�.");
        }
    }
    private void emailpatternCheck(String email) throws PatternFormatException{
        String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        boolean result = Pattern.matches(regExp, email);
        if(!result) {
            throw new PatternFormatException("�̸��� ������ Ʋ�Ƚ��ϴ�.");
        }
    }
	
}
