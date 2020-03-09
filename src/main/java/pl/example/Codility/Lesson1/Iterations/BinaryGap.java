package pl.example.Codility.Lesson1.Iterations;

public class BinaryGap {
	public int solution(int N) {

		int binaryGap = 0;

		if (N == 0) {
			return 0;
		}

		while (N % 2 == 0) {
			N /= 2;
		}

		for (int j = 0; N > 0; N /= 2) {
			if (N % 2 == 0) {
				j++;
			} else {
				if (j > binaryGap) {
					binaryGap = j;
				}
				j = 0;
			}
		}
		return binaryGap;
	}

	public static void main(String[] args) {

		int N = 1041; // number test
		BinaryGap binaryGap = new BinaryGap();

		System.out.println(binaryGap.solution(N));
	}
}
