package Integer;

public class AddAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 12345;
int n =0;
while(num !=0) {
	n=n+num%10;
	num=num/10;
}
System.out.println(n);
	}

}
