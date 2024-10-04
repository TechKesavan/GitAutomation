package javaPrograms;

import java.util.Arrays;

public class OccurenceOfNumArray {

	public static void main(String[] args) {

		int[] a = { 19,12,15,6,8,19,1,8,9,6,12,12 };

		Arrays.sort(a);

		int nbOccurences = 1;

		for (int i = 0, length = a.length; i < length; i++) {
			if (i < length - 1) {
				if (a[i] == a[i + 1]) {
					nbOccurences++;
				}
			} else {
				System.out.println(a[i] + " occurs " + nbOccurences
						+ " time(s)"); //end of array
			}

			if (i < length - 1 && a[i] != a[i + 1]) {
				System.out.println(a[i] + " occurs " + nbOccurences
						+ " time(s)"); //moving to new element in array
				nbOccurences = 1;
			}

		}

	}

}
