package pl.example.Codility.Lesson3.TimeComplexity;

public class TapeEquilibrium {
	public int solution(int[] A) {

		int valueOfFirstPart = 0;
		int valueOfSecondPart = 0;
		int result = 0;

		boolean firstCheck = true;

		for (int i = 0; i < A.length; i++) {
			valueOfSecondPart += A[i];
		}

		for (int i = 0; i < A.length - 1; i++) {
			valueOfFirstPart += A[i];
			valueOfSecondPart -= A[i];

			if (firstCheck) {
				result = Math.abs(valueOfFirstPart - valueOfSecondPart);
				firstCheck = false;
			}

			if (result > Math.abs(valueOfFirstPart - valueOfSecondPart)) {
				result = Math.abs(valueOfFirstPart - valueOfSecondPart);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4, 3 }; // test array

		TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
		System.out.println(tapeEquilibrium.solution(A));
	}
}
