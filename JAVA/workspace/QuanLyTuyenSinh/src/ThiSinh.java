import java.util.Scanner;

public abstract class ThiSinh {
	private String soBaoDanh, hoTen, diaChi;
	private float mucUuTien;

	public ThiSinh() {
		soBaoDanh = new String();
		hoTen = new String();
		diaChi = new String();
		mucUuTien = 0;
	}
	
	public ThiSinh(ThiSinh a) {
		soBaoDanh = new String(a.soBaoDanh);
		hoTen = new String(a.hoTen);
		diaChi = new String(a.diaChi);
		mucUuTien = a.mucUuTien;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so bao danh: "); soBaoDanh = sc.nextLine();
		System.out.print("Nhap vao ho ten: "); hoTen = sc.nextLine();
		System.out.print("Nhap vao dia chi: "); diaChi = sc.nextLine();
		System.out.print("Nhap vao muc uu tien: "); mucUuTien = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("So bao danh: "+ soBaoDanh);
		System.out.println("Ho va ten: "+ hoTen);
		System.out.println("Di chi: "+ diaChi);
		System.out.println("Muc uu tien: "+ mucUuTien);
	}
	
	public String toString() {
		return "So bao danh: "+ soBaoDanh +
				"\n" + "Ho va ten: "+ hoTen +
				"\n" + "Di chi: "+ diaChi +
				"\n" + "Muc uu tien: "+ mucUuTien;
	}
	
	public String getSoBaoDanh() {
		return soBaoDanh;
	}
}
