package buoi4;

import java.util.Scanner;

public abstract class ConVat {
	private String giong, mau;
	private float canNang;
	
	public ConVat() {
		giong = new String();
		mau = new String();
		canNang = 1.f;
	}
	
	public ConVat(ConVat a) {
		giong = new String(a.giong);
		mau = new String(a.mau);
		canNang = a.canNang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap giong: "); giong = sc.nextLine();
		System.out.print("Nhap mau: "); mau = sc.nextLine();
		System.out.print("Nhap can nang: "); canNang = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("giong: "+giong);
		System.out.println("mau: "+mau);
		System.out.println("can nang: "+canNang);
	}
	
	public String toString() {
		return "giong: "+giong+" mau: "+mau+" can nang: "+ canNang;
	}
	public abstract void keu();
}
