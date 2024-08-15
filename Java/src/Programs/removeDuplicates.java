package Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		String sentence = "a boy is a good boy";
        String result = removeDuplicateWords(sentence);
        
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Sentence without duplicates: " + result);
    }

    public static String removeDuplicateWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Use LinkedHashSet to maintain the order of words and remove duplicates
        Set<String> wordSet = new LinkedHashSet<>();
        
        // Add words to the set
        for (String word : words) {
            wordSet.add(word);
        }
        
        // Join the words back into a single string
        StringBuilder sb = new StringBuilder();
        for (String word : wordSet) {
            sb.append(word).append(" ");
        }
        
        // Trim the trailing space
        return sb.toString().trim();

	}

}
