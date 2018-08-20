package first;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
			int k = divide(i, j);
			System.out.println(k);
		
		}
		
		
	

	public static int divide(int i, int j){
		if(j==0){
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		}
		int k = i/j;
		return k;
	}
}
