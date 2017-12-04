import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SmallestAndLargest {
public static void main(String[] args) {
	 System.out.println(getSmallestAndLargest("smallss", 3));
}


public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    List<String> list = new ArrayList<String>(); 
    
    for(int i =0 ; i<(s.length()-k+1); i++){
    	list.add(s.substring(i,i+k));
    }
    Collections.sort(list);
    smallest = list.get(0);
    largest = list.get(list.size()-1);
    return  smallest+ "\n" + largest;
}
}
