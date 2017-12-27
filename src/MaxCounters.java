
public class MaxCounters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[7];
		A[0] = 3;
			    A[1] = 4;
			    A[2] = 4;
			    A[3] = 6;
			    A[4] = 1;
			    A[5] = 4;
			    A[6] = 4;
			    
			    System.out.println(new MaxCounters().solution(5, A));
	}

	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
		int[] b= new int[N];
		int max= 0;
		for (int i=0; i< A.length; i++) {
			if(A[i] >N){
				for (int j = 0; j < b.length; j++) {
					b[j] = max;
				}
			}else{
				b[A[i]-1]+=1;
				if (b[A[i]-1] > max) {
					max = b[A[i]-1];
				}
			}
		}
		return b;
    }
}
