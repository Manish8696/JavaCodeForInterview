package String;

public class InterChangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Manish Kumar";
String s1 [] = s.split(" ");
String s2="";
for(int i=s1.length-1;i>=0;i--) {
	s2=s2+s1[i]+" ";
}
System.out.println(s2.length()+" "+s.length());
s2=s2.trim();
System.out.println(s2);
System.out.println(s2.length());
	}

}
