/**
 * phoenix
 * Dec 17, 2024
 */
package interviewPrep;

import java.util.Scanner;

/**
 * 
 */
public class StaticBlock {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
			byte b = in.nextByte();
			byte h = in.nextByte();
			
			if( b <= 0 || h <= 0 ) {
				System.out.println("java.lang.Exception: Breadth and height must be  positive");
			}else {
					System.out.println(b * h);
				
			}
			in.close();
	}

}
