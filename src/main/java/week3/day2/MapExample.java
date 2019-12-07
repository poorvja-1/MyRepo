package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	static final int MAX_CHAR = 256; 
	public static void main(String[] args) {

		
			String str = "manoj kumar";
		char[] cArray = str.toCharArray();
		            	Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();   
		            	
		            for (char each : cArray)	{
		            	if (map.containsKey(each)) {
		            		map.put(each, map.get(each)+1);
		            }
		            	else {
		            		map.put(each, 1);
		            	}
		            	
		            	
		            	
		        }
		            System.out.println(map.entrySet());	
		}

	
	
	
	
	}

