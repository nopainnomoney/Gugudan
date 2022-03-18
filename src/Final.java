import java.util.Scanner;

public class Final {
	public static void main(String[] args) {
		System.out.println("구구단 입력 할 값은?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
	
		int[] gugudan = new int[9];
		for(int j = 2; j <= number; j++) {
			for(int i = 0; i < gugudan.length; i++) {
				gugudan[i] = j * (i+1);
				System.out.println(gugudan[i]);
			}
	    }
	}	
}
