package lab03;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 * Lab 3: Loops and input
 *
 * @author Zain Kergaye
 * @version January 23, 2024
 */

public class TreeDataAnalyzer {

	public static void main(String[] args) throws IOException {
		File filename = new File("lab03/forest.txt"); // can call files like linux; base dir is just CS1420
		Scanner file = new Scanner(filename); 
		
		String treeName;
		int treeCount;
		int totalTreeCount = 0;
		int highestTreeCount = 0;
		int lowestTreeCount = 10000000; // Setting to high number so code works; Isn't reliable though
		
		while(file.hasNext()) { // hasNext asks Scanner if new data is there
			treeName = file.next();     
			treeCount = file.nextInt(); 
			System.out.println("Tree: " + treeName + " has a count of " + treeCount + ".");
			totalTreeCount += treeCount;
			if(highestTreeCount < treeCount) {
				highestTreeCount = treeCount; // Sets the current treeCount to the highest one if it's the highest one there
			} else if(lowestTreeCount > treeCount) {
				lowestTreeCount = treeCount; // Sets the current treeCOunt to the lowest if it's the current lowest of the iteration
			}
		}

		System.out.println("Total tree count is " + totalTreeCount + ".");
		System.out.println("Highest tree count is " + highestTreeCount + ".");
		System.out.println("Lowest tree count is " + lowestTreeCount + ".");

		file.close();

	}

}
