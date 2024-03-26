package ThuVien;

import java.util.Scanner;

public abstract class TaiLieu {
	private String maTaiLieu;
	private String tenNSX;
	private int soBanPhatHanh;
	
	public TaiLieu() {
		maTaiLieu = new String();
		tenNSX = new String();
		soBanPhatHanh = 0;
	}
	
	public TaiLieu(TaiLieu tl) {
		maTaiLieu = new String(tl.maTaiLieu);
		tenNSX = new String(tl.tenNSX);
		soBanPhatHanh = tl.soBanPhatHanh;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma tai lieu: "); maTaiLieu = sc.nextLine();
		System.out.print("Nhap vao ten NSX: "); tenNSX = sc.nextLine();
		System.out.print("Nhap so ban phat hanh: "); soBanPhatHanh = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Ma tai lieu: "+ maTaiLieu);
		System.out.println("Ten NSX: "+ tenNSX);
		System.out.println("So ban phat hanh: "+ soBanPhatHanh);
	}
	
	public String toString() {
		return "Ma tai lieu: "+ maTaiLieu +
				"\n"+"Ten NSX: "+ tenNSX +
				"\n"+"So ban phat hanh: "+ soBanPhatHanh;
	}
	
	public String getMaTaiLieu() {
		return maTaiLieu;
	}
}
