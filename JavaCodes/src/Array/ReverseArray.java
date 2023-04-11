package Array;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] s = {"a","b","c","v"};
ArrayList<String> s1 = new ArrayList<String>(Arrays.asList(s));
//Collections.reverse(s1);
//String[] s1 = new String[4];
//int p =0;
//for(int i =s.length-1;i>=0;i--) {
//	s1[p]= s[i];
//	p++;
//}
s1.remove(2);
System.out.println(Arrays.toString(s));
System.out.println(s1);

	}

}
