package com.schedule;

public class Schedule {
	
	//ȭ�� ���踦 ���� �׸� �м� �� �ʵ�, ������, getter, setter, �޼ҵ� ����
	//(����)��ȣ, ��¥, ���� �׸�
	//����) ��ȣ�� �ڵ� �����ǵ��� �Ѵ�.
	
	private static int count;
	private int sid;
	private String date;
	private String content;
	
	public Schedule() {
		
	}
	
	public Schedule(String date, String content) {
		this.sid = ++count;
		this.date = date;
		this.content = content;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getDate() {
		return date;
	}

	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s",this.sid, this.date, this.content);
	}
}
