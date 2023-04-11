package Integer;

public class CountEvenNOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =12345678;
int even =0;
int odd=0;
int num;
while(n !=0) {
	num=n%10;
	if(num%2 ==0) {
		even++;
	}
	else {
		odd++;
	}
	n=n/10;
}
System.out.println(even+":"+odd);
	}

}
