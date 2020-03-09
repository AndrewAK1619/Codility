package pl.example.Codility.Lesson4.CountingElements;

import java.util.Arrays;

public class MaxCounters {
	public int[] solution(int N, int[] A) {

		int maxCounter = 0;
		int levelUp = 0;
		boolean isRepeatMax = false;

		int[] resultArray = new int[N];

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N) {
				resultArray[A[i] - 1] += 1;
				maxCounter = Math.max(maxCounter, resultArray[A[i] - 1]);
				isRepeatMax = false;
			} else {
				if (isRepeatMax == false) {
					levelUp += maxCounter;
					resultArray = new int[N];
					maxCounter = 0;
					isRepeatMax = true;
				}
			}
		}
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] += levelUp;
		}
		return resultArray;
	}

	public static void main(String[] args) {
		int[] A = { 3, 4, 4, 6, 1, 4, 4 }; // test array
		int N = 5;

		MaxCounters maxCounters = new MaxCounters();
		System.out.println(Arrays.toString(maxCounters.solution(N, A)));
	}
}
