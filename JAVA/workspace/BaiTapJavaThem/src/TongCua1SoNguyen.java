import java.util.Scanner;

public class TongCua1SoNguyen {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			System.out.print("Tong chu so cua "+n+" = "+ TongCua1SoNguyen.tongChuSoCuaMotSoNguyen(n));
		}
		
	}
	public static int tongChuSoCuaMotSoNguyen(int n) {
		int tong = 0, z;
		while(n != 0) {
			z = n % 10;
			tong += z;
			n /= 10;
		}
		return tong;
	}
}
