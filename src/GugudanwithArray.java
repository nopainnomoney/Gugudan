
public class GugudanwithArray {

	public static void main(String[] args) {
		int[] gugudan = new int[9];
		for(int j = 2; j < 10; j++) {
			for(int i = 0; i < gugudan.length; i++) {
				gugudan[i] = j * (i+1);
				System.out.println(gugudan[i]);
			}
	    }
	}
}


