package buoi2;
import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(3, 7), b = new PhanSo(4, 9);
		System.out.println("a = "+ a +", "+ "b = "+b);
		System.out.println("Nhap Phan So x");
		PhanSo x = new PhanSo();
		x.nhap();
		x.rutGon();
		System.out.println("Nhap Phan So y");
		PhanSo y = new PhanSo();
		y.nhap();
		y.rutGon();
		System.out.println("Phan So a = "+ x +", " + "Phan So b = "+ y); 
		PhanSo nghichDaoX = x.giaTriNghichDao();
		System.out.println("Gia tri nghich dao x (Khong lam thay doi gia tri cua x) = "+ nghichDaoX);
		PhanSo tong = x.Cong(y);
		System.out.println("Phep cong 2 phan so x va y la: "+ tong);
		int n;
		System.out.print("Nhap vao danh sach so PhanSo n = "); n = sc.nextInt();
		PhanSo dsPhanSo[] = new PhanSo[n];
		int i;
		for(i = 0; i < dsPhanSo.length; i++) {
			dsPhanSo[i] = new PhanSo();
			System.out.println("Nhap PhanSo thu "+ (i+1) + ":");
			dsPhanSo[i].nhap();
			dsPhanSo[i].rutGon();
		}
		
		System.out.println("Danh sach vua nhap la");
		for(i = 0; i < dsPhanSo.length; i++) {
			System.out.print(dsPhanSo[i] + " ");
		}
		
		PhanSo tongDSPhanSo = new PhanSo(dsPhanSo[0]);
		for(i = 1; i < dsPhanSo.length; i++) {
			tongDSPhanSo = tongDSPhanSo.Cong(dsPhanSo[i]);
		}
		System.out.println("Tong danh sach PhanSo la: "+ tongDSPhanSo);
		
		PhanSo psLonNhat = new PhanSo(dsPhanSo[0]);
		for(i = 1; i < dsPhanSo.length; i++) {
			if(dsPhanSo[i].lonHon(psLonNhat)) {
				psLonNhat = dsPhanSo[i];
			}
		}
		System.out.println("Phan so lon nhat trong day phan so la: "+ psLonNhat);
		
		PhanSo.sapXepDSPhanSo(dsPhanSo);
		System.out.println("Danh sach PhanSo sau khi duoc sap xep");
		for(i = 0; i < dsPhanSo.length; i++) {
			System.out.print(dsPhanSo[i] + " ");
		}
		}
}
