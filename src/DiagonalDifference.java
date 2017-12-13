import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[][] matrix = new int[n][n];
        
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		matrix[i][j]= scan.nextInt();
            }
        }
        scan.close();

        int d1 = 0;
        int d2 = 0;
        
        for(int i=0; i<n; i++){
        	d1+=matrix[i][i];
        	d2+=matrix[n-1-i][i];
        }
        
        int d =d1-d2;
        
        d = d>=0?d:(d*(-1));
        System.out.println(d);
	}

}
