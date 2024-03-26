package buoi4;
import java.util.Scanner;

import buoi3.SinhVien;
public class SinhVienCNTT extends SinhVien {
	private String taiKhoan, matKhau, eMail;
	
	public SinhVienCNTT() {
		super();
		taiKhoan = new String();
		matKhau = new String();
		eMail = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT a) {
		super();
		taiKhoan = new String(a.taiKhoan);
		matKhau = new String(a.matKhau);
		eMail = new String(a.eMail);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		super.nhapDiem();
		System.out.print("Nhap tai khoan: ");
			taiKhoan = sc.nextLine();
		System.out.print("Nhap mat khau: ");
			matKhau = sc.nextLine();
		System.out.print("Nhap email: ");
			eMail = sc.nextLine();
		}
		
		public void in() {
			super.in();
			System.out.println("Ten tai khoan "+ taiKhoan);
			System.out.println("email "+ eMail);
		}
		
		public String toString() {
		return super.toString() + "\nTen tai khoan "+ taiKhoan+"\nEmail "+ eMail;
	}
	
	public void doiMatKhau(String newpass) {
		matKhau = new String(newpass);
	}
	
	public String getEmail() {
		return eMail;
	}
}
