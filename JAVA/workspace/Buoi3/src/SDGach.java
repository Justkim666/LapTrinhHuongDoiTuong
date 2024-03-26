import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.print("Nhap vao danh sach so gach lot nen n = "); n = sc.nextInt();
		Gach dsGach[] = new Gach[n];
		
		for(i = 0; i < dsGach.length; i++) {
			dsGach[i] = new Gach();
			System.out.println("\nNhap vao loai gach nen thu "+ (i+1));
			dsGach[i].nhap();
		}
		
		for(i = 0; i < dsGach.length; i++) {
			System.out.println("\nGach lot nen thu : "+ (i+1));
			System.out.println(dsGach[i]);
		}
		
		int soLuong;
		System.out.println("Dien tich chieu ngang 5m chieu dai 20m");
		for(i = 0; i < dsGach.length; i++) {
			soLuong = dsGach[i].soLuongHop(5, 20);
			long chiPhi = soLuong * (long)dsGach[i].getGia1Hop();
			System.out.println("Gach thu "+ (i+1) + " ma so " + dsGach[i].getMaSo() + " chi phi mua gach la: " + chiPhi);
		}
	}
}
