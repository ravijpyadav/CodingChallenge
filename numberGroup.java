import java.util.Scanner;


public class numberGroup {
    static long sumOfGroup(int k) {

    	int group=1;
    	int numStart=0;
    	for(int i=1; i <=group; ){
    		
    		
    		if(numStart==0){
    			numStart=1;
    		}else{
    			numStart = numStart+2;
    		}
    		
    		if(group == k)
    			break;
    		
    		if(i==group){
    			group++;
    			i=1;
    		}else{
    			i++;
    		}
    	}
    	// 1, 3,5, 7,9,11, 13,15,17,19
    	long retVal =numStart;
    	for(int i=1 ;i<k; i++){
    		numStart = numStart+2;
    		retVal=retVal+ numStart;
    	}
    	return retVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        in.close();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        
    }
}
