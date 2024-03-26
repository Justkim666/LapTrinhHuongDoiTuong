package buoi1;

public class TongDaySoVaMax {
	public static void main(String[] args) {
		double n, max;
		double tong = 0;
		max = Double.MIN_VALUE;
		for (int i = 1; i <= args.length; i++) {
			try {
				n = Double.parseDouble(args[i]);
			} catch (Exception e) {
				n = 0;
			}
			if (n > max) {
				max = n;
			}
			tong += n;
		}
		System.out.println("Số lớn nhất là: " + max);
		System.out.println("Tổng các số là: " + tong);
	}
}
