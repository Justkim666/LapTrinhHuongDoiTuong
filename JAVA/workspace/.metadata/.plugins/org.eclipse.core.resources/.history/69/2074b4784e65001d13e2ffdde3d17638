import java.util.Scanner;

public class KhuPho {
	private HoGiaDinh khuPho[];
	
	public KhuPho() {
		khuPho = new HoGiaDinh[100];
	}
	
	public KhuPho(KhuPho kp) {
		khuPho = kp.khuPho;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap so ho gia dinh: "); n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap vao ho thu "+(i+1));
			khuPho[i] = new HoGiaDinh();
			khuPho[i].nhap();
			System.out.println();
		}
	}
	
	public void in() {
		System.out.println("Thong tin khu pho");
		for(int i = 0; i < khuPho.length; i++) {
			System.out.println("Thong tin ho thu "+ (i+1));
			khuPho[i].in();
		}
	}
	
	public String toString() {
		String s = new String();
		for(int i = 0; i < khuPho.length; i++) {
			s += khuPho[i].toString();
		}
		return s + "\n";
	}
}
