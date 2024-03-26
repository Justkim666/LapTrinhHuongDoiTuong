package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String maSo, tieuDe, hoTen;
	private Date ngayLap;
	private KhachHang khachHang;
	private ChiTiet c[];
	
	public HoaDon() {
		maSo = new String();
		tieuDe = new String();
		hoTen = new String();
		ngayLap = new Date();
		khachHang = new KhachHang();
		c = new ChiTiet[20];
	}
	
	public HoaDon(HoaDon hd) {
		maSo = new String(hd.maSo);
		tieuDe = new String(hd.tieuDe);
		hoTen = new String(hd.hoTen);
		ngayLap = new Date(hd.ngayLap);
		khachHang = new KhachHang(hd.khachHang);
		int i = 0;
		for(ChiTiet t: hd.c) { // lap tung chi tiet gap null => break
			if(t == null) break;
			else {
				c[i] = new ChiTiet();
				i++;
			}
		}
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so hoa don: "); maSo = sc.nextLine();
		System.out.print("Nhap vao tieu de: "); tieuDe = sc.nextLine();
		System.out.print("Nhap vao nguoi nhap hoa don: "); hoTen = sc.nextLine();
		System.out.println("Nhap vao ngay lap hoa don"); ngayLap.nhap();
		System.out.print("Ban nhap thong tin cho KhachHang(1), KhachHangVIP(2): ");
		int z = sc.nextInt();
		if(z == 1) khachHang = new KhachHang(); 
		else khachHang = new KhachHangVIP();
		//lien ket dong
		khachHang.nhap();
		System.out.print("Nhap so chi tiet hang hoa: "); int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			System.out.println("Nhap chi tiet thu "+ (i+1));
			c[i] = new ChiTiet();
			c[i].nhap();
		}
	}
	
	public void in() {
		System.out.println("Ma so hoa don: "+ maSo);
		System.out.println("Tieu de: "+ tieuDe);
		System.out.println("Nguoi tao hoa don: "+ hoTen);
		System.out.println("Ngay lap hoa don: "+ ngayLap);
		System.out.println("Thong tin khach hang: "+ khachHang);
		System.out.println("Chi tiet don hang");
		for(ChiTiet t: c) {
			if(t == null) break;
			else {
				System.out.println(t);
			}
		}
	}
	
	public long tong() {
		long s = 0;
		for(ChiTiet t :c) {
			if(t == null) break;
			else {
				s += t.thanhTien();
			}
		}
		//do phan nhap thong tin co chua lien ket dong nen co the phan biet duoc VIP
		//Khach hang bth thi la 0
		//Khach hang VIP co uu dai
		s = s - s * (long)khachHang.layTiLeMienGiam();
		return s;
	}
}
