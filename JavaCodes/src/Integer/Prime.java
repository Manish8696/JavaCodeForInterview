package Integer;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
for(int i=2;i<101;i++) {
	int a=0;
	for(int j=2;j<i+1;j++) {
		if(i%j==0) {
			a++;
		}
	}
	if(a ==1) {
		System.out.print(i+" ");
	}
}

	}

}
