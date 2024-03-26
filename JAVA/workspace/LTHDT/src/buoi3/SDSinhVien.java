package buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien a = new SinhVien();
		System.out.println("Nhap thong tin cho sinh vien a");
		a.nhap();
		a.nhapDiem();
		System.out.println("Hien thi thong tin cua sinh vien a");
		System.out.println("\nThong tin sinh vien a vua nhap la");
		System.out.println(a);
		System.out.print("Diem trung binh cua sinh vien a: ");
		System.out.println(a.diemTB());
		System.out.println("Dang ky them 1 HP cho SV");
		a.dKyHP();
		a.nhapDiem();
		System.out.println("Danh sach sau khi dang ky them HP");
		System.out.println(a);
		String hp = new String();
		System.out.print("Nhap vao HP can xoa: ");
		hp = sc.nextLine();
		a.xoaHP(hp);
		System.out.println("Thong tin SinhVien sau khi xoa HP");
		System.out.println(a);
		int n=0;
		System.out.print("Nhap so luong sinh vien n = "); n = sc.nextInt();
		SinhVien dsSV[] = new SinhVien[n];
		for(int i = 0; i < n; i++) {
			dsSV[i] = new SinhVien();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1));
			dsSV[i].nhap();
			dsSV[i].nhapDiem();
		}
		System.out.println("\nCac sinh vien bi canh cao hoc vu");
		int count = 1;
		for(int i = 0; i < n; i++) {
			if(dsSV[i].diemTB() < 1.0) {
				System.out.println("Sinh Vien " + count + ": ");
				dsSV[i].getHoTen();
				count++;
			}
		}
	}
}