import java.util.*;
public class PrintDupCharacter {
	public static void main(String[] args) {
		printDuplicateCharacters("vishal");
		printDuplicateCharacters("rosillin");
		printDuplicateCharacters("programming");
			
	}

	public static void printDuplicateCharacters(String word)
	{
		char[] characters = word.toCharArray();
		
		//build a hash map with the character and number of times they appear in the string
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch: characters)
		{
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
		}
		else
		{
			charMap.put(ch, 1);
			
		}
		
	}
		//iterate through the HashMap toprint all the duplicate elements of string
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate elements are : %s %n",word);
		for(Map.Entry<Character, Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.printf("%s : %d %n",entry.getKey(), entry.getValue());
				
			}
//			else if(entry.getValue()<=1)
//			{
//				System.out.println("the given string contains no duplicate values");
//			}
		}
	}
}
