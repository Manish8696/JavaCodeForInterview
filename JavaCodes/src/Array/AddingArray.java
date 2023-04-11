package Array;
import java.util.*;
public class AddingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"aas","SSS","ant"};
String s1[]= {"ree","tyu","rww"};
ArrayList<String> a = new ArrayList<String>(Arrays.asList(s));
a.addAll(Arrays.asList(s1));
System.out.println(a);
	}

}
