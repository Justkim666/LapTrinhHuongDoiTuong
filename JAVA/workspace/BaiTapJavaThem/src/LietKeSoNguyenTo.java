import java.util.Scanner;

public class LietKeSoNguyenTo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			LietKeSoNguyenTo.lietKeSoNguyenTo(n);
		}
	}
	public static void lietKeSoNguyenTo(int n) {
		for(int i = 1; i <= n; i++) {
			if(LietKeSoNguyenTo.isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
