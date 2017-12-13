import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j<(n-1-i)){
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
