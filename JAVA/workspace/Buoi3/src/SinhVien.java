import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SinhVien {
	// Thuoc tinh
	private String mSSV, hoTen;
	private Date ngaySinh;
	private int soLuongHPDK;
	private String tenCacHP[];
	private String diemHP[];

	Scanner sc = new Scanner(System.in);
	// Phuong thuc

	// Cac ham xay dung
	public SinhVien() {
		mSSV = hoTen = "";
		ngaySinh = new Date();
		soLuongHPDK = 0;
		tenCacHP = new String[0];
		diemHP = new String[0];
	}

	//Ham getName
	public String getName() {
		return hoTen;
	}
	
	// Ham nhap thong tin

	public void nhapThongTinCoBan() {
		int i;
		System.out.print("Nhap MSSV: ");
		mSSV = sc.nextLine();
		System.out.print("Nhap ho va ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh");
		ngaySinh.nhap();
		System.out.print("Nhap so luong hoc phan dang ky : ");
		soLuongHPDK = sc.nextInt();
		String c = sc.nextLine();
		tenCacHP = new String[soLuongHPDK];
		diemHP = new String[soLuongHPDK];
		for (i = 0; i < tenCacHP.length; i++) {
			System.out.print("Nhap hoc phan thu " + (i + 1) + ":");
			tenCacHP[i] = sc.nextLine();
			diemHP[i] = " ";
		}
	}

	public void nhapDiemCacHP() {
		int i;
		for (i = 0; i < diemHP.length; i++) {
			System.out.print("Nhap diem cua HP " + tenCacHP[i] + ":");
			diemHP[i] = sc.nextLine();
		}
	}

	// Ham toString
	public String toString() {
		int i;
		String tenHP = "";
		for (i = 0; i < tenCacHP.length; i++) {
			tenHP += tenCacHP[i] + "\t";
		}

		String diemCacHP = "";
		for (i = 0; i < diemHP.length; i++) {
			diemCacHP += diemHP[i] + "\t";
		}

		return "MSSV:" + mSSV + "\nHo va ten:" + hoTen + "\nNgay thang nam sinh:" + ngaySinh
				+ "\nSo luong HP dang ky:" + soLuongHPDK + "\n" + tenHP + "\n" + diemCacHP + "\n";

	}

	// Ham tinh diem TB cua SV tinh theo thang diem 4
	public float diemTrungBinh() {
		float diemTB = 0, quyDiem4 = 0;
		String diemChu;
		int i;
		for(i = 0; i < diemHP.length; i++) {
			diemChu = diemHP[i];
			switch(diemChu) {
			case "A": quyDiem4 = 4.0f; break;
			case "B+": quyDiem4 = 3.5f; break;
			case "B": quyDiem4 = 3.0f; break;
			case "C+": quyDiem4 = 2.5f; break;
			case "C": quyDiem4 = 2.0f; break;
			case "D+": quyDiem4 = 1.5f; break;
			case "D": quyDiem4 = 1.0f; break;
			case "F": quyDiem4 = 0.0f; break;
			}
			diemTB += quyDiem4;
		}
		return (float)diemTB/soLuongHPDK;
	}
	
	//Ham dang the 1 HP cho SinhVien
	
	public void dangKyHP() {
		soLuongHPDK++;
		String tenCacHPTG[] = new String[soLuongHPDK];
		String diemCacHPTG[] = new String[soLuongHPDK];
		int i;
		for(i = 0; i < tenCacHPTG.length-1; i++) {
			tenCacHPTG[i] = tenCacHP[i];
			if(diemHP.length == 0) { // Chua cap nhat diem
				diemCacHPTG[i] = " "; 
			}
		}
		tenCacHP = tenCacHPTG;
		diemHP = diemCacHPTG;
		String tenHP, c;
		System.out.print("Nhap ten HP dang ky them: "); 
		tenHP = sc.nextLine(); 
		tenCacHP[tenCacHP.length-1] = tenHP;
		diemHP[diemHP.length-1] = "None";
	}
	
	//Ham xoa => Xoa mang ten HP xoa luon cot mang Diem
	
	public void deleteHP(int viTri) {
		int i;
		viTri -= 1; //Chuyen ve index
		for(i = viTri; i < tenCacHP.length-1; i++) {
			tenCacHP[i] = tenCacHP[i+1];
			diemHP[i] = diemHP[i+1];
		}
	}
	
	//Ham xoa 1 HP
	
	public void xoaHP(String tenHPxoa) {
		int i;
		for(i = 0; i < tenCacHP.length; i++) {
			if(tenCacHP[i].equals(tenHPxoa)) {
				deleteHP(i+1);
			}
		}
	}
	
	//Canh cao hoc vu
	public static void canhCaoHocVu(String ketQua[], SinhVien dsSinhVien[]) {
		int i;
		for(i = 0; i < dsSinhVien.length; i++) {
			if(dsSinhVien[i].diemTrungBinh() < 1.0) {
				ketQua[i] = dsSinhVien[i].getName();
			}
		}
	}
	
	//Sinh Vien co Diem TB cao nhat
	public static void diemTBCaoNhat(String goodStudent[], SinhVien dsSinhVien[]) {
		goodStudent[0] = new String();
		goodStudent[1] = new String();
		int i;
		float diemMax = 0.0f;
		String tenSV = "";
		for(i = 0; i < dsSinhVien.length; i++) {
			if(dsSinhVien[i].diemTrungBinh() > diemMax) {
				diemMax = dsSinhVien[i].diemTrungBinh();
				tenSV = dsSinhVien[i].getName();
			}
		}
		String diem = Float.toString(diemMax);
		goodStudent[0] = tenSV;
		goodStudent[1] = diem;
	}
	
	//Ham so sanh 2 chuoi
	public static int compareNames(String Name1, String Name2) {
		String getLastName1 = Name1.substring(Name1.lastIndexOf(" ")+1, Name1.length()-1);
		String getLastName2 = Name2.substring(Name2.lastIndexOf(" ")+1, Name2.length()-1);
		if(getLastName1.compareTo(getLastName2) == 0) {
			String getFirstName1 = Name1.substring(0, Name1.indexOf(" "));
			String getFirstName2 = Name2.substring(0, Name2.indexOf(" "));
			return getFirstName1.compareTo(getFirstName2);
		}
		else return getLastName1.compareTo(getLastName2);
	}
	
	//Ham sap xep danh sach SinhVien theo thu tu Alphabet
	public static void sortStudents(SinhVien dsSinhVien[]) {
		int i, j;
		for(i = 0; i < dsSinhVien.length-1; i++) {
			for(j = i+1; j < dsSinhVien.length; j++) {
				if(compareNames(dsSinhVien[i].getName(), dsSinhVien[j].getName()) > 0) {
					SinhVien temp = dsSinhVien[i];
					dsSinhVien[i] = dsSinhVien[j];
					dsSinhVien[j] = temp;
				}
			}
		}
	}
	
	//Hien thi danh sach sinh vien
	public static void inDanhSachSV(SinhVien dsSinhVien[]) {
		int i;
		for(i = 0; i < dsSinhVien.length; i++) {
			System.out.println("\nSinh Vien thu "+ (i+1));
			System.out.println(dsSinhVien[i]);
		}
	}
	
}
