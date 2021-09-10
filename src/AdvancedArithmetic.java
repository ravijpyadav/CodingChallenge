
public class AdvancedArithmetic {

	public static void main(String[] args) {
		int x= new AdvancedArithmetic().divisorSum(6);
		System.out.println(x);
	}
	public int divisorSum(int n){
		int sum = n==1? 1:(1+n);
		
		for(int i=2; i <= n/2; i++){
			if(n%i ==0){
				sum +=i;
			}
		}
		return sum;
	}
}
