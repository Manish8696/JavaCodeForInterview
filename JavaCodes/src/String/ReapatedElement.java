package String;
import java.util.*;

public class ReapatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "settings";
String [] s1 = s.split("");
HashSet<String> h = new HashSet<String>();
for(String s2 : s1) {
	if(h.add(s2)==false) {
		System.out.println(s2);
	}
}


	}

}
