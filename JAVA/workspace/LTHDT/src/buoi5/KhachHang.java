package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String maSo, hoTen, diaChi;
	
	public KhachHang() {
		maSo = new String();
		hoTen = new String();
		diaChi = new String();
	}
	
	public KhachHang(KhachHang h) {
		maSo = new String(h.maSo);
		hoTen = new String(h.hoTen);
		diaChi = new String(h.diaChi);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma so khach hang: "); maSo = sc.nextLine();
		System.out.print("Nhap vao ho ten khach hang: "); hoTen = sc.nextLine();
		System.out.print("Nhap vao dia chi khach hang: "); diaChi = sc.nextLine();
	}
	
	public void in() {
		System.out.println("Ma so khach hang: "+ maSo);
		System.out.println("Ho va ten khach hang: "+ hoTen);
		System.out.println("Dia chi khach hang: "+ diaChi);
	}
	
	public String toString() {
		return "Ma so: "+ maSo +"\n" + "Ho va ten: "+ hoTen +"\n" + "Dia chi: "+ diaChi;
	}
	
	public float layTiLeMienGiam() {
		return 0.0f;
	}
}
