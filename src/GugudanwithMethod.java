
public class GugudanwithMethod {
	
// ��� �޼��� calculate
	public static int[] calculate(int times){
		//��������
		int[] result = new int[9];
		//�� ���
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		//�� ��ȯ
		return result;
	}

	
//��� �޼��� print
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	 
	
//�޼��� ȣ��

}
