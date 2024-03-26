package buoi1;
import java.util.Scanner;

public class NhapDanhSachVaSapXep {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap vao so luong phan tu : ");
			n = sc.nextInt();
			int[] danhSach = new int[n];
			int element, x;
			System.out.println("Nhap danh sach cac so nguyen");
			for (int i = 0; i < n; i++) {
				System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
				element = sc.nextInt();
				danhSach[i] = element;
			}
			System.out.print("Danh sach vua nhap la: ");
			for (int k = 0; k < danhSach.length; k++) {
				System.out.print(danhSach[k] + " ");
			}
			System.out.println("");
			System.out.print("Nhap x = ");
			x = sc.nextInt();
			int count = 0;
			for (int j = 0; j < danhSach.length; j++) {
				if (danhSach[j] == x) {
					count++;
				}
			}
			System.out.println("Co " + count + " phan tu x = " + x);
			NhapDanhSachVaSapXep.sapXep(danhSach);
		}
	}

	public static void sapXep(int[] danhSach) {
		int i, j;
		for (i = 0; i < danhSach.length - 1; i++) {
			for (j = i + 1; j < danhSach.length; j++) {
				if (danhSach[i] > danhSach[j]) {
					int temp;
					temp = danhSach[i];
					danhSach[i] = danhSach[j];
					danhSach[j] = temp;
				}
			}
		}
		System.out.print("Danh sach sau khi duoc sap xep: ");
		for (int k = 0; k < danhSach.length; k++) {
			System.out.print(danhSach[k] + " ");
		}
	}
}
