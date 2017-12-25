import java.util.Arrays;
import java.util.Scanner;

public class SalesMan {
    static int minimumTime(int[] x) {
        //  Return the minimum time needed to visit all the houses.
    	Arrays.sort(x);
    	int def = 0;
    	for (int i = 1; i < x.length; i++) {
			def+=(x[i] - x[i-1]);
		}
    	
    	return def;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] x = new int[n];
            for(int x_i = 0; x_i < n; x_i++){
                x[x_i] = in.nextInt();
            }
            int result = minimumTime(x);
            System.out.println(result);
        }
        in.close();
    }
}
