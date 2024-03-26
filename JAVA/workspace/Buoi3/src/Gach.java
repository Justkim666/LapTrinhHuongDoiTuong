import java.util.Scanner;

public class Gach {
	//Thuoc tinh
	private String maSo;
	private String mau;
	private int soLuongTrong1Hop;
	private int chieuDai;
	private int chieuNgang;
	private long gia1Hop;
	
	//Phuong thuc
	
	//Cac ham xay dung
	
	public Gach() {
		maSo = "0";
		mau = "0";
		soLuongTrong1Hop = 0;
		chieuDai = 0;
		chieuNgang = 0;
		gia1Hop = 0;
	}
	
	public Gach(String maSo, String mau, int soLuongTrong1Hop, int chieuDai, int chieuNgang, long gia1Hop) {
		this.maSo = maSo;
		this.mau = mau;
		this.soLuongTrong1Hop = soLuongTrong1Hop;
		this.chieuDai = chieuDai;
		this.chieuNgang = chieuNgang;
		this.gia1Hop = gia1Hop;
	}
	
	public Gach(Gach a) {
		maSo = a.maSo;
		mau = a.mau;
		soLuongTrong1Hop = a.soLuongTrong1Hop;
		chieuDai = a.chieuDai;
		chieuNgang = a.chieuNgang;
		gia1Hop = a.gia1Hop;
	}
	
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma vien gach: "); maSo = sc.nextLine();
		System.out.print("Nhap vao mau vien gach: "); mau = sc.nextLine();
		System.out.print("Nhap vao so luong vien gach trong 1 hop: "); soLuongTrong1Hop = sc.nextInt();
		System.out.print("Nhap vao chieu dai vien gach (cm): "); chieuDai = sc.nextInt();
		System.out.print("Nhap vao chieu ngang vien gach (cm): "); chieuNgang = sc.nextInt();
		System.out.print("Nhap vao gia cua 1 hop: "); gia1Hop = sc.nextLong();
		
	}
	
	//Ham get ma so gach
	public String getMaSo() {
		return maSo;
	}
	
	//Ham get gia 1 hop
	public float getGia1Hop() {
		return gia1Hop;
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
	
	//Ham sao chep
	
	//Sao chep can
	public Object Clone() throws Exception{
		return super.clone();
	}
	
	//Sao chep sau
	public Gach deepCoppy(Gach a) {
		Gach ketQua = new Gach(a);
		return ketQua;
	}
	
	//Ham tinh gia ban le 1 vien gach
	float giaBanLe() {
		float giaBan = (float)(gia1Hop * 0.2);
		return giaBan;
	}
	
	//Ham tinh so luong hop gach can co de lot nen vs dien tich D*N
	int soLuongHop(int D, int N) {
		//doi cm ve m
		float dt1VienGach = ((float)chieuDai/100)*((float)chieuNgang/100), dt1Hop = 0, dtNen = D*N, checkDT;
		int i, soLuongToiThieu = 1;
		for(i = 1; i <= soLuongTrong1Hop; i++) {
			dt1Hop += dt1VienGach;
		}
		checkDT = dt1Hop;
		while(checkDT < dtNen) {
			soLuongToiThieu++;
			checkDT += dt1Hop;
		}
		return soLuongToiThieu;
	}
	
	//Ham tinh tong dien tich loi ich
	public float tongChiPhiLoiIch() {
		float tongChiPhi, dienTich1VienGach, tongDienTich1Hop;
		dienTich1VienGach = chieuDai*chieuNgang;
		tongDienTich1Hop = dienTich1VienGach * soLuongTrong1Hop;
		tongChiPhi = (float) gia1Hop / tongDienTich1Hop;
		return tongChiPhi;
	}
	
	//Gach chi phi lot thap nhat
	public Gach chiPhiThapNhat(Gach dsGach[]) {
		float thapNhat; 
		Gach get1 = dsGach[0];
		thapNhat = get1.tongChiPhiLoiIch();
		int i, z = 0;
		for(i = 1; i < dsGach.length; i++) {
			if(dsGach[i].tongChiPhiLoiIch() < thapNhat) {
				thapNhat = dsGach[i].tongChiPhiLoiIch();
				z = i;
			}
		}
		return dsGach[z];
	}
}
