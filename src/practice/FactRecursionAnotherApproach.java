package practice;

public class FactRecursionAnotherApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactRecursionAnotherApproach f = new FactRecursionAnotherApproach();
		int i = f.fact(5);

		System.out.println(i);

	}

	public int fact(int n) {

		if (n == 1) {

			return 1;
		}

		return n * fact(n - 1);

	}

}
