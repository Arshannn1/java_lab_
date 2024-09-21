package popo;
import java.util.*;

public class wordfreq {
	
	public static void main (String[] args)
	{
      Scanner st = new Scanner(System.in);
      System.out.println("Enter the string :");
      String str = st.nextLine();
      StringTokenizer words = new StringTokenizer(str);
      
      Map< String , Integer> wordfreq = new HashMap<>();
      
      while(words.hasMoreTokens())
      {
    	  String word = words.nextToken();
    	  wordfreq.put(word,wordfreq.getOrDefault(word,0)+1);
}
      
      wordfreq.forEach((key,value) -> System.out.println(key + " is " + value));
      
}
}