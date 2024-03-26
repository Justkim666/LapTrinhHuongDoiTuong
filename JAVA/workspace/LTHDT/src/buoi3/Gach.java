package buoi3;
import java.util.Scanner;

public class Gach {
	private String maSo;
	private String mau;
	private int soLuongTrong1Hop;
	private int chieuDai, chieuNgang;
	private long gia1Hop;
	
	//Getter va Setter
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public int getSoLuongTrong1Hop() {
		return soLuongTrong1Hop;
	}

	public void setSoLuongTrong1Hop(int soLuongTrong1Hop) {
		this.soLuongTrong1Hop = soLuongTrong1Hop;
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuNgang() {
		return chieuNgang;
	}

	public void setChieuNgang(int chieuNgang) {
		this.chieuNgang = chieuNgang;
	}

	public long getGia1Hop() {
		return gia1Hop;
	}

	public void setGia1Hop(long gia1Hop) {
		this.gia1Hop = gia1Hop;
	}
	
	//Phuong thuc xay dung
	public Gach() {
		maSo = new String();
		mau = new String();
		soLuongTrong1Hop = chieuDai = chieuNgang = 0;
		gia1Hop = 0;
	}
	
	public Gach(String maSo, String mau, int soLuongTrong1Hop, int chieuDai, int chieuNgang, long gia1Hop) {
		this.maSo = new String(maSo);
		this.mau = new String(mau);
		this.soLuongTrong1Hop = soLuongTrong1Hop;
		this.chieuDai = chieuDai;
		this.chieuNgang = chieuNgang;
		this.gia1Hop = gia1Hop;
		
	}
	
	public Gach(Gach a) {
		maSo = new String(a.maSo);
		mau = new String(a.mau);
		soLuongTrong1Hop = a.soLuongTrong1Hop;
		chieuDai = a.chieuDai;
		chieuNgang = a.chieuNgang;
		gia1Hop = a.gia1Hop;
	}
	
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma so vien gach: "); maSo = sc.nextLine();
		System.out.print("Nhap vao mau vien gach: "); mau = sc.nextLine();
		System.out.print("Nhap vao so luong vien gach trong 1 hop: "); soLuongTrong1Hop = sc.nextInt();
		System.out.print("Nhap vao chieu dai vien gach (cm): "); chieuDai = sc.nextInt();
		System.out.print("Nhap vao chieu ngang vien gach (cm): "); chieuNgang = sc.nextInt();
		System.out.print("Nhap vao gia cua 1 hop: "); gia1Hop = sc.nextLong();
		
	}
	
	//Ham hien thi
	public void hienThi() {
		System.out.println("Ma vien gach: "+ maSo);
		System.out.println("Mau vien gach: "+ mau);
		System.out.println("So luong vien gach trong 1 hop: "+ soLuongTrong1Hop);
		System.out.println("Chieu dai vien gach (cm): "+ chieuDai);
		System.out.println("Chieu ngang vien gach (cm): "+ chieuNgang);
		System.out.println("Gia cua 1 hop: "+ gia1Hop);
	}
	
	//Ham toString
	public String toString() {
		return "Ma vien gach: "+ maSo +
				"\nMau vien gach: "+ mau +
				"\nSo luong vien gach trong 1 hop: "+ soLuongTrong1Hop +
				"\nChieu dai vien gach: "+ chieuDai +
				"\nChieu ngang vien gach: "+ chieuNgang +
				"\nGia cua 1 hop: "+ gia1Hop;
	}
	
	//Ham tinh gia ban le 1 vien gach
	public float giaBanLe() {
		float giaBan = (float)(gia1Hop * 0.2);
		return giaBan;
	}
	
	//Ham tinh so luong hop gach can co de lot nen vs dien tich D*N
	public int soLuongHop(int D, int N) {
		int svDai = D/chieuDai;
		if(D % chieuDai != 0) svDai++;
		int svNgang = N/chieuNgang;
		if(N % chieuNgang != 0) svNgang++;
		int tongSoVien = svDai * svNgang;
		int soHop = tongSoVien / soLuongTrong1Hop;
		if(tongSoVien % soLuongTrong1Hop != 0) soHop++;
		return soHop;
		
	}
}
