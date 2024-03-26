package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private int soLuong;
	private long donGia;
	private HangHoa hangHoa; // Thuoc tinh quan he
	
	public ChiTiet() {
		soLuong = 0;
		donGia = 0;
		hangHoa = new HangHoa();
	}
	
	public ChiTiet(ChiTiet t) {
		soLuong = t.soLuong;
		donGia = t.donGia;
		hangHoa = new HangHoa(t.hangHoa);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so luong: "); soLuong = sc.nextInt();
		System.out.print("Nhap vao don gia: "); donGia = sc.nextLong();
		System.out.println("Nhap vao hang hoa"); hangHoa.nhap();
		sc.nextLine();
	}
	
	public void in() {
		System.out.println("So luong: "+ soLuong);
		System.out.println("Don Gia: "+ donGia);
		System.out.println("Hang hoa: "+ hangHoa); //co ham toString
	}
	
	public String toString() {
		return "So luong: "+ soLuong +"\n"
				+ "Don Gia: "+ donGia +"\n"
				+ "Hang hoa: "+ hangHoa;
	}
	
	public long thanhTien() {
		return donGia * soLuong;
	}
	
}
