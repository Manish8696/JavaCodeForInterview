package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortOneSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,8,9,67,85,44,90,89,10};
int p=a.length;
int [] a1 = new int[p];
int p1=0;
for(int i=0;i<a.length;i++) {
	if(a[i]%2 ==0) {
		a1[p1]=a[i];
		p1++;	
	}
	else {
		a1[p-1]=a[i];
		p--;
	}
	
}
System.out.println(Arrays.toString(a1));
	}

}
