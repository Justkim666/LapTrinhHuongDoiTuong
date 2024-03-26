import java.util.Scanner;

public class Date {
	private int ngay;
	private int thang;
	private int nam;

	Scanner sc = new Scanner(System.in);
	// Ham xay dung mac nhien Date()
	public Date()
	{
		ngay = 1;
		thang = 1;
		nam = 1;
	}

	// Ham xay dung co 3 tham so Date(int d, int m, int y)
	public Date(int d, int m, int y) {
		ngay = d;
		thang = m;
		nam = y;
	}

	// Ham xay dung la 1 doi tuong
	public Date(Date d) {
		ngay = d.ngay;
		ngay = d.thang;
		ngay = d.nam;
	}

	// Dinh nghia ham toString
	public String toString() {
		return "(" + ngay + "/" + thang + nam + "/" + ")";
	}

	// Sao chep
	// 1. sao chep can
	public Object Clone() throws Exception {
		{
			return super.clone();
		}
	}

	// 2. sao chep sau
	public Date deepCoppy(Date d) {
		Date z = new Date();
		z.ngay = d.ngay;
		z.thang = d.thang;
		z.nam = d.nam;
		return z;
	}

	// Hiem thi thong tin ngay
	public void hienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	// Ham kiem tra hop le
	public boolean hopLe() {
		boolean check = false;
		int max[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (thang == 2) {
			// Kiem tra nam nhuan
			if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
				max[2] = 29;
			}
		}
		if (ngay > 0 && ngay <= max[thang] && thang > 0 && thang < 13 && nam > 0) {
			check = true;
		}
		return check;
	}

	// Ham nhap
	public void nhap() {
		do {
			System.out.print("Nhap vao ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap vao thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap vao nam: ");
			nam = sc.nextInt();
			if (!hopLe()) {
				System.out.println("Nhap sai! vui long nhap lai.");
			}
		} while (!hopLe());
	}

	// Ham cong ngay
	public Date cong() {
		Date a = new Date(ngay, thang, nam);
		a.ngay++;
		if (!a.hopLe()) {
			a.ngay = 1;
			a.thang++;
			if (!a.hopLe()) {
				a.thang = 1;
				a.nam++;
			}
		}
		return a;
	}

	// Tinh ngay hom sau
	public Date ngayHomSau() {
		Date day = new Date(ngay, thang, nam);
		return day.cong();
	}

	// Ham cong date voi n ngay
	public Date congNgay(int n) {
		int i;
		Date c = new Date(ngay, thang, nam);
		for (i = 1; i <= n; i++) {
			c = c.cong();
		}
		return c;
	}

}
