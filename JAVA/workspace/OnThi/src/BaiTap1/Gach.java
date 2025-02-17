package BaiTap1;
import java.util.Scanner;

public class Gach {
	private String maSo, mau;
	private int sLuong, cdai, cngang;
	private float gia;
	
	public Gach() {
		maSo = new String();
		mau = new String();
		sLuong = cdai = cngang = 0;
		gia = 0.0f;
	}
	
	public Gach(Gach g) {
		maSo = new String(g.maSo);
		mau = new String(g.mau);
		sLuong = g.sLuong;
		cdai = g.cdai;
		cngang = g.cngang;
		gia = g.gia;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma so vien gach: "); maSo = sc.nextLine();
		System.out.print("Nhap vao mau vien gach: "); mau = sc.nextLine();
		System.out.print("Nhap vao so luong vien trong 1 hop: "); sLuong = sc.nextInt();
		System.out.print("Nhap vao chieu dai vien gach: "); cdai = sc.nextInt();
		System.out.print("Nhap vao chieu ngang vien gach: "); cngang = sc.nextInt();
		System.out.print("Nhap vao gia ban 1 hop: "); gia = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("Ma so vien gach: "+ maSo);
		System.out.println("Mau vien gach: "+ mau);
		System.out.println("So luong trong 1 hop: "+ sLuong);
		System.out.println("Chieu dai vien gach: "+ cdai);
		System.out.println("Chieu ngang vien ngach: "+ cngang);
		System.out.println("Gia ban 1 hop: "+ gia);
	}
	
	public String toString() {
		return "Ma so vien gach: "+ maSo + "\n"
				+ "Mau vien gach: "+ mau + "\n"
				+ "So luong trong 1 hop: "+ sLuong + "\n"
				+ "Chieu dai vien gach: "+ cdai + "\n"
				+ "Chieu ngang vien ngach: "+ cngang + "\n"
				+ "Gia ban 1 hop: "+ gia;
	}
	
	public float giaBanle() {
		return (float) gia*20/100;
	}
	
	public int soLuongHop(int D, int N) {
		int svDai = D / cdai;
		if(D % cdai != 0) svDai++;
		int svNgang = N / cngang;
		if(N % cngang != 0) svNgang++;
		int tongSoVien = svDai * svNgang;
		int soLuongHop = tongSoVien / sLuong;
		if(tongSoVien % sLuong != 0) soLuongHop++;
		return soLuongHop;
	}
	
	public static String chiPhiThapNhat(Gach dsGach[]) {
		float chiPhiThap = dsGach[0].gia / (float)(dsGach[0].cdai * dsGach[0].cngang);
		int viTri = 0;
		for(int i = 1; i < dsGach.length; i++) {
			float giaTien = dsGach[i].gia / (float)(dsGach[i].cdai * dsGach[i].cngang);
			if(giaTien < chiPhiThap) {
				chiPhiThap = giaTien;
				viTri = i;
			}
		}
		return dsGach[viTri].maSo;
	}
	
	public float chiPhiLotNen(int D, int N) {
		int soLuongHop = soLuongHop(D, N);
		return (float) gia * soLuongHop;
	}
	
	public String getMaSo() {
		return maSo;
	}
}
