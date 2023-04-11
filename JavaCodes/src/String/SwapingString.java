package String;

public class SwapingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "Manish";
String s2 = "Kumar";
System.out.println("Before Swaping : "+ s1+":"+s2);
s1= s1+s2;
s2=s1.substring(0, s2.length()+1);
s1=s1.substring(s2.length());
System.out.println("After Swaping : "+s1+":"+s2);
	}

}
