import java.util.Scanner;

/**
 * Giải phương trình bậc 2
 * 
 * @author Admin
 *
 */
public class PhuongTrinhBac2 {
	/**
	 * main
	 */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			float a = 0, b = 0, c = 0;
			System.out.print("Nhap a = ");
			a = sc.nextFloat();
			System.out.print("Nhap b = ");
			b = sc.nextFloat();
			System.out.print("Nhap c = ");
			c = sc.nextFloat();
			if(a == 0) {
				PhuongTrinhBac2.giaiPTBac1(b, c);
			}
			else PhuongTrinhBac2.giaiPTBac2(a, b, c);
		}
	}

	/**
	 * Giải phương trình bậc 1 hàm static
	 */
	public static void giaiPTBac1(float a, float b) {
		float x = 0;
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô số nghiệm!");
			} else
				System.out.println("Phương trình vô nghiệm!");
		} else
			x = -b / a;
		System.out.println("Nghiệm của phương trình là : "+ x);
	}

	/**
	 * Giải phương trình bậc 2 hàm static
	 */
	public static void giaiPTBac2(float a, float b, float c) {
		float delta = (float) (Math.pow(b, 2) - 4 * a * c), x1 = 0, x2 = 0;
		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm!");
		} else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
		} else {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " x2 = " + x2);
		}
	}
}
