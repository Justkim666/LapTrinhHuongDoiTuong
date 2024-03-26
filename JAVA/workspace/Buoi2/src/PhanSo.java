import java.util.Scanner;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	//Ham xay dung mac nhien PhanSo()
	public PhanSo() {
		tuSo = 1;
		mauSo = 1;
	}
	
	//Ham xay dung gom 2 doi so PhanSo(int x, int y)
	public PhanSo(int x, int y) {
		tuSo = x;
		mauSo = y;
	}
	
	//Ham xay dung la 1 doi tuong
	public PhanSo(PhanSo a) {
		tuSo = a.tuSo;
		mauSo = a.mauSo;
	}
	
	//Ham nhap phan so
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap tuSo = "); tuSo = sc.nextInt();
			System.out.print("Nhap mauSo = "); mauSo = sc.nextInt();
			if(mauSo == 0) {
				System.out.println("Nhap sai, vui long nhap lai!");
			}
		}while(mauSo == 0);
	}
	
	//Ham hien thi
	public void hienThi() {
		if(tuSo == 0) {
			System.out.println(0);
		}else if(mauSo == 1) {
			System.out.println(tuSo);
		}else {
			System.out.println(tuSo + "/" + mauSo);
		}
	}
	
	//Ham toString
	public String toString() {
		if(tuSo == 0) {
			return "0";
		}else if(mauSo == 1) {
			return ""+tuSo;
		}else {
			return tuSo + "/" + mauSo;
		}
	}
	
	//Tim UCLN
	public int UCLN(int a, int b) {
		if(b == 0) {
			return a;
		}
		return UCLN(b, a%b);
	}
	
	//Rut gon phan so
	public void rutGon() {
		int uoc = UCLN(tuSo, mauSo);
		tuSo /= uoc;
		mauSo /= uoc;
	}
	

	//Ham nghich dao (Phan so thay doi gia tri)
	public void nghichDao() {
		int temp = tuSo;
		tuSo = mauSo;
		mauSo = temp;
	}
	
	//Ham nghich dao(Phan so khong thay doi gia tri)
	public PhanSo giaTriNghichDao() {
		PhanSo a = new PhanSo(mauSo, tuSo);
		a.rutGon();
		return a;
	}
	
	//Ham in gia tri thuc cua PhanSo
	public float giaTriThuc() {
		return (float)tuSo/mauSo;
	}
	
	//Ham so sanh lon hon voi phan so a (khong lam thay doi gia tri cua doi tuong)
	public boolean lonHon(PhanSo a) {
			PhanSo b1 = new PhanSo(tuSo, mauSo);
			b1.rutGon();
			PhanSo b2 = new PhanSo(a.tuSo, a.mauSo);
			b2.rutGon();
			b1.tuSo *= b2.mauSo;
			b2.tuSo *= b1.mauSo;
			if(b1.tuSo > b2.tuSo) {
				return true;
			}
			else return false;
	}
	
	//Phep tinh phan so voi phan so
	//Phep cong
	PhanSo Cong(PhanSo a) {
		PhanSo ketQua = new PhanSo();
		PhanSo b1 = new PhanSo(tuSo, mauSo);
		PhanSo b2 = new PhanSo(a.tuSo, a.mauSo);
		b1.tuSo *= b2.mauSo;
		b2.tuSo *= b1.mauSo;
		ketQua.tuSo = b1.tuSo + b2.tuSo;
		ketQua.mauSo = b1.mauSo * b2.mauSo;
		ketQua.rutGon();
		return ketQua;
	}
	
	//Phep tru
	PhanSo Tru(PhanSo a) {
		PhanSo ketQua = new PhanSo();
		PhanSo b1 = new PhanSo(tuSo, mauSo);
		PhanSo b2 = new PhanSo(a.tuSo, a.mauSo);
		b1.tuSo *= b2.mauSo;
		b2.tuSo *= b1.mauSo;
		ketQua.tuSo = b1.tuSo - b2.tuSo;
		ketQua.mauSo = b1.mauSo * b2.mauSo;
		ketQua.rutGon();
		return ketQua;
	}
	
	//Phep nhan
	PhanSo Nhan(PhanSo a) {
		PhanSo ketQua = new PhanSo();
		PhanSo b1 = new PhanSo(tuSo, mauSo);
		PhanSo b2 = new PhanSo(a.tuSo, a.mauSo);
		ketQua.tuSo = b1.tuSo * b2.tuSo;
		ketQua.mauSo = b1.mauSo * b2.mauSo;
		ketQua.rutGon();
		return ketQua;
	}
	
	//Phep chia
	PhanSo Chia(PhanSo a) {
		PhanSo ketQua = new PhanSo();
		PhanSo b1 = new PhanSo(tuSo, mauSo);
		PhanSo b2 = new PhanSo(a.tuSo, a.mauSo);
		ketQua.tuSo = b1.tuSo * b2.mauSo;
		ketQua.mauSo = b1.mauSo * b2.tuSo;
		ketQua.rutGon();
		return ketQua;
	}
	
	//Phep tinh phan so voi so
	//Phep cong
	PhanSo Cong(int a) {
		PhanSo ketQua = new PhanSo();
		PhanSo b1 = new PhanSo(tuSo, mauSo);
		PhanSo b2 = new PhanSo(a, 1);
		b1.tuSo *= b2.mauSo;
		b2.tuSo *= b1.mauSo;
		ketQua.tuSo = b1.tuSo + b2.tuSo;
		ketQua.mauSo = b1.mauSo * b2.mauSo;
		ketQua.rutGon();
		return ketQua;
	}
	
	//Phep tru
	PhanSo Tru(int a) {
		PhanSo ketQua = new PhanSo();
		PhanSo b1 = new PhanSo(tuSo, mauSo);
		PhanSo b2 = new PhanSo(a, 1);
		b1.tuSo *= b2.mauSo;
		b2.tuSo *= b1.mauSo;
		ketQua.tuSo = b1.tuSo - b2.tuSo;
		ketQua.mauSo = b1.mauSo * b2.mauSo;
		ketQua.rutGon();
		return ketQua;
	}
	
	//Phep nhan
	PhanSo Nhan(int a) {
		PhanSo ketQua = new PhanSo();
		PhanSo b1 = new PhanSo(tuSo, mauSo);
		PhanSo b2 = new PhanSo(a, 1);
		ketQua.tuSo = b1.tuSo * b2.tuSo;
		ketQua.mauSo = b1.mauSo * b2.mauSo;
		ketQua.rutGon();
		return ketQua;
	}
	
	//Phep chia
	PhanSo Chia(int a) {
		PhanSo ketQua = new PhanSo();
		PhanSo b1 = new PhanSo(tuSo, mauSo);
		PhanSo b2 = new PhanSo(a, 1);
		ketQua.tuSo = b1.tuSo * b2.mauSo;
		ketQua.mauSo = b1.mauSo * b2.tuSo;
		ketQua.rutGon();
		return ketQua;
	}
	
	//Sap xep danh sach theo thu tu tang dan
	public static void sapXepDSPhanSo(PhanSo dsPhanSo[]) {
		int i, j;
		for(i = 0; i < dsPhanSo.length-1; i++) {
			for(j = i+1; j < dsPhanSo.length; j++) {
				if(dsPhanSo[i].lonHon(dsPhanSo[j])) {
					PhanSo temp = dsPhanSo[i];
					dsPhanSo[i] = dsPhanSo[j];
					dsPhanSo[j] = temp;
				}
			}
		}
	}
	
}
