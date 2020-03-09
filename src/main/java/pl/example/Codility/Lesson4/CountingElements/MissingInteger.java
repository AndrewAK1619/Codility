package pl.example.Codility.Lesson4.CountingElements;

public class MissingInteger {
	public int solution(int[] A) {

		boolean[] existingNumbers = new boolean[A.length];

		for (int element : A) {
			if (element > 0 && element <= A.length) {
				existingNumbers[element - 1] = true;
			}
		}

		for (int i = 0; i < existingNumbers.length; i++) {
			if (!existingNumbers[i]) {
				return i + 1;
			} else if (i == existingNumbers.length - 1) {
				return i + 2;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3 }; // test array

		MissingInteger missingInteger = new MissingInteger();
		System.out.println(missingInteger.solution(A));
	}
}
