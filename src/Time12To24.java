import java.util.Scanner;

public class Time12To24 {
	static String timeConversion(String s) {

		String amPm = s.substring(s.length()-2);
		String time = s.substring(0, s.length()-2);
		String[] parts = time.split(":");
		if("AM".equals(amPm)){
			if(Integer.parseInt(parts[0]) == 12){
				parts[0] = "00";
			}
		}else{
			if(Integer.parseInt(parts[0]) != 12){
				parts[0] = (Integer.parseInt(parts[0])+12)+"";
			}
		}
		return parts[0]+":"+parts[1]+":"+parts[2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
