package Testing;

/* Rohan Pandey
 * AP Computer Science
 * October 24, 2017
 * 
 * Vowels.java reads input from poetry.txt and counts the number
 * of each vowel. It replaces every space with a tilde and writes
 * this edited version along with the vowel counts to dentist.txt.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args){
		File source = new File("/Users/rohan/Desktop/poetry.txt");
		File dest = new File("/Users/rohan/Desktop/dentist.txt");
		
		try {
			Scanner scan = new Scanner(source);
			FileWriter writer = new FileWriter(dest);
			String line = "", fin = ""; // initialize initial and final lines
			int A = 0, E = 0, I = 0, O = 0, U = 0;
			
			while (scan.hasNextLine()) {
				line = scan.nextLine(); // reads one line from poem file
				System.out.println(line); // prints original
				
				for (int j = 0; j < line.length(); j++) { 
					String chr = line.substring(j, j + 1); // scans through a line character by character
					
					switch (chr) {
					case "A": // covers uppercase vowel
					case "a": // adds count for each vowel
						A++;
						break;
					case "E":
					case "e":
						E++;
						break;
					case "I":
					case "i":
						I++;
						break;
					case "O":
					case "o":
						O++;
						break;
					case "U":
					case "u":
						U++;
						break;
					case " ": // replaces spaces with tilde
						chr = "~";
						break;
					default: // non-vowel/spaces are left alone
						break;
					} // close switch
					fin = fin.concat(chr); // concatenates each character to whole line
				} // close for		
				writer.append(fin + "\r\n"); // writes whole line
				fin = ""; // resets final line to prepare for next round of concatenation
			} // close while
			writer.append("\r\n" + "A count = " + A + "\r\n"); // writes each of vowel values
			writer.append("E count = " + E + "\r\n");
			writer.append("I count = " + I + "\r\n");
			writer.append("O count = " + O + "\r\n");
			writer.append("U count = " + U);
			writer.close();
		} // close try
		catch (IOException e) {
			System.out.println("Unable to find source or destination file");
		}
		
	}
}


