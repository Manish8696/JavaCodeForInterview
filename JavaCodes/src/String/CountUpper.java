package String;

public class CountUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "asdfgASDFGasdfASDFG";
s=s.replaceAll("[^A-Z]", "");
int n =s.length();
//for(char c : s.toCharArray()) {
//	if(Character.isUpperCase(c)) {
//		n++;
//	}
//}
System.out.println("total uppercase is : "+n);
	}

}
