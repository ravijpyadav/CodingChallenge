
public class MPowerToN {

	public static void main(String[] args) {
		
		int M =2;
		int N = 3;
		
		System.out.println(new MPowerToN().solution(M, N));

	}
	public int solution(int M, int N) {
        // write your code in Java SE 8
		int result = (int) Math.pow(M, N);
		
		return result;
    }
}
