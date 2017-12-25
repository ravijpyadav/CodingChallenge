import java.util.Scanner;

public class GradingStudent {

	static int[] solve(int[] grades){
		int[] retVal = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] < 38){
				retVal[i]=grades[i];
			}else{
				int def = 5 - grades[i]%5;
				if(def <3){
					retVal[i]=grades[i]+def;
				}else{
					retVal[i]=grades[i];
				}
			}
        }
		
		return retVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }

}
