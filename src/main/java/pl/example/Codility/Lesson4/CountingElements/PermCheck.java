package pl.example.Codility.Lesson4.CountingElements;

import java.util.*;

public class PermCheck {
	public int solution(int[] A) {

		Set<Integer> set = new HashSet<>();

		for (int element : A) {
			set.add(element);
		}

		for (int i = 0; i < A.length; i++) {
			if (!set.contains(i + 1)) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 10 }; // test array
		
		PermCheck permCheck = new PermCheck();
		System.out.println(permCheck.solution(A));
	}
}
