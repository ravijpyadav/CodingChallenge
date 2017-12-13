import java.util.Arrays;
import java.util.Scanner;

public class MiniMax {

	public static void main(String[] args) {
		long[] result = new long[5];
		try {
			Scanner in = new Scanner(System.in);
			int[] arr = new int[5];
			for(int arr_i=0; arr_i < 5; arr_i++){
			    arr[arr_i] = in.nextInt();
			}
			in.close();
			
			for (int i = 0; i < 5; i++) {
				long sum =0;
				for (int j = 0; j < 5; j++) {
					if(i!=j){
						sum+=arr[j];
					}
				}
				result[i]=sum;
			}
			Arrays.sort(result);
		} catch (Exception e) {
			
		}
        System.out.println(result[0]+" "+ result[4]);
	}

}
