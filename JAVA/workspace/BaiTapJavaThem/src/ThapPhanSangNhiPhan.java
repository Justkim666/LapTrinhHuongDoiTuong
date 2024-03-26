import java.util.Scanner;

public class ThapPhanSangNhiPhan {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			ThapPhanSangNhiPhan.B(n);
		}
		
	}
	
	public static void B(int n) {
		int[] Binary = new int[20];
		int get, i = 0;
		while(n != 0) {
			get = n % 2;
			Binary [i] = get; i++;
			n = n/2;
		}
		System.out.println("Chuyen tu thap phan sang nhi phan");
		for(int j = 0; j <= i; j++) {
			System.out.print(Binary[j]);
		}
	}
}
