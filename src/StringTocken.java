import java.io.*;
import java.util.*;
public class StringTocken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] a = s.split("[ !,?\\._'@]+");
        System.out.println(a.length);
        for (String string : a) {
			System.out.println(string);
		}
        scan.close();
    }
}