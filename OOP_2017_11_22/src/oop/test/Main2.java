package oop.test;



public class Main2 {

	public static void main(String[] args) {
			Member[]m = new Member[2];
			
			Member member = new Member();
			member.setName("Seongjae Moon");
			member.setId("seongjae.m@gamil.com");
			member.setPassword("seongjaem");
			member.setAge(10);
			
			Member member1 = new Member();
			member1.setName("Momo");
			member1.setId("momo@gmail.com");
			member1.setPassword("momo");
			member1.setAge(10);
			
			//Member ��ü���� �迭�� ����
			m[0] = member;
			m[1] = member1;
			
			for(Member a : m) {
				//a ������ null�� ����� ���¿��� ���(�޼ҵ�) ���ٽ� ���� �߻�
				if(a==null)continue;
				System.out.println(a.memberInfo());
			}
			
			/*System.out.println(member);
			System.out.println(member1);
			System.out.println(member.toString());
			System.out.println(member1.toString());
			
			System.out.println(member.memberInfo());
			System.out.println(member1.memberInfo());
			
			//�ڱ浿�� �������� �׸� ��� -> getter �޼ҵ� ȣ��
			System.out.println(member.getName());
			System.out.println(member.getId());
			System.out.println(member.getPassword());
			System.out.println(member.getAge());*/
	}
}
