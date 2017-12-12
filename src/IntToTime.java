import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class IntToTime {
	
	public static void main(String[] args) {
		System.out.println(new IntToTime().solution(1, 8, 3, 2, 6, 4));
	}
	
    public String solution(int A, int B, int C, int D, int E, int F) {
    	String notPossible="NOT POSSIBLE";
	
	
	int[] arr = {A,B,C,D,E,F};
	
	Arrays.sort(arr);
	
	List<Integer> highNumber = new ArrayList<Integer>();
	List<Integer> lowNumber = new ArrayList<Integer>();
	List<Integer> zeorNumber = new ArrayList<Integer>();
	
	
	
	int hh = 0;
	int mm =0;
	int ss= 0;
	
	for(int i=0; i<arr.length;i++){
		if(arr[i] ==0){
			zeorNumber.add(arr[i]);
		}else if(arr[i] >=6){
			highNumber.add(arr[i]);
		}else{
			lowNumber.add(arr[i]);
		}
	}
	
	Collections.sort(highNumber);
	Collections.sort(lowNumber);
	Collections.sort(zeorNumber);
	
	if(zeorNumber.size() == 0){
	 hh = lowNumber.get(0)*10+ lowNumber.get(1);;
	
    	if(hh >= 24){
    		return notPossible;
    	}
	else{
		    		
		if(highNumber.size() > 2){
			return notPossible;
		}else{
			if(highNumber.size() == 2){
				mm =lowNumber.get(2)*10+ highNumber.get(0);
				ss =lowNumber.get(3)*10+ highNumber.get(1);
			}else if(highNumber.size() == 1){
				mm =lowNumber.get(2)*10+ lowNumber.get(3);
				ss =lowNumber.get(4)*10+ highNumber.get(0);
			}else{
				hh =lowNumber.get(2)*10+ lowNumber.get(3);
				ss =lowNumber.get(4)*10+ lowNumber.get(5);
			}
		}
			
	}
} else{
	if((zeorNumber.size()+lowNumber.size()) < highNumber.size()){
		return notPossible;
	}else{
		zeorNumber.addAll(lowNumber);
		Collections.sort(zeorNumber);
		if(highNumber.size() == 3){
			hh = zeorNumber.get(0)*10+highNumber.get(0);
			mm = zeorNumber.get(1)*10+highNumber.get(1);
			ss = zeorNumber.get(2)*10+highNumber.get(2);
		}else if(highNumber.size() == 2){
			hh =zeorNumber.get(0)*10+zeorNumber.get(1);
			mm =zeorNumber.get(2)*10+ highNumber.get(0);
			ss =zeorNumber.get(3)*10+ highNumber.get(1);
		}else if(highNumber.size() == 1){
			hh =zeorNumber.get(0)*10+zeorNumber.get(1);
			mm =zeorNumber.get(2)*10+ zeorNumber.get(3);
			ss =zeorNumber.get(4)*10+ highNumber.get(0);
		}else{
			hh = zeorNumber.get(0)*10+zeorNumber.get(1);
			hh =zeorNumber.get(2)*10+ zeorNumber.get(3);
			ss =zeorNumber.get(4)*10+ zeorNumber.get(5);
		}
		
	}
}
	
	return (hh <10?"0"+hh: hh)+":"+(mm <10?"0"+mm: mm)+":"+(ss <10?"0"+ss: ss);}
}