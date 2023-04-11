package Array;

import java.util.Arrays;

public class MoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] n= {-12,34,-9,0,89,-10};
int n1=0;
int temp;
for(int i=0;i<n.length;i++) {
	if(n[i]<0) {
		if(n1 != i) {
			temp=n[i];
			n[i]=n[n1];
			n[n1]=temp;
		}
		n1++;
	}
}
System.out.println(Arrays.toString(n));
	}

}
