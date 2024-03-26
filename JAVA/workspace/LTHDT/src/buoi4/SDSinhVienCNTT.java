package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
		SinhVien s = new SinhVien();
		s.nhap();
		s.nhapDiem();
		s.in();
		s.layEmail();
		SinhVien ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so SV: ");
		int n = sc.nextInt();
		ds = new SinhVien[n];
		for(int i = 0; i < n; i++) {
			ds[i] = new SinhVien();
		}
		int c = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Ban nhap TT SVien(1), SVCNTT(2)");
			c = sc.nextInt();
			if(c == 1) ds[i] = new SinhVien();
			else ds[i] = new SinhVienCNTT();
			ds[i].nhap();
		}
		for(SinhVien S: ds) {
			if(S == null) break;
			System.out.println("TT SinhVien: "+ S);
		}
		System.out.print("Nhap vao dia chi email can tim: ");
		sc.nextLine();
		String email = sc.nextLine();
		for(SinhVien S: ds) {
			System.out.println(S.layEmail());
			if(S.layEmail().equals(email)) {
				System.out.println("Diem trung binh: "+ S.diemTB());
			}
		}
	}
}
