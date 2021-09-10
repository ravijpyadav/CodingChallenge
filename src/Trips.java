import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Trips {
public static void main(String[] args) {
	int[] A = {7, 3, 7, 3, 1, 3, 4, 1};
	
	int len= solution(A);
	System.out.println(len);
}

private static int solution(int[] A) {

	Set<Integer> destList = new HashSet<Integer>();
	
	for(int i = 0 ; i< A.length; i++){
		destList.add(A[i]);
	}
	
	int tripId=1;
	
	Map<Integer, List<Integer>> trips = new HashMap<Integer, List<Integer>>();
	
	
	
	for (int i=0 ; i < A.length ; i++) {
		List<Integer> trip = new ArrayList<Integer>();
		for( int j= i ; j < A.length ; j++){
			trip.add(A[j]);
			if(containsAll(trip, destList)){
				trips.put(tripId, trip);
				tripId++;
				break;
			}
		}
	}
	
	int smallestTrip = 0;
	
	for (List<Integer> integer : trips.values()) {
		if(smallestTrip == 0 || integer.size() < smallestTrip){
			smallestTrip = integer.size();
		}
	}
	return smallestTrip;
}

	private static boolean containsAll(List<Integer> trip, Set<Integer> destList) {

		for (Integer integer : destList) {
			if (!trip.contains(integer)) {
				return false;
			}
		}
		return true;
	}
}
