package pl.example.Codility.Lesson5.PrefixSums;

import java.util.Arrays;

public class GenomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) {

		int[] result = new int[P.length];

		for (int i = 0; i < P.length; i++) {
			result[i] = factory(S, P[i], Q[i]);
		}
		return result;
	}

	private int factory(String S, int i, int j) {
		if (S.substring(i, j + 1).contains("A")) {
			return 1;
		} else if (S.substring(i, j + 1).contains("C")) {
			return 2;
		} else if (S.substring(i, j + 1).contains("G")) {
			return 3;
		}
		return 4;
	}

	public static void main(String[] args) {
		String S = "CAGCCTA";
		int[] P = { 2, 5, 0 };
		int[] Q = { 4, 5, 6 };

		GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
		System.out.println(Arrays.toString(genomicRangeQuery.solution(S, P, Q)));
	}
}
