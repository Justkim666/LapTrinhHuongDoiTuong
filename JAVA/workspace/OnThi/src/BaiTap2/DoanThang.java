package BaiTap2;

import java.util.Scanner;

public class DoanThang {
	private Diem d1, d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(DoanThang t) {
		d1 = new Diem(t.d1);
		d2 = new Diem(t.d2);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao diem d1"); d1.nhapDiem();
		System.out.println("Nhap vao diem d2"); d2.nhapDiem();
	}
	
	public void in() {
		System.out.println("Diem d1 la: "+ d1);
		System.out.println("Diem d2 la: "+ d2);
	}
	
	public String toString() {
		return "Diem d1 la: "+ d1 + "Diem d2 la: "+ d2;
	}
	
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
}