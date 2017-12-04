import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Anagram {

	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	 static boolean isAnagram(String a, String b) {
	        boolean isAnagram = true;
	        
	        if(a.length() != b.length())
	        	return false;
	        
	        Map<String, Integer> mapA= new HashMap<String, Integer>();
	        Map<String, Integer> mapB= new HashMap<String, Integer>();
	        for(int i =0 ; i <a.length(); i++){
	        	String aa= (a.charAt(i)+"").toLowerCase();
	        	String bb= (b.charAt(i)+"").toLowerCase();
	        	
	        	int valueA = mapA.get(aa) == null ? 1: mapA.get(aa)+1;
	        	mapA.put(aa, valueA);
	        	
	        	int valueB = mapB.get(bb) == null ? 1: mapB.get(bb)+1;
	        	mapB.put(bb, valueB);
	        }
	        if(mapA.keySet().containsAll(mapB.keySet()) && mapB.keySet().containsAll(mapA.keySet())){
	        	for (String element : mapA.keySet()) {
					if(!mapA.get(element).equals(mapB.get(element))){
						isAnagram = false;
						break;
					}
				}
	        }else{
	        	isAnagram=false;
	        }
	        
	        return isAnagram;
	    }
}
