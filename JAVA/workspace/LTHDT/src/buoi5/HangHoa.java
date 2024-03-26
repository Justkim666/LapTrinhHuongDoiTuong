package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String maSo, ten;
	private int NSX;
	
	public HangHoa() {
		maSo = new String();
		ten = new String();
		NSX = 2002;
	}
	
	public HangHoa(HangHoa s) {
		maSo = new String(s.maSo);
		ten = new String(s.ten);
		NSX = s.NSX;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma so hang hoa: "); maSo = sc.nextLine();
		System.out.print("Nhap vao ten hang hoa: "); ten = sc.nextLine();
		System.out.print("Nhap vao NSX: "); NSX = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Ma so hang hoa: "+ maSo);
		System.out.println("Ten hang hoa: "+ ten);
		System.out.println("NSX: "+ NSX);
	}
	
	public String toString() {
		return "Ma so hang hoa: "+ maSo + "\n" +
				"Ten hang hoa: "+ ten +"\n" +
				"NSX: "+ NSX;
	}
}
