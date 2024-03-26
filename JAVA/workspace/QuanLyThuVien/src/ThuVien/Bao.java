package ThuVien;

import java.util.Scanner;

public class Bao extends TaiLieu{
	private Date ngayPhatHanh;
	
	public Bao() {
		super();
		ngayPhatHanh = new Date();
	}
	
	public Bao(Bao b) {
		ngayPhatHanh = new Date(b.ngayPhatHanh);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap vao ngay phat hanh");
		ngayPhatHanh.nhap();
	}
	
	public void in() {
		super.in();
		System.out.println("Ngay phat hanh: "); ngayPhatHanh.in();
	}
	
	public String toString() {
		return super.toString() + ngayPhatHanh;
	}
}
