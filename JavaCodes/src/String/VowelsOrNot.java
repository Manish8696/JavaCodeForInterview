package String;

public class VowelsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "This is Manish";
 s = s.replaceAll("[^aeiouAEIOU]", "");
 int num = s.length();
 if(num>0) {
	 System.out.println("String contains vowel and no. of vowel it has : "+ num);
	 
 }
 
	}

}
