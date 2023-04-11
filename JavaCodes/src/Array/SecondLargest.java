package Array;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {-12,34,-9,0,89,-10};
		int temp;
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
			
				if(n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}

}
