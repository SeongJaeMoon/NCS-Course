package com.score002;

import java.util.Arrays;

//(�迭)����� ���� Ŭ����
public class ScoreDAO {
	
	//(�迭)����� ���� �� ����
	private Score[]scores = new Score[5];
	
	//(�迭)����� �ε��� ���� ����
	private int idx;
	
	//���� ���� �Է� �޼ҵ�
	//�ߺ��� ��ȣ ���� �Է� ������ �� �ִ�.
	public int scoreAdd(String sid, String name, int sub1, int sub2, int sub3){
		int result = 0;
		
		// �ߺ��� ��ȣ �˻� ���� �߰�->private �޼ҵ�� ����
		if (this.isCheckId(sid)) {
			Score score = new Score(sid, name, sub1, sub2, sub3);
			this.scores[this.idx] = score;
			++this.idx;
			// ����� �ڵ� ����
			if (this.scores.length % 5 == 0) {
				this.scores = Arrays.copyOf(this.scores, this.scores.length + 5);
			}
			result = 1;//�Է� ������ ���
		}
		return result;
	}
	//���� ���� ��� �޼ҵ�
	public String scoreList() {
		StringBuilder sb = new StringBuilder();
		int index = 0;
		//���� ��� �޼ҵ�
		this.rank();
		  sb.append(String.format("��ȣ �̸�����1 ����2 ����3 ���� ��� ����%n"));
		for(Score score : this.scores) {
			if(score==null)continue;
			sb.append(String.format("%s%n",score.scoreInfo()));
			++index;
		}
		sb.insert(0, String.format("��: %d��%n------------------------%n", index));
		return sb.toString();
	}
	//���� ���� �޼ҵ� -> setter �޼ҵ�
	private void rank() {
		//���� �˰���
		//1. �迭�� ���� ������ ������ ����
		//2. ��� ���� ������ �ʱⰪ 1�� ����
		//3. ���� ������ ������ �������� ���ؼ� ���� �������� 
		//	 ������ ������ ū ��찡 �ִٸ� ���� ������ ���� ���� +1����
		for(int i = 0; i < this.scores.length; ++i) {
			if(this.scores[i]==null)continue;
			for(int j = 0; j <this.scores.length; ++j) {
				if(this.scores[j]==null)continue;
				if(this.scores[i].getTotal()<this.scores[j].getTotal()) {
					//���� ���� +1 �׼�
					this.scores[i].setRank(this.scores[i].getRank()+1);
				}
			}
		}
	}
	
	private boolean isCheckId(String sid){
		boolean result = true;
		for(Score s : this.scores) {
			if(s==null)continue;
			if(s.getSid().equals(sid)) {
				result = false;
			}
		}
		return result;
	}
}
