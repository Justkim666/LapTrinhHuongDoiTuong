package buoi4;

public class SDDiemMau {

	public static void main(String[] args) {
		System.out.print("Toa do diem A");
		DiemMau a = new DiemMau(5, 10, "trang");
		System.out.println(a);
		DiemMau b = new DiemMau();
		b.nhap();
		System.out.print("Toa do diem B");
		System.out.println(b);
		b.ganMau("vang");
		System.out.print("Toa do diem B sau khi gan mau ");
		System.out.println(b);
	}
}
