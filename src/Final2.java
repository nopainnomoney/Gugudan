import java.util.Scanner;

public class Final2 {
	public static void main(String[] args) {
		System.out.println("2개의 값을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int[] gugudan = new int[second];
		for(int j = 2; j <= first; j++) {
			for(int i = 0; i < gugudan.length; i++) {
				gugudan[i] = j * (i+1);
				System.out.println(gugudan[i]);
			}
			
		}
		
		
	}
}
