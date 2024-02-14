package practice;

public class Recursive {

	static int[] a = { 3, 5, 55, 6, 7 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = sum(a.length - 1);
		System.out.println(b);

	}

	public static int sum(int n) {

		if (n == 0) {
			return a[n];
		}

		return a[n] + sum(n - 1);
		

	}

}
