import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		SinhVien a = new SinhVien();
//		System.out.println("Nhap thong tin cua SinhVien"); a.nhapThongTinCoBan();
//		System.out.println("Dang ky them 1 HP"); a.dangKyHP();
//		System.out.println("Nhap diem cho tung hoc phan"); a.nhapDiemCacHP();
//		System.out.println("Hien Thi Thong Tin Sinh Vien" + a);
//		System.out.println("Danh Sach SinhVien");
		int n, i;
		System.out.print("Nhap so luong SinhVien n = "); n = sc.nextInt();
		SinhVien dsSinhVien[] = new SinhVien[n];
		for(i = 0; i < dsSinhVien.length; i++) {
			dsSinhVien[i] = new SinhVien();
			System.out.println("Nhap vao thong tin SinhVien thu "+ (i+1));
			System.out.println("Nhap vao thong tin co ban");
			dsSinhVien[i].nhapThongTinCoBan();
			System.out.println("Nhap Diem");
			dsSinhVien[i].nhapDiemCacHP();
		}
//		System.out.println("Sinhvien bi canh cao hoc vu");
//		String canhCaoHocVu[] = new String[dsSinhVien.length]; 
//		SinhVien.canhCaoHocVu(canhCaoHocVu, dsSinhVien);
//		for(i = 0; i < canhCaoHocVu.length; i++) {
//			System.out.println("Sinh vien thu "+ (i+1) + ":" + canhCaoHocVu[i]);
//		}
		
		String bestSV[] = new String[10];
		SinhVien.diemTBCaoNhat(bestSV, dsSinhVien);
		System.out.println("Sinh vien co diem trung binh cao nhat: "+ bestSV[0] +" Diem: "+ bestSV[1]);
		System.out.println();
		
		System.out.println("Danh sach Sinh Vien truoc khi sap xep");
		SinhVien.inDanhSachSV(dsSinhVien);
		
		System.out.println("Danh sach Sinh Vien sau khi sap xep");
		SinhVien.sortStudents(dsSinhVien);
		SinhVien.inDanhSachSV(dsSinhVien);
	}
}
