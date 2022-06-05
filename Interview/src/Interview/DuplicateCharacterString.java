//program to count character  in string.
package Interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterString {

	public static void main(String[] args) {
		getCharCount("java");
		getCharCount("java is programming language");
			}
	public static void getCharCount(String name) {
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		char strArray[] = name.toCharArray();
		for(char c:strArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c,1);
			}
		}System.out.println(charMap);
	}

}
