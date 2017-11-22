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
			
			//Member 객체들을 배열에 저장
			m[0] = member;
			m[1] = member1;
			
			for(Member a : m) {
				//a 변수에 null이 저장된 상태에서 멤버(메소드) 접근시 오류 발생
				if(a==null)continue;
				System.out.println(a.memberInfo());
			}
			
			/*System.out.println(member);
			System.out.println(member1);
			System.out.println(member.toString());
			System.out.println(member1.toString());
			
			System.out.println(member.memberInfo());
			System.out.println(member1.memberInfo());
			
			//박길동의 개인정보 항목별 출력 -> getter 메소드 호출
			System.out.println(member.getName());
			System.out.println(member.getId());
			System.out.println(member.getPassword());
			System.out.println(member.getAge());*/
	}
}
