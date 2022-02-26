
public class ArrayRotation {

	public static void main(String[] args) {
		int[] a ={3,2,1,4,5};  
		
		int[] rotLeft = rotLeft(a, 2);
		for (int i = 0; i < rotLeft.length; i++) {
			System.out.println(rotLeft[i]);
		}
	}
	
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

    	int actualRotation = d%a.length;
    	if(actualRotation ==0){
    		return a;
    	}
    	
    	int[] _a = new int[a.length];
    	
    	for (int i = 0; i < a.length; i++) {
			int j = i+actualRotation;
			if(j>=a.length){
				j= j-a.length;
			}
			_a[i] =a[j];
		}
    	return _a;
    }
}
