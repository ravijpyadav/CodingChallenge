
public class FormatTelephone {
public static void main(String[] args) {
	String s = "00-44  48 5555 8361";
	
	String phoneNumber = sulotion(s);
	System.out.println(phoneNumber);
}

private static String sulotion(String S) {

	String tempNum = "";
	
	//remove spaces and dashes
	for(int i= 0; i<S.length() ; i++){
		if(S.charAt(i) == ' ' || S.charAt(i) == '-'){
			continue;
		}
		tempNum = tempNum+ S.charAt(i);
	}
	
	String returnVal= "";
	
	if(tempNum.length() < 4){
		return tempNum;
	}
	if(tempNum.length() == 4){
		return tempNum.substring(0, 2)+ "-"+ tempNum.substring(2);
	}
	
	for(int j=0 ; j< tempNum.length(); j++){
		returnVal= returnVal+tempNum.charAt(j);
		if((j+1)%3==0 && j != 0){
			returnVal= returnVal+"-";
			if(tempNum.substring(j+1).length() == 4){
				returnVal = returnVal+ tempNum.substring(j+1 , j+3) +"-"+ tempNum.substring(j+3);
				break;
			}
		}
	}
	int len = returnVal.length();
	if(returnVal.charAt(len-1) == '-'){
		returnVal = returnVal.substring(0, len-1);
	}
	return returnVal;
}
}
