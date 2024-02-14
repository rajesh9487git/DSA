package practice;

public class FactRecursion {

	int res = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactRecursion f = new FactRecursion();
		
		int i = f.fact(5);
		System.out.println(i);

	}

	public  int fact(int n) {

		if (n >= 1) {
			res = res * n;
			fact(n - 1);

		}

		return res;
	}

}
