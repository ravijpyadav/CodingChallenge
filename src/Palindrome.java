import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
        for(int i=0; i <(A.length()/2+1); i++){
        	if(A.charAt(i) != A.charAt(A.length()-i-1)){
        		System.out.println("No");
        		isPalindrome= false;
        		break;
        	}
        }
        
        if (isPalindrome) {
			System.out.println("Yes");
		}
    }
}