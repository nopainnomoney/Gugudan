import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
    	System.out.println("�����ܿ� �Է��� ����?");
    	Scanner scanner = new Scanner(System.in);
    	int number = scanner.nextInt();
    	System.out.println("number :" + number);
    	
    	if(number > 2 && number < 9) {
    		int i = 1;
        	while (i < 10) {
        		System.out.println(number * i);
        		i += 1;
    	}} else {
    		System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�.");
        
    	}
    	
    	
    	
    	
//    	
//    	for (int i = 1 ; i < 10 ; i++) {
//    		System.out.println(number * i);
//    	}
    	
    	
    	}
        // ������ ����ϴ� ���� ����        
    }

