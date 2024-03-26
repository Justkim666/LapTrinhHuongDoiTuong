import java.util.Scanner;

public class UocChungLonNhat {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a, b;
			System.out.print("Nhap a = ");
			a = sc.nextInt();
			System.out.print("Nhap b = ");
			b = sc.nextInt();
			int UCLN = UocChungLonNhat.GCD_Euclid(a, b);
			int BCNN = (a * b) / (UocChungLonNhat.GCD_Euclid(a, b));
			System.out.println("UCLN = " + UCLN);
			System.out.println("BCNN = " + BCNN);
		}

	}

	// Sử dụng vòng lặp
	public static int GCD_loop(int a, int b) {
		if (b > a) {
			int temp;
			temp = a;
			a = b;
			b = temp; // a sẽ được gán bằng số lớn hơn
		}
		int i = b;
		while (i >= 1) {
			if (a % i == 0 && b % i == 0) {
				break;
			}
			i--;
		}
		return i;
	}

	public static int GCD_loop_recursion(int a, int b, int i) {
		if (a % i == 0 && b % i == 0)
			return i;
		else
			return GCD_loop_recursion(a, b, i - 1);
	}

	// Sử dụng phép trừ
	public static int GCD_Subtraction(int a, int b) {
		if (a == b)
			return a;
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else
				b = b - a;
		}
		return a; // return b
	}

	public static int GCD_Subtraction_recursion(int a, int b) {
		if (a == b)
			return a;
		if (a > b)
			return GCD_Subtraction_recursion(a - b, b);
		else
			return GCD_Subtraction_recursion(a, b - a);
	}

	// Sử dụng thuật toán Euclid
	public static int GCD_Euclid(int a, int b) {
		int r = a % b; // a = b*x + r
		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

	public static int GCD_Euclid_recursion(int a, int b) {
		if (b == 0)
			return a;
		return GCD_Euclid_recursion(b, a % b);
	}
}
