import java.util.Scanner;

public class QLCB {
	
	public static void main(String[] args) {
		CanBo cb[] = new CanBo[100];	
		int length_cb = 0;
		System.out.println("----------------Menu----------------");
		System.out.println("1. Them can bo moi");
		System.out.println("2. Tim kiem can bo");
		System.out.println("3. Hien thi danh sach can bo");
		System.out.println("4. Thoat");
		System.out.println("------------------------------------");
		Scanner sc = new Scanner(System.in);
		int n, check_add = 1, out = 0, find = 0;
		do {
			System.out.print("Chon tac vu muon thuc hien: "); n = sc.nextInt();
			switch(n) {
			case 1:
				int x = 0;
				do {
					System.out.print("Ban nhap: (1)Nhan vien / (2)Ky su / (3)Cong nhan: "); x = sc.nextInt();
					if(x == 1) {
						cb[length_cb] = new NhanVien();
						cb[length_cb].nhap();
						check_add = 1;
						length_cb++;
					}
					else if(x == 2) {
						cb[length_cb] = new KySu();
						cb[length_cb].nhap();
						check_add = 1;
						length_cb++;
					}
					else if(x == 3) {
						cb[length_cb] = new CongNhan();
						cb[length_cb].nhap();
						check_add = 1;
						length_cb++;
					}
					else check_add = 0;
					if(check_add == 0) {
						System.out.println("Vui long nhap dung gia tri!");
					}
				}while(check_add == 0);
				break;
			
			case 2:
				String s = new String();
				sc.nextLine();
				System.out.print("Nhap vao ten can bo muon tim kiem: "); s = sc.nextLine();
				for(int j = 0; j < length_cb; j++) {
					if(cb[j].getHoTen().equals(s)) {
						cb[j].in();
						find = 1;
						break;
					}
				}
				if(find == 0) {
					System.out.println("Khong tim thay can bo ten: "+ s);
				}
				break;
			case 3:
				System.out.println("Hien thi thong tin ve danh sach can bo");
				for(int j = 0; j < length_cb; j++) {
					System.out.println("Can bo thu :"+ (j+1));
					cb[j].in();
					System.out.println();
				}
				break;
			case 4:
				out = 1;
				break;
			}
			System.out.println("------------------------------------");
		}while(out == 0);
	}
}
