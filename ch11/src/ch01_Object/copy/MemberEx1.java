package ch01_Object.copy;

public class MemberEx1 {
	public static void main(String[] args) {
	
	Member member1 = new Member(2001001);
	Member member2 = new Member(2001001);

	System.out.println(member1.equals(member2));
	}
}
