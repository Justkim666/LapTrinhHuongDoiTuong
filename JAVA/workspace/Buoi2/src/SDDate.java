import java.util.Scanner;

public class SDDate {
	public static void main(String[] args) {
		int n = 0;
		System.out.print("Nhap n = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Sinh nhat cua toi");
		Date myBirdthDay = new Date(1, 7, 2002);
		myBirdthDay.hienThi();
		Date a = new Date();
		a.nhap();
		System.out.println("Ngay vua nhap");
		a.hienThi();
		System.out.println("Ngay hom sau la");
		Date b = a.ngayHomSau();
		b.hienThi();
		Date c = a.congNgay(n);
		c.congNgay(n);
		System.out.println("Sau " + n + " vua nhap thi ngay thang nam la");
		c.hienThi();
	}
}
