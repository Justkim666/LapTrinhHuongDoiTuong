import java.util.Scanner;

public class CongNhan extends CanBo{
	private int bac;

	public CongNhan() {
		super();
		bac = 1;
	}
	
	public CongNhan(CongNhan a) {
		bac = a.bac;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap vao bac cua cong nhan: "); bac = sc.nextInt();
	}
	
	public void in() {
		super.in();
		System.out.println("Bac: "+ bac);
	}
	
	public String toString() {
		return super.toString() + "/n" + "Bac: " + bac;
	}

	@Override
	public int getTien() {
		// TODO Auto-generated method stub
		return 456;
	}
}
