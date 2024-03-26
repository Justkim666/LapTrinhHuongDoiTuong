package buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap danh sach gom n loai gach lot nen n = ");
		n = sc.nextInt();
		Gach dsGach[] = new Gach[n];
		
		for(int i = 0; i < n; i++) {
			dsGach[i] = new Gach();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nNhap loai gach thu " +(i+1));
			dsGach[i].nhap();
		}
		
		System.out.println("Danh sach gach vua nhap la");
		for(int i = 0; i < n; i++) {
			System.out.println("Loai gach thu "+ (i+1));
			System.out.println(dsGach[i]);
			System.out.println("----------------------------");
		}
		
		float chiPhiMin = Float.MAX_VALUE;
		int viTri=0;
		for(int i = 0; i < n; i++) {
			float dienTich = (dsGach[i].getChieuDai()*dsGach[i].getChieuNgang())*dsGach[i].getSoLuongTrong1Hop();
			if(dsGach[i].getGia1Hop()/dienTich < chiPhiMin) {
				chiPhiMin =dsGach[i].getGia1Hop()/dienTich;
				viTri = i;
			}
		}
		
		System.out.println("Loai gach co chi phi lot nen thap nhap la");
		System.out.println(dsGach[viTri]);
		System.out.println("\nChi Phi lot gach voi nen voi chieu dai 5m va chieu ngang 20m");
		for(int i = 0; i < n; i++) {
			System.out.print("Chi phi loai gach thu "+ (i+1) + ": ");
			int soLuongHop = dsGach[i].soLuongHop(500, 20000);
			long giaTien = dsGach[i].getGia1Hop() * soLuongHop;
			System.out.println(giaTien);
		}
	}
}
