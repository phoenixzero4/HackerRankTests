package interviewPrep;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'minimumBribes' function below.
	 *
	 * The function accepts INTEGER_ARRAY q as parameter.
	 */
	static int bribes;

	public static void minimumBribes(List<Integer> q) {
		bribes = 0;
		for (Integer integer : q) {
			System.err.print(integer + " ");
		}
		System.err.println("");

		Integer[] array = q.toArray(new Integer[0]);

		for (int i = 0; i < array.length; i++) {
			
			// System.err.println("array[" + i + "] = " + array[i]);

			int place = i + 1;
			int number = array[i];
			
			if( number )

			if ((number - place) > 2) {
				System.out.printf("Too chaotic\n");
				break;
			} else if (number >= place) {
				bribes += number - place;
				// System.err.println("Number " + number + " is at place " + place);
				// System.err.println("It must have made " + Math.abs(number - place) + "
				// jumps");
			}

		}
		System.out.println(bribes);

	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList());

				Result.minimumBribes(q);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}
}
