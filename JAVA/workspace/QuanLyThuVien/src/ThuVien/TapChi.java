package ThuVien;

import java.util.Scanner;

public class TapChi extends TaiLieu{
	private int soPhatHanh;
	private int thangPhatHanh;
	
	public TapChi() {
		super();
		soPhatHanh = thangPhatHanh = 1;
	}
	
	public TapChi(TapChi tc) {
		soPhatHanh = tc.soPhatHanh;
		thangPhatHanh = tc.thangPhatHanh;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap vao so phat hanh: "); soPhatHanh = sc.nextInt();
		System.out.print("Nhap vao thang phat hanh: "); thangPhatHanh = sc.nextInt();
	}
	
	public void in() {
		super.in();
		System.out.println("So phat hanh: "+ soPhatHanh);
		System.out.println("Thang phat hanh: "+ thangPhatHanh);
	}
	
	public String toString() {
		return super.toString() + "So phat hanh: "+ soPhatHanh +
				"\n" + "Thang phat hanh: "+ thangPhatHanh;
	}
}
