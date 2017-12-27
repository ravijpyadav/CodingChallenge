import java.util.Arrays;

public class FindMissingNumber {
public static void main(String[] args) {
	
}

public int solution(int[] A) {
    // write your code in Java SE 8
	
	
	Arrays.sort(A);
	for (int i = 0; i < A.length; i++) {
		if(i==0 && A[i]!= 1)
			return 1;
		if(i== (A.length -1)){
			return A[i]+1;
		}
		if((A[i]+1) != A[i+1]){
			return A[i]+1;
		}
	}
	return 1;
}


}
