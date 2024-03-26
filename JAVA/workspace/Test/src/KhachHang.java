import java.util.Scanner;

public class KhachHang {
	private String maKhachHang, hoTen;
	private int soLuongMua;
	private float donGia;
	
	
	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getSoLuongMua() {
		return soLuongMua;
	}

	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public KhachHang() {
		maKhachHang = new String();
		hoTen = new String();
		soLuongMua = 0;
		donGia = 0.0f;
	}
	
	public KhachHang(KhachHang h) {
		maKhachHang = new String(h.maKhachHang);
		hoTen = new String(h.hoTen);
		soLuongMua = h.soLuongMua;
		donGia = h.donGia;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma khach hang: "); maKhachHang = sc.nextLine();
		System.out.print("Nhap ho ten khach hang: "); hoTen = sc.nextLine();
		System.out.print("Nhap so luong mua: "); soLuongMua = sc.nextInt();
		System.out.print("Nhap don gia: "); donGia = sc.nextFloat();
	}
	
	public void in() {
		System.out.print("Nhap ma khach hang: "+ maKhachHang);
		System.out.print("Nhap ho ten khach hang: "+ hoTen);
		System.out.print("Nhap so luong mua: "+ soLuongMua);
		System.out.print("Nhap don gia: "+ donGia);
	}
	
	public String toString() {
		return "Ma khach hang: "+ maKhachHang +"\n"+
				"Ho ten khach hang: "+ hoTen +"\n" +
				"So luong mua: "+ soLuongMua +"\n" +
				"Don gia: "+ donGia;
	}
	
	public long tongTien() {
		return (long) (soLuongMua * donGia);
	}
}
