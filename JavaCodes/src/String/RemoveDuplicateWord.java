package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "this is is manish kumar kumar";
String [] s1= s.split(" ");
//String s2;

//for(int i=0;i<s1.length;i++) {
//	s2="";
//	for(int j=i+1;j<s1.length;j++) {
//		if(s1[i] != s1[j] ){
//			s2=s2+s1[i];
//		}
//	
//	}
//	System.out.println(s2);
//}
//ArrayList<String> s2 = new ArrayList<String>();
HashSet<String> s3 = new HashSet<String>();
for(String s4 : s1) {
	if(s3.add(s4) !=false) {
//		s2.add(s4);
		System.out.print(s4+" ");
	}
}
//System.out.println(s2);
	}

}
