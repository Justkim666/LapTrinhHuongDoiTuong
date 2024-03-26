
public class SDDiem {
	public static void main(String[] args) {
		System.out.println("Toa do diem A");
		Diem A = new Diem(3, 4);
		A.hienThi();
		System.out.println("Toa do diem B");
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		System.out.println("Toa do diem C (doi xung voi B qua goc toa do O)");
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		C.hienThi();
		System.out.println("Khoang cach tu diem B den tam O");
		System.out.println(B.khoangCach());
		System.out.println("Khoang cach tu diem A den diem B");
		System.out.println(B.khoangCach(A));
	}
}
