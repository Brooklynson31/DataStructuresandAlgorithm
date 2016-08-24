import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Exercise 1.1
//		String unique = "car";
//		String unique2 = "race";
		//hasUnique(unique);
		//hasUnique(unique2);
		//Unique(unique);
		//Unique(unique2);
		
		//Exercise 1.2 Check Permutation
//				String permutation1 = "car";
//				String permutation2 = "race";
				//System.out.println(perMutation(permutation1).equals(perMutation(permutation2)));	
		
		//Exercise 1.3 URLify'
//				String url = "Mr John Smith   ";
//				System.out.println(URLify(url));	
		
			//Exercise 1.4	
//		String palindrome1 = "Tact coa";
//		String palindrome2 = "Taco cat";
//		System.out.println(perMutation(palindrome1).equals(perMutation(palindrome2)));

	//Exercise 1.5
		// pale ple
		//pales pale
		//pale bale
		// pale bake
		//string builder should always be equal to second word
		String oneway1 = "pale";
		String oneway2 = "bake";
		String oneway3 = "bale";
		String oneway4 = "pales";
		String oneway5 = "ple";
		oneAway(oneway1,oneway2);
		oneAway(oneway1,oneway3);
		oneAway(oneway1,oneway4);
		oneAway(oneway1,oneway5);

	}
	public static boolean oneAway(String word1, String word2) {
		boolean isOneAway = false;	
		int changes = 0;
		StringBuilder sb = new StringBuilder();
		if(word1.length() == word2.length()){
			for(Character w: word1.toCharArray()){
				sb.append(w);}
				for(int i=0;i<word2.length()-1;i++){
				Character w2 = word2.charAt(i);
				if(!word1.contains(""+ w2)){
					sb.replace(i, i+1, w2.toString());
					changes++;
				}
			}
					
					
			}
		
		
		
		if(word1.length() < word2.length()){
			for(char w1 :word1.toCharArray()){
				if (word2.contains("" + w1)){
					sb.append(w1);
				}
				else{
					changes++;
					continue;
				}
			}
		}
		
		
		if(word1.length() > word2.length()){
			for(char w1 :word1.toCharArray()){
				if (word2.contains("" + w1)){
					sb.append(w1);
				}
				else{
					
					changes++;
					continue;
				}
			}
		}
		
		if(changes < 2){
			isOneAway = true;
		}
		System.out.println(word1 + " " + word2 + " " + sb + " " + changes + " " + isOneAway );
		return isOneAway;
	}
	public static boolean Unique(String word) {
		boolean isunique = true;	
		Map<Character, Integer> uni = new HashMap<Character,Integer>();
		perMutation(word);
		for(Integer a: uni.values())
		{
			if(a > 1)
				isunique=false;
		}
		System.out.println(uni);
		System.out.println(isunique);
		return isunique;
	}
	
	
	public static boolean hasUnique(String word ){
	boolean isunique = false;	
	Set<Character> charCheck = new HashSet<Character>();
	for(int c = 0;c<word.length();c++){
		char x = word.charAt(c);
		if(!charCheck.add(x)){
			isunique = false;
	}
		else{
			isunique = true;
		}
	}
	System.out.println(isunique);
	return isunique;
	}

	private static Map<Character,Integer> perMutation(String word) {
		Map<Character, Integer> uni = new HashMap<Character,Integer>();
		
		for(char c: word.toCharArray()){
			
			if (uni.containsKey(c)){
				int lettercount = uni.get(c);
				lettercount++;
				uni.put(c, lettercount );
			}
			else{
				uni.put(c, 1);
			}
		}
		return uni;
	}
	private static String URLify(String word){
	word = word.trim();
	word = word.replaceAll(" ", "%20");
	System.out.println(word.length());
		return word;
	}


}