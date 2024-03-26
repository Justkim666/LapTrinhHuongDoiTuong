package buoi5;

import java.util.Scanner;

public class SDHoaDon {
	public static void main(String[] args) {
		HoaDon d = new HoaDon();
		d.nhap();
		System.out.println("Thong tin ve don hang");
		d.in();
		System.out.println("Tong so tien tren hoa don: "+ d.tong());
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Nhap so luong hoa don: "); n = sc.nextInt();
		HoaDon ds[] = new HoaDon[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap vao hoa don thu "+ (i+1));
			ds[i] = new HoaDon();
			ds[i].nhap();
		}
		for(HoaDon t: ds) {
			System.out.println("Hoa Don: "+ t +", tong tien: "+ t.tong());
		}
	}
}
