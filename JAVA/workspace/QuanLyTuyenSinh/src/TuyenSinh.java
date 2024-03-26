import java.util.Scanner;

public class TuyenSinh {
	public static void main(String[] args) {
		ThiSinh ts[] = new ThiSinh[100];
		int length_ts = 0;
		System.out.println("-------------------Menu-------------------");
		System.out.println("1. Them thi sinh");
		System.out.println("2. Hien thi thong tin cua thi sinh va khoi thi");
		System.out.println("3. Tim kiem thi sinh");
		System.out.println("0. Thoat");
		System.out.println("------------------------------------------");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			do {
				System.out.print("Chon tac vu can thuc hien: "); n = sc.nextInt();
				if(n != 1 && n != 2 && n != 3) {
					System.out.println("Nhap sai! vui long nhap lai");
				}
			} while(n != 1 && n != 2 && n != 3);
			switch(n) {
			case 1:
				int x;
				System.out.print("Ban chon (1)KhoiA, (2)KhoiB, (3)KhoiC: ");
				do {
					x = sc.nextInt();
				} while(n != 1 && n != 2 && n != 3);
				if(n == 1) {
					ts[length_ts] = new KhoiA();
					ts[length_ts].nhap();
					length_ts++;
				} else if(n == 2) {
					ts[length_ts] = new KhoiB();
					ts[length_ts].nhap();
					length_ts++;
				} else
				{
					ts[length_ts] = new KhoiC();
					ts[length_ts].nhap();
					length_ts++;
				}
				break;
			case 2:
				if(length_ts == 0) {
					System.out.println("Khong co du lieu ve thong tin sinh vien");
				}
				else {
					System.out.println("Thong tin cac thi sinh");
					for(int i = 0; i < length_ts; i++) {
						System.out.println("Thong tin thu "+ (i+1));
						ts[i].in();
						System.out.println();
					}
				}
				break;
			case 3:
				String s;
				System.out.print("Nhap vao so bao danh can tim kiem: "); s = sc.nextLine();
				for(int i = 0; i < length_ts; i++) {
					if(ts[i].getSoBaoDanh().equals(s)) {
						ts[i].in();
						break;
					}
				}
				break;
			}
			System.out.println("----------------------------------");
				
		}while(n != 0);
	}
}