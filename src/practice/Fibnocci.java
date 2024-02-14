package practice;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=fib(7);
		System.out.println(i);

	}
	
	public static int fib(int n) {
		
		if (n==0||n==1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}

}
