import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsSOS {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	try {
			Scanner sc=new Scanner(System.in);
			String sos=sc.nextLine();
			
			if(sos == null || sos.length() == 0){
				System.out.println(0);
			}else{
				int alteredLetters = 0;
				String currentOso= "";
				for(int i=0 ; i< sos.length();){
					if(i+3 > sos.length()){
						currentOso = sos.substring(i);
					}else{
						currentOso = sos.substring(i, i+3);
					}
					
					for(int j =0; j< currentOso.length(); j++){
						if((j==1)&&!"O".equals(currentOso.charAt(j)+"")){
							alteredLetters++;
						}else if((j!=1)&&!"S".equals(currentOso.charAt(j)+"")){
							alteredLetters++;
						}
					}
					i=i+3;
				}
				System.out.println(alteredLetters);
			}
		} catch (Exception e) {
			System.out.println(0);
		}
        
    }
}