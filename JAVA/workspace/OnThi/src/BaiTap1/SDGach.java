package BaiTap1;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap vao so loai vien gach: "); n = sc.nextInt();
		Gach dsGach[] = new Gach[n];
		for(int i = 0; i < n; i++) {
			dsGach[i] = new Gach();
		}
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap loai gach thu "+ (i+1));
			dsGach[i].nhap();
		}
		System.out.println("Thong tin danh sach gach vua nhap la");
		for(int i = 0; i < n; i++) {
			System.out.println("Loai gach thu "+ (i+1));
			dsGach[i].in();
		}
		System.out.print("Loai gach co chi phi lot nen thap nhat voi ma so la: "+ Gach.chiPhiThapNhat(dsGach));
		System.out.println();
		for(int i = 0; i < dsGach.length; i++) {
			System.out.println("Chi phi lot gach cua loai gach voi ma so "+ dsGach[i].getMaSo() +" la: "+ dsGach[i].chiPhiLotNen(50, 200));
		}
	}
}
