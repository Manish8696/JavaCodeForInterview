package String;

public class TypeOfChar {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "asfghjk1234567!@#$Z%    ";
int letter =0;
int digit =0;
int space=0;
int other =0;
for(char c : s.toCharArray()) {
	if(Character.isLetter(c)) {
		letter++;
	}
	else if(Character.isDigit(c)) {
		digit++;
	}
	else if(Character.isSpace(c)) {
		space++;
	}
	else {
		other++;
	}
	
}

System.out.println("no. of letters : "+ letter);
System.out.println("no. of digits : "+ digit);
System.out.println("no. of spaces : "+ space);
System.out.println("no. of others : "+ other);



//int n= s.length();
//s= s.replaceAll("\\s{2,}","");
//int a2=s.length();
//int a = n-a2;
//System.out.println("no. of space : " + a);
//s=s.replaceAll("[^a-zA-Z0-9]", "");
//int a1 = s.length();
//int a3= a2-a1;
//System.out.println("no. of spacial char : " + a3);

	}

}
