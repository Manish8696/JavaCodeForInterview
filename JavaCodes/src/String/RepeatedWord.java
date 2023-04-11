package String;

import java.util.HashMap;
import java.util.Set;

public class RepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = " This is is Manish kumar kumar";
String s2 [] = s.split(" ");
HashMap<String, Integer> h = new HashMap <String , Integer>();
for(String s1 : s2) {
	if(h.containsKey(s1)) {
		h.put(s1, h.get(s1)+1);
	}
	else {
		h.put(s1, 1);
	}
}
Set<String> s0= h.keySet();
for(String s9 :s0) {
	if(h.get(s9)>1) {
		System.out.println(s9+":"+h.get(s9));
	}
}

	}

}
