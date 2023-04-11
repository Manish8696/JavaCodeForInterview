package String;

import java.util.HashMap;
import java.util.Set;

public class CharFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="MMMManish Kumar";
HashMap<Character,Integer> h = new HashMap<Character,Integer>();
for(char c : s.toCharArray()) {
	
	if(h.containsKey(c)) {
		h.put(c, h.get(c)+1);
	}
	else {
		h.put(c, 1);
	}
}
Set<Character> c1 = h.keySet();
for(char c2 :c1) {
	if(h.get(c2)>1)
	System.out.println(c2+" "+h.get(c2));
}
	}

}
