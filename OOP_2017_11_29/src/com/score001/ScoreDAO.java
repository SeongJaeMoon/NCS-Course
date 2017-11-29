package com.score001;

import java.util.Arrays;

//(�迭)����� ���� Ŭ����
public class ScoreDAO {
	
	//(�迭)����� ���� �� ����
	private Score[]scores = new Score[5];
	//(�迭)����� �ε��� ���� ����
	private int idx;
	//���� ���� �Է� �޼ҵ�
	public void scoreAdd(String sid, String name, int sub1, int sub2, int sub3){
		Score score = new Score(sid, name, sub1, sub2, sub3);
		if(this.scores.length==this.idx) {
			Arrays.copyOf(scores, scores.length+5);
		}
		this.scores[this.idx] = score;
		++this.idx;
	}
	//���� ���� ��� �޼ҵ�
	public String scoreList() {
		StringBuilder sb = new StringBuilder();
		int index = 0;
		  sb.append(String.format("----------------------------------------------%n"));
		  sb.append(String.format("��ȣ  �̸�   ����1 ����2 ����3 ���� ���%n"));
		for(Score score : this.scores) {
			if(score==null)continue;
			sb.append(String.format("%s%n",score.scoreInfo()));
			++index;
		}
		sb.insert(0, String.format("��: %d��%n------------------------%n", index));
		return sb.toString();
	}
}
