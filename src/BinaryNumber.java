import java.util.Scanner;


public class BinaryNumber {

	public static void main(String[] args) {

		try {
			Scanner in = new Scanner(System.in);
			long k = in.nextLong();
			in.close();
			
				String binaryStr = Long.toBinaryString(k);
				int max = 0;
				int number = 0;
				String[] parts = binaryStr.split("0");
				for (int i = 0; i < parts.length; i++) {
					if (parts[i].length() > max) {
							max = parts[i].length();
					}
				}
				System.out.println(max);
		} catch (Exception e) {
			System.out.println(0);
		}

	}

}
