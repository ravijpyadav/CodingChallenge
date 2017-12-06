import java.util.HashSet;
import java.util.Set;


public class LiftTrip {
public static void main(String[] args) {
	int[] A =  {40, 40,100, 80,20};
	
	int[] B = {3, 3,2,2,3};
	int M = 3;
	int X = 5;
	int Y = 200;
	
	

	System.out.println(new LiftTrip().solution(A, B, M, X, Y));
	
int[] A1 =  {60, 80, 40};
	
	int[] B1 = {60, 80, 40};
	int M1 = 5;
	int X1 = 2;
	int Y1 = 200;
	
	//System.out.println(new Solution5().solution(A1, B1, M1, X1, Y1));
}

public int solution(int[] A, int[] B, int M, int X, int Y){
	
	int stops = 0;
	
	Set<Integer> stopsInOneGo = new HashSet<Integer>();
	
	int currentWeight = 0;
	int CurrentPeople = 0;
	
	
	for(int i=0; i< A.length; i++){
		
		if((currentWeight+ A[i]) > Y || (CurrentPeople+1) > X){
			stops = stops+stopsInOneGo.size() +1;
			currentWeight = A[i];
			CurrentPeople = 1;
			stopsInOneGo.clear();
			stopsInOneGo.add(B[i]);
		}else{
			currentWeight = currentWeight +A[i];
			CurrentPeople++;
			stopsInOneGo.add(B[i]);
			
		}
		
	}
	
	stops = stops+stopsInOneGo.size() +1;
	
	return stops;
}
}
