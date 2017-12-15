package com.schedule;

import java.util.ArrayList;
import java.util.List;

//�÷��� ����� ���� Ŭ����
public class ScheduleDAO {
	
	//(�÷���)����� �غ�
	private List<Schedule> list = new ArrayList<Schedule>();
	
	//������ �ڷ� ���
	public void scheduleAdd(String date, String content) {
		this.list.add(new Schedule(date ,content));
		
	}
	
	//������ ����Ʈ ��ü ���
	public String scheduleList() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("-------------%n"));
		sb.append(String.format("��ȣ ��¥ ����%n"));
		
		for(Schedule s : this.list) {
			sb.append(String.format("%s%n", s));
		}
		sb.append(String.format("%s���� ������ �ֽ��ϴ�.%n", this.list.size()));
		sb.append(String.format("--------------%n"));
		
		return sb.toString();
	}
	
	public String scheduleSearch(String key, String value) {

		StringBuilder sb = new StringBuilder();

		//��ȣ �˻��� ��ġ�ϴ� ��츦 ã�´� -> == ������ ���
		//��¥, ���� �˻��� �κ� ��ġ�ϴ��� ã�´�. -> contains() �޼ҵ� ���

		sb.append(String.format("-------------%n"));
		sb.append(String.format("��ȣ ��¥ ����%n"));
		
		int a = 0;
		
		for (Schedule s : this.list) {
			if(key.equals("��ȣ") && s.getSid() == Integer.parseInt(value)) {
				sb.append(String.format("%s%n", s));
				++a;
			}else if(key.equals("��¥") && s.getDate().contains(value)) {
				sb.append(String.format("%s%n", s));
				++a;
			}else if(key.equals("����") && s.getContent().contains(value)) {
				sb.append(String.format("%s%n", s));
				++a;
			}
		}
		if(a > 0) {
			sb.append(String.format("%s���� ������ �ֽ��ϴ�.%n", a));
		}else {
			sb.append(String.format("�˻� ����� �����ϴ�.%n"));
		}
		sb.append(String.format("--------------%n"));
		return sb.toString();
	}
}
