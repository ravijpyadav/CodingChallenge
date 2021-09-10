package turing;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {

	}
	
	public static List<String> findMissingRanges(int[] nums, int lower, int upper){
		List<String> retList = new LinkedList<>();
		
		List<List<Integer>> ranges = new LinkedList<>();
		if(nums.length == 0){
			retList.add(lower +"->"+upper);
			return retList;
		}
		List<Integer> range= new LinkedList<>();
		for (int i = lower; i <= upper; i++) {
			
			if(!contains(nums, i)){ 
				range.add(i);
			}else if(range.size() != 0){
				range= new LinkedList<>();
			}
		}
		
		for (List<Integer> list : ranges) {
			if(list.size() == 1){
				retList.add(""+list.get(0));
			}else{
				retList.add(list.get(0) +"->"+ list.get(list.size()-1));
			}
		}
		
		return retList;
	}

	private static boolean contains(int[] nums, int i) {
		for (int num : nums) {
			if(i==num){
				return true;
			}
		}
		return false;
	}
	
}
