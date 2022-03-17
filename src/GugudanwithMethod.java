
public class GugudanwithMethod {
	
// 계산 메서드 calculate
	public static int[] calculate(int times){
		//변수생성
		int[] result = new int[9];
		//값 계산
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		//값 반환
		return result;
	}

	
//출력 메서드 print
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	 
	
//메서드 호출

}
