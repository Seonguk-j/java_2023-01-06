
public class IfDiceExample {

	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 6) + 1;
		int num2 = (int)(Math.random() * 6) + 1;
		
		System.out.printf("주사위 1번은 %d이 나왔고, 주사위 2번은 %d이 나왔다.\n", num1, num2);
		System.out.printf("두 주사위의 합은 %d이다", num1 + num2);
	}

}
