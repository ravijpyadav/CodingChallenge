package codility;

import java.util.HashMap;
import java.util.Map;

public class ToptalCodingTest {
	public static void main(String[] args) {
		int[] A = { 1, 2 };
		int[] B = { 2, 1 };
		System.out.println(new ToptalCodingTest().decode("MDCLXVI"));
	}
	
	public static Integer decode( String roman ) {
		Map<String, Integer> romanInt = new HashMap<String, Integer>();
		
		String[] litrals = {"I","V","X","L","C","D","M"};
		int[] values = {1,5,10,50,100,500,1000};
		for (int i = 0; i < values.length; i++) {
			romanInt.put(litrals[i], values[i]);
		}
		int num = 0;
		String previousChar = "";
		for (char i : roman.toCharArray()) {
			if(previousChar.equals("")){
				num+=romanInt.get(i+"");
			}else if(romanInt.get(previousChar) < romanInt.get(i+"")){
				num-=romanInt.get(previousChar);
				num+= (romanInt.get(i+"") - romanInt.get(previousChar));
			}else{
				num+=romanInt.get(i+"");
			}
			previousChar = i+"";
		}
		
		return num;
	  }
	
//	public static String firstNonRepeatingLetter( String str ) {
//		
//		String lowerCAse = str.toLowerCase();
//		for (int i = 0; i < str.length(); i++) {
//			char charAt = lowerCAse.charAt(i);
//			int firstIndex = lowerCAse.indexOf(charAt);
//			int lastIndex = lowerCAse.lastIndexOf(charAt);
//			if(firstIndex == lastIndex){
//				return str.charAt(i)+"";
//			}
//		}
//		
//		return  "";
//	  }

//	public int solution(int number) {
//		Set<Integer> nums = new HashSet<>();
//		int num = 0;
//		int counter = 1;
//		while (num < number) {
//			num = 3 * counter;
//			if (num < number) {
//				nums.add(num);
//			}
//			counter++;
//		}
//
//		counter = 1;
//		num = 0;
//		while (num < number) {
//			num = 5 * counter;
//			if (num < number) {
//				nums.add(num);
//			}
//			counter++;
//		}
//		int sum=0;
//		for (Integer integer : nums) {
//			sum +=integer;
//		}
//		
//		return sum;
//	}

	// public boolean solution(int N, int[] A, int[] B) {
	//
	// Map<Integer, Set<Integer>> sets = new HashMap<>();
	// if(A.length == 0 || B.length == 0){
	// return false;
	// }
	//
	// for (int i = 0; i < B.length; i++) {
	// Set<Integer> set = sets.get(A[i]);
	// if(set == null){
	// set = new HashSet<>();
	// sets.put(A[i], set);
	// }
	// set.add(B[i]);
	// while (true) {
	// int num = A[B[i]];
	// if(num>= A.length){
	// break;
	// }
	// }
	// }
	//
	// return false;
	// }

//	public int solution(int Y, String A, String B, String W) {
//
//		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
//				"October", "Novenmber", "December" };
//		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//
//		int totalDays = 0;
//		int startDay = 0;
//		int endDay = 0;
//		for (int i = 0; i < months.length; i++) {
//			if (months[i].equalsIgnoreCase(A)) {
//				startDay = totalDays + 1;
//			}
//			totalDays += days[i];
//			if (months[i].equalsIgnoreCase(B)) {
//				endDay = totalDays;
//				break;
//			}
//
//		}
//		int vacationDays = endDay - startDay;
//
//		if ("Tuesday".equalsIgnoreCase(W)) {
//			vacationDays -= 6;
//		}
//		if ("Wednusday".equalsIgnoreCase(W)) {
//			vacationDays -= 5;
//		}
//		if ("Thursday".equalsIgnoreCase(W)) {
//			vacationDays -= 4;
//		}
//		if ("Friday".equalsIgnoreCase(W)) {
//			vacationDays -= 3;
//		}
//		if ("Saturday".equalsIgnoreCase(W)) {
//			vacationDays -= 2;
//		}
//		if ("Sunday".equalsIgnoreCase(W)) {
//			vacationDays -= 1;
//		}
//
//		return vacationDays / 7;
//	}

	// public String solution(String S) {
	// if( S == null || S.trim().isEmpty() || S.length() <= 3){
	// return S;
	// }
	//
	// S = S.replaceAll(" ", "");
	// S = S.replaceAll("-", "");
	//
	// StringBuilder SS = new StringBuilder();
	//
	// for (int i = 0; i < S.length(); ) {
	// int lengthOfSubString = (S.length() -i) >=6 ? 3: ((S.length() -i) == 5 ?
	// 3 : (S.length() -i) == 4?2: (S.length() -i));
	// SS.append(S.substring(i, i+lengthOfSubString));
	// i+=lengthOfSubString;
	// if(i<S.length()){
	// SS.append("-");
	// }
	// }
	// return SS.toString();
	// }

	// public String solution(String[] A, String[] B, String P) {
	// String returnName = "NO CONTACT";
	//
	// if(A.length == 0 || B.length == 0 || A.length !=B.length || P == null ||
	// P.trim().isEmpty()){
	// return returnName;
	// }
	//
	// for (int i =0 ; i < A.length ; i++) {
	// String number = B[i];
	//
	// if(A[i] == null || A[i].isEmpty()){
	// continue;
	// }
	// if(number.contains(P) && (returnName.equals("NO CONTACT") ||
	// A[i].length() < returnName.length())){
	// returnName = A[i];
	// }
	// }
	//
	// return returnName;
	// }
}
