package com.test005;

//���ѵ� Ÿ�� �Ķ���� <T extends �ֻ���Ÿ��>
//-Ÿ�� �Ķ���� ������ ���� ���� ����. ��, ������ IS-A ������ ��츸 ����.
//-<T extends �ֻ���Ÿ��> ǥ���� �ֻ���Ÿ�� ���� �ڷ����� �����ϴٴ� �ǹ̰� �ȴ�. ���� ���, <T extends Number>�� ��� Number �ڷ����� ���� �ڷ����� �����ϴٴ� �ǹ��̴�.
public class Box<T extends Number> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
