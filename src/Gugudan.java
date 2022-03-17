import java.util.Scanner;

public class Gugudan {
		public static void main(String[] args) {
			System.out.println("구구단 넣을 수:");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println(number + "단");
    	       
			if(number > 1 && number < 10) {
				for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}} else {
				System.out.println("2이상 9이하 값만 입력가능");
			}
			
				
}}

