package pl.example.Codility.Lesson3.TimeComplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
		
		int isModulo = (Y - X) % D;
		
		int result = (Y - X) / D;
		if (isModulo != 0) {
			result += 1;
		}
		return result;
    }
	
	public static void main(String[] args) {

		int X = 10;  // frog position
		int Y = 85;  // frog target
		int D = 30;  // frog distance jump
		
		FrogJmp frogJmp = new FrogJmp();
		System.out.println(frogJmp.solution(X, Y, D));
	}
}