package Integer;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 49;
int num = 0;
for(int i =2;i<n;i++) {
	if( i*i ==n) {
		num++;
	}
	
}
if( num ==1)
System.out.println(n+" is perfect square of : "+ Math.sqrt(n));
	}

}
