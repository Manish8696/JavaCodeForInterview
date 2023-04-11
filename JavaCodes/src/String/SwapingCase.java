package String;

public class SwapingCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "asdfg ASDFG ASSasd xcv";
for(char c : s1.toCharArray()) {
	if(Character.isUpperCase(c)) {
		c= Character.toLowerCase(c);
	}
	else if(Character.isLowerCase(c)) {
		c= Character.toUpperCase(c);
	}
	System.out.print(c);
}

	}

}
