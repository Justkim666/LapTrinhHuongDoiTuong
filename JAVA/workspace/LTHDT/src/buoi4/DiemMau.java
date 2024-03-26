package buoi4;
import java.util.Scanner;

import buoi2.Diem;
public class DiemMau extends Diem{
	private String mau;
	
	public DiemMau() {
		super();
		mau = new String();
	}
	
	public DiemMau(int x1, int y1, String m1) {
		super(x1, y1);
		mau = new String(m1);
	}
	
	public DiemMau(DiemMau dm) {
		//java tu dong goi super((Diem)dm);
		mau = new String(dm.mau);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhapDiem();
		mau = sc.nextLine();
	}
	
	public void in() {
		super.hienThi();
		System.out.println("voi mau "+mau);
	}
	
	public void in(String s) {
		System.out.println(s);
		super.hienThi();
		System.out.println(", in mau "+ mau);
	}
	
	public String toString() {
		return super.toString()+" voi mau "+ mau;
	}
	
	public void ganMau(String m) {
		mau = new String(m);
	}
}
