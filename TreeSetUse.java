/**
 * 
 */
package mypackage;
/**
 * @author zahircooper
 */
import java.util.TreeSet;
import java.util.Scanner;//import classes


public class TreeSetUse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//Read input from user
		System.out.println("Enter text here: ");//Tell user to enter text
		String line = scanner.nextLine();//store text in variable
		
		String[] words = line.split("\\s+");//Split into individual words
		TreeSet<String> wordSet = new TreeSet<String>(); //sorting the elements in ascending order
		
		for (String word : words) {  
			wordSet.add(word);
		}//add words to TreeSet
		
		System.out.println("words in ascending order: ");
		for (String word : wordSet) {
			System.out.println(word);//print words in ascending order
		}

	
	}

}
