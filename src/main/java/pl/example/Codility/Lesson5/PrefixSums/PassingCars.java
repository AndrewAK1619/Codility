package pl.example.Codility.Lesson5.PrefixSums;

public class PassingCars {
	public int solution(int[] A) {

		int numberOfCarsDrivingToWest = 0;
		int numberOfPairs = 0;

		for (int i = A.length - 1; i >= 0; i--) {
			if (A[i] == 1) {
				numberOfCarsDrivingToWest += 1;
			} else if (numberOfPairs > 1_000_000_000) {
				return -1;
			} else {
				numberOfPairs += numberOfCarsDrivingToWest;
			}
		}
		return numberOfPairs;
	}

	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 1, 1 }; // test array

		PassingCars passingCars = new PassingCars();
		System.out.println(passingCars.solution(A));
	}
}
