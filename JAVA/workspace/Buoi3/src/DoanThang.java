
public class DoanThang {
	//Thuoc tinh
	private Diem d1, d2;
	
	//Phuong thuc
	
	//Ham xay dung
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem a, Diem b) {
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	//Nhap toa do cua doan thang
	public void nhap() {
		System.out.println("Nhap diem thu 1: "); d1.nhapDiem();
		System.out.println("Nhap diem thu 2: "); d2.nhapDiem();
	}
	
	//Hien thi
	public void in() {
		System.out.println("[" + d1 + "," + d2 + "]");
	}
	
	public String toString() {
		return "[" + d1 + "," + d2 + "]";
	}
	
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	
	public float doDai() {
		return d1.khoangCach(d2);
	}
}
