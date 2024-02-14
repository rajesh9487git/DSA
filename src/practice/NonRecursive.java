package practice;

public class NonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 5, 1, 7, 9 };

		int l = a.length;

		int n = 0;

		for (int i = 0; i < l; i++) {

			n = n + a[i];
		}

		System.out.println(n);

	}

}
