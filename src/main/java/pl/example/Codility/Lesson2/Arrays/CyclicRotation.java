package pl.example.Codility.Lesson2.Arrays;

import java.util.Arrays;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		int[] resultArray = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			resultArray[(i + K) % A.length] = A[i];
		}
		return resultArray;
	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8 }; // test array
		int K = 201; // test number

		CyclicRotation cyclicRotation = new CyclicRotation();

		System.out.println(Arrays.toString(cyclicRotation.solution(A, K)));
	}
}