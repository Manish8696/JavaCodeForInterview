package Integer;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int num1=0;
		while(num !=0) {
			num1 = num1*10+num%10;
			num=num/10;
		}
System.out.println(num1);
	}

}
