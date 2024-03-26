import java.util.Scanner;

public class PhanTichThanhThuaSoNguyenTo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			System.out.print("Phan tich thanh thua so nguyen to : "+n+" = ");
			PhanTichThanhThuaSoNguyenTo.phanTichThuaSoNguyenTo(n);
		}
	}

	public static void phanTichThuaSoNguyenTo(int n) {
		for (int i = 2; i <= n; i++) {
			int dem = 0;
			while (n % i == 0) {
				dem++;
				n /= i;
			}
			if (dem > 0) {
				if (dem > 1)
					System.out.print(i + "^" + dem);
				else System.out.print(i);
				if (n > i)
					System.out.print(" * ");
			}
		}
	}
}
