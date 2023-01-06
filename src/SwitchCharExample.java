
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade){
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
			break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님입니다.");
		}
		
//		아래 자바 12이후 사용법 Expressions(표현식)
//		switch(grade) {
//			case 'A', 'a' -> System.out.println("우수회원입니다.");
//			case 'B', 'b' -> System.out.println("일반회원입니다.");
//			default -> System.out.println("손님입니다.");
//		}
	}

}
