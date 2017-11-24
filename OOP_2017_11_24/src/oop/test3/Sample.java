package oop.test3;

public class Sample {
	//final �ʵ� �ʱ�ȭ
			/*
			-final �ʵ�� final Ű���尡 ���� �ʵ�. ���(�ʵ�, �޼ҵ�)�� ���¸� ���� �Ұ� ���·� �����.
			-�ʱ�ȭ ���� ���� �Ұ����� �ʵ尡 �ȴ�. �Ϲ� �ʵ�� �ʱ�ȭ ���Ŀ��� setter�� �̿��ؼ� ���� ����.
			-�ܺο��� �ʵ� ���ٽ� read-only �����̹Ƿ� getter�� �ʿ�
			-�ʱ�ȭ�� ����� �ʱ�ȭ, �����ڿ� ���� �ʱ�ȭ ����.
			-����

			private final �ڷ��� ������;
			private final �ڷ��� ������ = ��;
			*/
			//�Ϲ� �ʵ�
			//->�ڵ� �ʱ�ȭ ���� ����
			private int a;
			//final �ʵ�
			//->�ڵ� �ʱ�ȭ ���� �Ұ�
			private final int b = 10;
			private final int c;
			public Sample() {
				this(10);
			}
			public Sample(int c) {
				this.c = c;
			}
			
			//�Ϲ� �ʵ� -> getter(O), setter(O)
			//final �ʵ� -> getter(O), setter(X)
			public int getA() {
				return this.a;
			}
			public void setA(int a) {
				this.a = a;
			}
			//final �ʵ� - > setter(X), getter(O) -> read-only
			public int getB() {
				return this.b;
			}
			public int getC() {
				return this.c;
			}
			/*
			 public void setB(int b){
			 	this.b = b; //��������!
			 }
			 */
			
}
