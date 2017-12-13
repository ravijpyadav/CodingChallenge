import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] matrix = new int[n];
        
        	for(int j=0;j<n;j++){
        		matrix[j]= scan.nextInt();
            }
        scan.close();
        int plus=0;
        int minus =0;
        int zero = 0;
        for(int j=0;j<n;j++){
    		if(matrix[j]==0){
    			zero++;
    		}else if(matrix[j]> 0){
    			plus++;
    		}else{
    			minus++;
    		}
        }
        System.out.println((double)plus/n);
        System.out.println((double)minus/n);
        System.out.println((double)zero/n);
	}

}
