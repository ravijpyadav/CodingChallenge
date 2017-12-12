
public class MPowerToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int M =5;
		int N = 8;
		
		System.out.println(new MPowerToN().solution(M, N));

	}
	public int solution(int M, int N) {
        // write your code in Java SE 8
		int result = M;
		while(M < N){
			result = result^(M+1);
			M++;
		}
		
		return result;
    }
}
