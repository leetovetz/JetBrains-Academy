/*
 * Task. 
 * Sort the text in alphabetical order from the file. 
 * And whatever the elements are repeated.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class TextSorting {

	public static void main(String[] args) {
		Scanner scanner = null;
		Set<String> set = new TreeSet<>();
		
		try {
			scanner = new Scanner (new FileReader(
					new File("D:\\text.txt")));
			scanner.useDelimiter("\\W");
			while (scanner.hasNext()) {
				String word = scanner.next();
				set.add(word);
			}
			for (String word : set) {
				System.out.println(word);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("We have a problem!");
		} finally {
			scanner.close();
		}


	}

}
