import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;
	
	public NhanVien() {
		super();
		congViec = new String();
	}
	
	public NhanVien(NhanVien a) {
		congViec = a.congViec;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap vao cong viec: "); congViec = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("Cong Viec: "+ congViec);
	}
	
	public String toString() {
		return super.toString() + "\n" + "Cong viec: "+ congViec;
	}

	@Override
	public int getTien() {
		return 123;
	}
}
