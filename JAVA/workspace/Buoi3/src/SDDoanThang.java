
public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35); 
		DoanThang AB = new DoanThang(A, B);
		AB.tinhTien(5, 3);
		DoanThang CD = new DoanThang();
		System.out.println("Nhap toa do doan thang CD");
		CD.nhap();
		CD.in();
	}
}
