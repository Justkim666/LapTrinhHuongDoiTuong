package buoi1;
import java.util.Scanner;

public class SoNguyenToThanhNhiPhan {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a;
			System.out.print("Nhập vào số nguyên tố a = ");
			a = sc.nextInt();
			if(SoNguyenToThanhNhiPhan.soNguyenTo(a)) {
				int[] array = new int[20];
				int i = 0, tG;
				while(a > 0) {
					tG = a % 2;
					array[i] = tG;
					i++;
					a /= 2;
				}
				for(int j = i; j >= 0; j--) {
					System.out.print(array[j]+" ");
				}
			}
			else {
				System.out.println("Không phải là số nguyên tố!");
			}
		}
	}
	public static boolean soNguyenTo(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
