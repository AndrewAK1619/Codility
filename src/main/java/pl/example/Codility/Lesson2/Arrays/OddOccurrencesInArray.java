package pl.example.Codility.Lesson2.Arrays;

import java.util.*;

public class OddOccurrencesInArray {
	public int solution(int[] A) {

		Set<Integer> set = new HashSet<>();

		for (int a : A) {
			if (!set.contains(a)) {
				set.add(a);
			} else {
				set.remove(a);
			}
		}
		for (int a : set) {
			return a;
		}
		return 0;
	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 5, 6, 7 };  // test array

		OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
		System.out.println(oddOccurrencesInArray.solution(A));
	}
}
