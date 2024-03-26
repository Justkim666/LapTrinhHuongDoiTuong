package ThuVien;

import java.util.Scanner;

public class QuanLySach {
	public static void main(String[] args) {
		TaiLieu tl[] = new TaiLieu[100];
		int length_tl = 0;
		System.out.println("---------------Menu---------------");
		System.out.println("1. Them moi tai lieu");
		System.out.println("2. Xoa tai lieu");
		System.out.println("3. Hien thi thong tin tai lieu");
		System.out.println("4. Tim kiem tai lieu");
		System.out.println("0. Thoat");
		System.out.println("----------------------------------");
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			do {
				System.out.print("Nhap tac vu muon thuc hien: "); n = sc.nextInt();
				if(n != 1 && n != 2 && n != 3 && n != 4) {
					System.out.println("Vui long nhap dung tac vu tren Menu");
				}
			}while(n != 1 && n != 2 && n != 3 && n != 4);
			switch(n) {
			case 1:
				int x = 1;
				System.out.print("Ban chon  (1)Sach / (2)TapChi / (3)Bao: ");
				do {
					x = sc.nextInt();
					if(x != 1 && x != 2 && x != 3) {
						System.out.println("Nhap sai vui long nhap lai!");
					}
				}while(x != 1 && x != 2 && x != 3);
				if(x == 1) {
					tl[length_tl] = new Sach();
					tl[length_tl].nhap();
				    length_tl++;
				}
				else if(x == 2) {
					tl[length_tl] = new TapChi();
					tl[length_tl].nhap();
				    length_tl++;
				}
				else {
					tl[length_tl] = new Bao();
					tl[length_tl].nhap();
				    length_tl++;
				}
				break;
			case  2:
				String s = new String();
				int pos_del = 0;
				sc.nextLine();
				System.out.print("Nhap ma tai lieu can xoa: "); s = sc.nextLine();
				for(int i = 0; i < length_tl; i++) {
					if(tl[i].getMaTaiLieu().equals(s)) {
						pos_del = i;
						break;
					}
				}
				for(int i = pos_del; i < length_tl; i++) {
					tl[i] = tl[i+1];
				}
				length_tl--;
				break;
			case 3:
				if(length_tl == 0) {
					System.out.println("Tai lieu khong co du lieu");
				}
				else {
					System.out.println("Hien thi thong tin ve tai lieu");
					for(int i = 0; i < length_tl; i++) {
						System.out.println("Tai lieu thu 1");
						tl[i].in();
					}
				}
				break;
			case 4:
				String f = new String();
				System.out.print("Nhap vao ma tai lieu can tim kiem: "); f = sc.nextLine();
				for(int i = 0; i < length_tl; i++) {
					if(tl[i].getMaTaiLieu().equals(f)) {
						tl[i].in();
						break;
					}
				}
			}
			System.out.println("----------------------------------");
		}while(n != 0);
	}
}