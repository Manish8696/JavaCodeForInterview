package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FirstNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="MManaish";
String s1="";
String [] a =s.split("");
ArrayList<String> a1= new ArrayList<String>(Arrays.asList(a));
HashSet<String> m = new HashSet<String>();
ArrayList<String> a2= new ArrayList<String>();



for(int i =0;i<s.length();i++) {
	if(m.add(a1.get(i)) == false) {
		a2.add(a1.get(i));
		
	}

}
System.out.println(a2);
a1.removeAll(a2);
System.out.println(a1);
System.out.println(a1.get(0));

	}

}
//*
//public class FirstNonRepeatedCharFirst {
//public static void main(String args[]) {
//    
//    String inputStr ="teeter";
//
//    for(char i :inputStr.toCharArray()){
//    if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
//        System.out.println("First non-repeating character is: "+i);
//        break;
//    }
//    }
//}
//}
////*
