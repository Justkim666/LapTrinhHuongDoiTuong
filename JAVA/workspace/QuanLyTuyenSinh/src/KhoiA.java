import java.util.Scanner;

public class KhoiA extends ThiSinh{
	private String Toan, Ly, Hoa;
	
	public KhoiA() {
		super();
		Toan = new String();
		Ly = new String();
		Hoa = new String();
	}
	
	public KhoiA(KhoiA a) {
		Toan = new String(a.Toan);
		Ly = new String(a.Ly);
		Hoa = new String(a.Hoa);
	}
	
	public String getKhoiThi() {
		return "Khoi A";
	}
	
	public void in() {
		super.in();
		System.out.println("Khoi A");
	}
}