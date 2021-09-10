

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MeadianOfArrayToK {
	
	public static void main(String[] args) {

		String[] T = { "test1a", "test2", "test1b", "test1c", "test3" };
		String[] R = { "Wrong answer", "OK", "OK", "Time limit exceeded", "OK" };
		int[] A = { 2,1,3};
		System.out.println(new MeadianOfArrayToK().solution(A, 2));
	}

	public int solution(int[] A, int S) {
		int maxValue = 1_000_000_000;
		int count =0;

		for (int i = 1; i <= A.length; i++) {
			for (int j = 0; j < i; j++) {
				int sum = getsum(j, i, A);
				if(sum % (i-j) == 0 && sum /(i-j) == S){
					count++;
				}
			}
		}
		return count > maxValue ? maxValue : count;
	}

	private int getsum(int i, int length, int[] a) {
		int sum = 0;
		for (int j = i; j < length; j++) {
			sum+=a[j];
		}
		return sum;
	}

	// public int solution(String[] T, String[] R) {
	//
	// Map<String, Boolean> testWithResult = new HashMap<>();
	// for (int i=0; i< T.length; i++) {
	// String[] names = T[i].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
	//
	// String group = names[0]+names[1];
	// String result = R[i];
	//
	// boolean pass = "OK".equals(result);
	//
	// if(!testWithResult.containsKey(group)){
	// testWithResult.put(group, pass);
	// }else{
	// if(testWithResult.get(group) && !pass){
	// testWithResult.put(group, false);
	// }
	// }
	// }
	//
	// int passCount =0;
	// for (Entry<String, Boolean> entry : testWithResult.entrySet()) {
	//
	// if(entry.getValue()){
	// passCount++;
	// }
	// }
	//
	//
	// return passCount*100/testWithResult.size();
	// }
}
