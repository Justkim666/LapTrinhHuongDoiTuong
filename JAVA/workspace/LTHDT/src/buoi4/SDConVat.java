package buoi4;

import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
		ConVat ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so luong con vat: ");
		int n = sc.nextInt();
		ds = new ConVat[n];
		int c;
		for(int i = 0; i < n; i++) {
			System.out.print("Ban nhap: ConBo(1) / ConHeo(2) / ConDe(3): ");
			c = sc.nextInt();
			if(c == 1) {
				System.out.println("Nhap vao con bo");
				ds[i] = new Bo();
				ds[i].nhap();
			}
			if(c == 2) {
				System.out.println("Nhap vao con heo");
				ds[i] = new Heo();
				ds[i].nhap();
			}
			if(c == 3) {
				System.out.println("Nhap vao con de");
				ds[i] = new De();
				ds[i].nhap();
			}
		}
		for(ConVat cv: ds) {
			cv.keu();
		}
		ConVat ga = new Ga();
		ga.keu();
	}
}
