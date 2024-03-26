import java.util.Scanner;

public class Nguoi {
	private String hoTen, ngheNghiep, CMND;
	private int tuoi;
	
	public Nguoi() {
		hoTen = new String();
		ngheNghiep = new String();
		CMND = new String();
		tuoi = 1;
	}
	
	public Nguoi(Nguoi n) {
		hoTen = new String(n.hoTen);
		ngheNghiep = new String(n.ngheNghiep);
		CMND = new String(n.CMND);
		tuoi = n.tuoi;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Nhap ho va ten: "); hoTen = sc.nextLine();
		System.out.print("Nhap nghe nghiep: "); ngheNghiep = sc.nextLine();
		System.out.print("CMND: "); CMND = sc.nextLine();
		System.out.print("Nhap tuoi: "); tuoi = sc.nextInt();
	}
	
	public void in() {
		System.out.println("Ho Ten: "+ hoTen);
		System.out.println("Nghe nghiep: "+ ngheNghiep);
		System.out.println("CMND: "+ CMND);
		System.out.println("Tuoi: "+ tuoi);
	}
	
	public String toString() {
		return "Ho Ten: "+ hoTen +
				"\n" + "Nghe nghiep: "+ ngheNghiep +
				"\n" + "CMND: "+ CMND + 
				"\n" + "Tuoi: "+ tuoi + "\n";
	}
}
