import java.util.Scanner;

public class SoNguyenTo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			System.out.print("Danh sach "+n+" so nguyen to dau tien : ");
			SoNguyenTo.lietKeNSoNguyenTo(n);
		}
	}
	public static void lietKeNSoNguyenTo(int n) {
		int i = 2, dem = 0;
		while(dem < n) {
			if(SoNguyenTo.isPrime(i)) {
				System.out.print(i+" ");
				dem++;
			}
			i++;
		}
	}
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
