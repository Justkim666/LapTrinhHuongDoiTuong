package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang{
	private float tiLeMienGiam;
	private Date d;
	
	public KhachHangVIP() {
		tiLeMienGiam = 0.0f;
		d = new Date();
	}
	
	public KhachHangVIP(KhachHangVIP k) {
		tiLeMienGiam = k.tiLeMienGiam;
		d = new Date(k.d);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ti le mien giam: "); tiLeMienGiam = sc.nextFloat();
		System.out.print("Nhap ngay tro thanh VIP: "); d.nhap();
	}
	
	public void in() {
		super.in();
		System.out.print("Ti le mien giam: "+ tiLeMienGiam +"\n" + "Ngay tro thanh VIP: "+ d);
	}
	
	public float layTiLeMienGiam() {
		return tiLeMienGiam;
	}
	
	public String toString() {
		return "Ti le mien giam: "+ tiLeMienGiam +"\n" + "Ngay tro thanh VIP: "+ d;
	}
}
