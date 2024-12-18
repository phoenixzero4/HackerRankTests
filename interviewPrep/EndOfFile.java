package interviewPrep;

import java.util.Scanner;

public class EndOfFile {

	// read input from stdin and print to stdout with a line number before each line
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int line = 1;
		while( input.hasNext() ) {
			System.out.println(line + " " + input.nextLine());
			line++;
		}
		input.close();
	}

}
