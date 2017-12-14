import java.util.Scanner;


public class HourGlass {

	public static void main(String[] args) {
		 try {
			Scanner in = new Scanner(System.in);
			    int arr[][] = new int[6][6];
			    for(int i=0; i < 6; i++){
			        for(int j=0; j < 6; j++){
			            arr[i][j] = in.nextInt();
			        }
			    }
			    in.close();
			    
			    int max = -9*7;
			    for (int i = 0; i <= 3; i++) {
					for (int j = 0; j <= 3; j++) {
						int current =0;
						for (int k = 0; k < 3; k++) {
							for (int k2 = 0; k2 < 3; k2++) {
								
								if(k ==1){
									if(k2 == 1) {
										current += arr[i + k][j + k2];
									}
								}else{
									current+=arr[i+k][j+k2];
								}
							}
						}
						if(current>max)
							max = current;
						
						current=0;
					}
				}
			    
			    System.out.println(max);
		} catch (Exception e) {
			System.out.println(0);
		}
	}

}
