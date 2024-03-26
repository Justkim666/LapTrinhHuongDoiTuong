import java.util.Scanner;

public class Diem {
	private int x;
	private int y;

	Scanner sc = new Scanner(System.in);
	// Ham xay dung mac nhien Diem()
	public Diem() {
		x = 0;
		y = 0;
	}

	// Ham xay dung co 2 tham so Diem(int a, int b)
	public Diem(int a, int b) {
		x = a;
		y = b;
	}

	// Ham xay dung la 1 doi tuong
	public Diem(Diem a) {
		x = a.x;
		y = a.y;
	}

	// Ham toString
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	// Sao chep
	// 1.sao chep can
	public Object Clone() throws Exception {
		return super.clone();
	}

	// 2. sao chep sau
	public Diem deepCoppy(Diem a) {
		Diem newDiem = new Diem();
		newDiem.x = a.x;
		newDiem.y = a.y;
		return newDiem;
	}

	// Nhap toa do tu ban phim
	public void nhapDiem() {
			System.out.print("Nhap toa do x = ");
			x = sc.nextInt();
			System.out.print("Nhap toa do y = ");
			y = sc.nextInt();
	}
	//Hien thi toa do
	public void hienThi() {
		System.out.println("(" + x + ", " + y + ")");
	}

	// Doi diem di mot do doi
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}

	// Lay gia tri hoanh do cua diem
	public int giaTriX() {
		return x;
	}

	// Lay gia tri tung do cua diem
	public int giaTriY() {
		return y;
	}

	// Tinh khoang cach tu 1 diem den goc toa do
	public float khoangCach() {
		return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	// Tinh khoang cach tu diem A den diem B
	public float khoangCach(Diem d) {
		return (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
	}
}
