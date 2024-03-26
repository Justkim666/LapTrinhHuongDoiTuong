package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	String mSSV, hoTen;
	Date ngaySinh;
	int soLuong;
	String[] tenHP, diem;

	// Ham getter va setter
	public String getmSSV() {
		return mSSV;
	}

	public void setmSSV(String mSSV) {
		this.mSSV = mSSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String[] getTenHP() {
		return tenHP;
	}

	public void setTenHP(String[] tenHP) {
		this.tenHP = tenHP;
	}

	public String[] getDiem() {
		return diem;
	}

	public void setDiem(String[] diem) {
		this.diem = diem;
	}

	// Ham xay dung
	public SinhVien() {
		mSSV = new String();
		hoTen = new String();
		soLuong = 0;
		tenHP = new String[100];
		diem = new String[100];
	}

	public SinhVien(String mssv, String hoten, Date ngaysinh, int soluong, String tenhp[], String diemhp[]) {
		mSSV = new String(mssv);
		hoTen = new String(hoten);
		ngaySinh = new Date(ngaysinh);
		soLuong = soluong;
		tenHP = new String[soluong];
		diem = new String[soluong];
		for (int i = 0; i < soluong; i++) {
			tenHP[i] = new String(tenhp[i]);
			diem[i] = new String(diemhp[i]);
		}

	}

	public SinhVien SinhVien(SinhVien a) {
		SinhVien sv = new SinhVien();
		sv.mSSV = new String(a.mSSV);
		sv.hoTen = new String(a.hoTen);
		sv.soLuong = a.soLuong;
		for (int i = 0; i < a.soLuong; i++) {
			sv.tenHP[i] = new String(a.tenHP[i]);
			sv.diem[i] = new String(a.diem[i]);
		}
		return sv;
	}

	// Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap MSSV: ");
		mSSV = sc.nextLine();
		System.out.print("Nhap Ho va Ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap so luong HP: ");
		soLuong = sc.nextInt();
		String c = sc.nextLine();
		for (int i = 0; i < soLuong; i++) {
			System.out.print("Nhap hoc phan thu " + (i + 1) + ": ");
			tenHP[i] = sc.nextLine();
		}
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem cho tung HP");
		for (int i = 0; i < soLuong; i++) {
			System.out.print("Nhap diem cho HP thu "+ (i+1) +": ");
			diem[i] = sc.nextLine();
		}
	}

	// Ham in
	public void in() {
		System.out.print("\nMSSV: " + mSSV);
		System.out.print("\nHo va Ten: " + hoTen);
		System.out.print("\nSo luong HP hoc: " + soLuong);
		System.out.println("\nDanh sach cac HP va diem cua tung HP");
		for (int i = 0; i < soLuong; i++) {
			System.out.println("Hoc Phan: " + tenHP[i] + "\t" + " Diem: " + diem[i]);
		}
	}

	// Ham toString
	public String toString() {
		String ketQua = new String("");
		ketQua += "MSSV: " + mSSV + "\nHo va Ten: " + hoTen + "\nSo luong HP hoc: " + soLuong
				+ "\nDanh sach cac HP va diem cua tung HP";
		for (int i = 0; i < soLuong; i++) {
			ketQua += "\nHoc Phan: " + tenHP[i] + "\t" + " Diem: " + diem[i];
		}
		return ketQua;
	}

	// Tinh diem TB
	public float diemTB() {
		float ketQua = 0.0f;
		for (int i = 0; i < soLuong; i++) {
			switch (diem[i]) {
			case "A":
				ketQua += 4;
				break;
			case "B+":
				ketQua += 3.5;
				break;
			case "B":
				ketQua += 3;
				break;
			case "C+":
				ketQua += 2.5;
				break;
			case "C":
				ketQua += 2;
				break;
			case "D+":
				ketQua += 1.5;
				break;
			case "D":
				ketQua += 1;
				break;
			}
		}
		return ketQua / soLuong;
	}

	// Dang ky HP
	public void dKyHP() {
		Scanner sc = new Scanner(System.in);
		String tenhp = new String();
		System.out.print("Nhap vao ten hoc phan can dang ky: ");
		tenhp = sc.nextLine();
		tenHP[soLuong] = tenhp;
		diem[soLuong] = "None";
		soLuong++;
	}

	// xoa HP
	public void xoaHP(String hp) {
		int viTri, i;
		for (viTri = 0; viTri < soLuong; viTri++) {
			if (tenHP[viTri].equals(hp))
				break;
		}
		for (i = viTri; i < soLuong; i++) {
			tenHP[i] = tenHP[i + 1];
			diem[i] = diem[i + 1];
		}
		soLuong--;
	}
	
	//Sap xep danh sach sinh vien theo thu tu Alphabet
	
	public String getLastName(String hoVaTen) {
		return hoVaTen.substring(hoVaTen.lastIndexOf(" ") + 1);
	}
	
	public String layTen(String ten) {
		return ten.substring(ten.lastIndexOf(" ")+1);
	}
	
	public String layHo(String ten) {
		return ten.substring(ten.indexOf(" "));
	}
	public String getFirstName(String hoVaTen) {
		return hoVaTen.substring(0, hoVaTen.indexOf(" "));
	}
	
	public void swap(SinhVien a, SinhVien b) {
		SinhVien temp = a;
		a = b;
		b = temp;
	}
	
	public void sortSV(SinhVien dsSV[]) {
		for(int i = 0; i < dsSV.length-1; i++) {
			for(int j = i+1; j < dsSV.length; j++) {
				if(getLastName(dsSV[i].getHoTen()).equals(getLastName(dsSV[j].getHoTen()))) {
					if(getFirstName(dsSV[i].getHoTen()).compareTo(getLastName(dsSV[j].getHoTen())) > 0){
						swap(dsSV[i], dsSV[j]);
					}
				}
				else {
					if(getLastName(dsSV[i].getHoTen()).compareTo(dsSV[j].getHoTen()) > 0) {
						swap(dsSV[i], dsSV[j]);
					}
				}
			}
		}
	}
	public String layEmail() {
		return "";
	}
	public String layTaiKhoan() {
		return "";
	}
}
