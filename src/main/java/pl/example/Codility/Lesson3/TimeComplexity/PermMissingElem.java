package pl.example.Codility.Lesson3.TimeComplexity;

import java.util.*;

public class PermMissingElem {
	public int solution(int[] A) {

		int result = 0;
		Set<Integer> set = new HashSet<>();

		for (int element : A) {
			set.add(element);
		}
		
		for (int i = 1; i <= A.length + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] A = { 2, 3, 1, 4, 6 }; // test array
		PermMissingElem permMissingElem = new PermMissingElem();

		System.out.println(permMissingElem.solution(A));
	}
}