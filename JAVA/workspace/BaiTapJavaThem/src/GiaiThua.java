import java.util.Scanner;

public class GiaiThua {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			GiaiThua gT = new GiaiThua();
			System.out.println("Giai thua cua n la : "+ gT.giaiThua(n));
		}
	}
	public long giaiThua(int n) {
		if(n == 1) return 1;
		else return n * giaiThua(n-1);
	}
}
