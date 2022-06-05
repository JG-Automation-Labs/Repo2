import java.util.HashMap;
import java.util.Map;

public class Demo   

{
	public static void main(String []args) {
		Demo.getCharString("test");
	}
	public static void getCharString(String name) {
		Map<Character,Integer> charMap = new HashMap< Character,Integer>();
		char s[] = name.toCharArray();
		for(char c: s) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, charMap.get(c));
			}
			}System.out.println(" "+charMap);
		}
	}
	
 