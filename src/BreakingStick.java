import java.util.Scanner;

public class BreakingStick {
	 static long longestSequence(long[] a) {
	        //  Return the length of the longest possible sequence of moves.
		 int sum = 0;
		 for (int i = 0; i < a.length; i++) {
			 long lengthToDevide= a[i];
			if (lengthToDevide == 1){
				sum+=1;
			}else{
				sum+= lengthToDevide;
				for (long j = 2; j <= lengthToDevide; j++) {
					if (lengthToDevide % j == 0) {
						
						sum += (lengthToDevide / j);
						lengthToDevide = lengthToDevide / j;
						if (j == lengthToDevide)
							break;
						j = 1;
					}
				} 
			}
		}
		 
		 return sum;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        long[] a = new long[n];
	        for(int a_i = 0; a_i < n; a_i++){
	            a[a_i] = in.nextLong();
	        }
	        long result = longestSequence(a);
	        System.out.println(result);
	        in.close();
	    }
}
