package pl.example.Codility.Lesson4.CountingElements;

import java.util.*;

public class FrogRiverOne {
	public int solution(int X, int[] A) {

		int result = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
			if (set.size() == X) {
				result = i;
				break;
			} else {
				result = -1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 }; // test array
		int X = 5; // test int

		FrogRiverOne frogRiverOne = new FrogRiverOne();
		System.out.println(frogRiverOne.solution(X, A));
	}
}
