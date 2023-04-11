package Array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"fig","apple", "banana","date", "cherry" };
//		Arrays.sort(arr);
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j].compareToIgnoreCase(arr[j+1])>0) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
//Note that the compareTo method is used to compare strings lexicographically in Java.
//If the result of compareTo is positive, it means the first string is greater than the second; 
//if it is negative, it means the first string is less than the second; and if it is zero, it means the two strings are equal.
