import java.util.Scanner;

public class Gugudan {
		public static void main(String[] args) {
			System.out.println("������ ���� ��:");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println(number + "��");
    	       
			if(number > 1 && number < 10) {
				for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}} else {
				System.out.println("2�̻� 9���� ���� �Է°���");
			}
			
				
}}

