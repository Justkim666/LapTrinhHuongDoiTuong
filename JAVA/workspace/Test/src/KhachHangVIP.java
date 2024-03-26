import java.util.Scanner;

public class KhachHangVIP extends KhachHang{
	private int coupon;
	
	public KhachHangVIP() {
		super();
		coupon = 0;
	}
	
	public KhachHangVIP(KhachHangVIP h) {
		coupon = 0;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		if(super.tongTien() < 1000) {
			coupon = 100;
		}
		else if(super.tongTien() >= 1000 && super.tongTien() <= 5000) {
			coupon = 200;
		}
		else if(super.tongTien() > 5000) {
			coupon = 500;
		}
	}
}
