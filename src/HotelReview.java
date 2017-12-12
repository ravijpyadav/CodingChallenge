import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class HotelReview {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	Scanner in = new Scanner(System.in);
    	Map<Integer,List<String>> hotelsWithReviewList= new HashMap<Integer,List<String>>();
    	
    	String reviewWordsLine = in.nextLine();
    	
    	String[] reviewWords = reviewWordsLine.split(" ");
    	List<String> reviewWordList =new ArrayList<String>();
    	for (String string : reviewWords) {
			if("".equals(string) || "".equals(string))
				continue;
			reviewWordList.add(string);
		}

    	String hotelNumStr = in.nextLine();
    	
    	int hotelNum = Integer.parseInt(hotelNumStr);
    	
    	for(int i=0 ; i< hotelNum ; i++){
    		
    		String hotelNumTempStr = in.nextLine();
    		String hotelReview = in.nextLine();
    		
    		int hotelNumTemp = Integer.parseInt(hotelNumTempStr);
    		
    		List<String> reviews = hotelsWithReviewList.get(hotelNumTemp);
    		if(reviews == null){
    			reviews = new ArrayList<String>();
    			hotelsWithReviewList.put(hotelNumTemp, reviews);
    		}
    		reviews.add(hotelReview);
    		
    	}
    	
    	Map<Integer, Integer> hotelRating = getsortedRatingMap(hotelsWithReviewList, reviewWordList);
    	
    	Collection<Integer> rating =hotelRating.values();
    	
    	int[] ratingArr = new int[rating.size()];
    	int i =0;
    	for (Integer integer : rating) {
    		ratingArr[i] = integer;
    		i++;
		}
    	
    	for (int j=(ratingArr.length -1) ; j>=0 ; j--) {
    		System.out.println(ratingArr[j]+" ");
		}
    	
    	
    }

	private static Map<Integer, Integer> getsortedRatingMap(
			Map<Integer, List<String>> hotelsWithReviewList, List<String> reviewWordList) {
		
		SortedMap<Integer, Integer> ketys = new TreeMap<Integer, Integer>();

		for (Entry<Integer, List<String>> hotelWithReview : hotelsWithReviewList.entrySet()) {
			int hotelId = hotelWithReview.getKey();
			int ratingCount = 0;
			
			List<String> reviews = hotelWithReview.getValue();
			
			for (String review : reviews) {
				String[] reviewAr =review.split(" ");
				
				for (String string : reviewAr) {
					if(reviewWordList.contains(string)){
						ratingCount++;
					}
				}
			}
			
			ketys.put(ratingCount, hotelId);
		}
		
		return ketys;
	}
}