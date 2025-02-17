package ThuVien;

import java.util.Scanner;

public class Sach extends TaiLieu{
	private String tenTG;
	private int soTrang;
	
	public Sach() {
		super();
		tenTG = new String();
		soTrang = 1;
	}
	
	public Sach(Sach a) {
		tenTG = new String(a.tenTG);
		soTrang = a.soTrang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap vao ten tac gia: "); tenTG = sc.nextLine();
		System.out.print("Nhap vao so trang: "); soTrang = sc.nextInt();
	}
	
	public void in() {
		super.in();
		System.out.println("Ten tac gia: "+ tenTG);
		System.out.println("So trang: "+ soTrang);
	}
	
	public String toString() {
		return super.toString() + "Ten tac gia: "+ tenTG +
				"\n" + "So trang: "+ soTrang;
	}
}
