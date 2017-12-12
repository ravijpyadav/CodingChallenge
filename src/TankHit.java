import java.util.ArrayList;
import java.util.List;


public class TankHit {
public static void main(String[] args) {
	
	String S="1B 2C,2D 4D";
	String T ="2B 2D 3D 4D 4A";
	int N = 4;
	
	String result = new TankHit().solution(N, S, T);
	
	System.out.println(result);
	
	String S1="1A 1B,2C 2C";
	String T1 ="1B";
	int N1 = 4;

	String result1 = new TankHit().solution(N1, S1, T1);
	
	System.out.println(result1);
	
}

public String solution(int N, String S, String T){
	
	List<String> hitsList = new ArrayList<String>();
	
	String[] hitsArr = T.split(" ");
	for (String string : hitsArr) {
		hitsList.add(string);
	}
	
	List<List<String>> ships =new ArrayList<List<String>>(); 
	
	String[] shipcoOrArr = S.split(",");
	
	for (String string : shipcoOrArr) {
		String[] shipCorOrd = string.split(" ");
		
		int x1 = Character.getNumericValue(shipCorOrd[0].charAt(0));
		int y1 = shipCorOrd[0].charAt(1) - 64;
		
		int x2 = Character.getNumericValue(shipCorOrd[1].charAt(0));
		int y2 = shipCorOrd[1].charAt(1) - 64;
		
		List<String> ship = new ArrayList<String>();
	
		for(int i=x1; i<=x2 ; i++){
			for(int j=y1 ; j<=y2 ; j++){
				ship.add((i+"")+(((char)(j+64)+"")) +"");
			}
		}
		
		ships.add(ship);
	}
	
	int sunk = 0;
	int hits = 0;
	for (List<String> string : ships) {
		
		
		if(hitsList.containsAll(string)){
			sunk++;
		} else{
			
			for (String string2 : hitsList) {
				if(string.contains(string2)){
					hits++;
				}
			}
		}
	}
	
	return sunk+","+hits;
}
}
