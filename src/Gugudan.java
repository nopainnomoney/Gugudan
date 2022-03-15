import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
    	System.out.println("구구단에 입력할 값은?");
    	Scanner scanner = new Scanner(System.in);
    	int number = scanner.nextInt();
    	System.out.println("number :" + number);
    	
    	if(number > 2 && number < 9) {
    		int i = 1;
        	while (i < 10) {
        		System.out.println(number * i);
        		i += 1;
    	}} else {
    		System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        
    	}
    	
    	
    	
    	
//    	
//    	for (int i = 1 ; i < 10 ; i++) {
//    		System.out.println(number * i);
//    	}
    	
    	
    	}
        // 구구단 출력하는 예제 구현        
    }

