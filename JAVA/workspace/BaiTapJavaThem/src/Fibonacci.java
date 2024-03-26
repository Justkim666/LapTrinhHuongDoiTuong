import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			System.out.println("So Fibonacci (vong lap) thu "+n+" la: "+ Fibonacci.Fibonacci_loop(n));
			System.out.println("So Fibonacci (de quy) thu "+n+" la: "+ Fibonacci.Fibonacci_recursion(n));
		}
	}

	public static long Fibonacci_loop(int n) {
		long a1 = 1, a2 = 1;
		if(n == 1 || n == 2) {
			return 1;
		}
		int i = 3;
		long a = 0;
		while(i <= n) {
			a = a1 + a2;
			a1 = a2;
			a2 = a;
			i++;
		}
		return a;
	}
	
	public static long Fibonacci_recursion(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		else return Fibonacci_recursion(n-1) + Fibonacci_recursion(n-2);
	}
}
