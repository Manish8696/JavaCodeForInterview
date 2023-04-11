package String;

public class ConvertToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "this is manish kumar";
String []s1 = s.split(" ");
for(String s2 : s1) {
	System.out.print(s2.substring(0,1).toUpperCase()+s2.substring(1,s2.length())+" ");
}

	}

}
