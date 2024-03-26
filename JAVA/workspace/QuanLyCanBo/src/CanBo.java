import java.util.Scanner;

public abstract class CanBo {
	private String hoTen;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;
	
	public CanBo() {
		hoTen = new String();
		tuoi = 1;
		gioiTinh = new String();
		diaChi = new String();
	}
	
	public CanBo(CanBo a) {
		hoTen = new String(a.hoTen);
		tuoi = a.tuoi;
		gioiTinh = new String(a.gioiTinh);
		diaChi = new String(a.diaChi);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ho va ten: "); hoTen = sc.nextLine();
		System.out.print("Nhap vao tuoi: "); tuoi = sc.nextInt(); sc.nextLine();
		System.out.print("Nhap vao gioi tinh: "); gioiTinh = sc.nextLine();
		System.out.print("Nhap vao dia chi: "); diaChi = sc.nextLine();
	}
	
	public void in() {
		System.out.println("Ho va ten: "+ hoTen);
		System.out.println("Tuoi: "+ tuoi);
		System.out.println("Gioi tinh: "+ gioiTinh);
		System.out.println("Dia chi: "+ diaChi);
	}
	
	public String toString() {
		return "Ho va ten: "+ hoTen +
			   "\n" + "Tuoi: "+ tuoi +
			   "\n" + "Gioi tinh: "+ gioiTinh +
			   "\n" + "Dia chi: "+ diaChi;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public abstract int getTien();
}
