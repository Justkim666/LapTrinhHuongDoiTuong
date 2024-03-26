import java.util.Scanner;

public class GiaiPTBac2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = 0, b = 0, c = 0;
			do {
				System.out.print("Nhap a = ");
				a = sc.nextInt();
				System.out.print("Nhap b = ");
				b = sc.nextInt();
				System.out.print("Nhap c = ");
				c = sc.nextInt();
				if (a == 0) {
					System.out.println("Vui long nhap lai, he so a phai khac khong!");
				}
			} while (a == 0);
			double delta = Math.pow(b, 2) - 4 * a * c;
			double x1, x2;
			if (delta > 0) {
				System.out.println("Phuong trinh co 2 nghiem");
				x1 = Math.round((-b + Math.sqrt(delta)) / (2 * a));
				x2 = Math.round((-b - Math.sqrt(delta)) / (2 * a));
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep");
				x1 = x2 = Math.round(-b / (2 * a));
				System.out.println("x1 = x2 = " + x1);
			} else {
				System.out.println("Phuong trinh vo nghiem!");
			}
		}

	}
}
