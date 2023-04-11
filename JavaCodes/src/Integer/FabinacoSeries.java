package Integer;

import java.util.Scanner;

public class FabinacoSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n = s.nextInt();
s.close();
int a = 0;
int b =1 ;
int sum=0;
System.out.print(a+" "+b);
for(int i =2;i<n;i++) {
	sum= a+b;
	a=b;
	b=sum;
	
	System.out.print(" "+sum);
}
	}

}
