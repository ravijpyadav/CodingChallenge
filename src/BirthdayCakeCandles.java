import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
		Map<Integer, Integer> pair = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if(pair.containsKey(ar[i])){
				pair.put(ar[i], pair.get(ar[i])+1);
			}else{
				pair.put(ar[i], 1);
			}
		}
		
		List<Integer> keys = new ArrayList<Integer>();
		keys.addAll(pair.keySet());
		Collections.sort(keys);
		return pair.get(keys.get(keys.size()-1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        in.close();
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
