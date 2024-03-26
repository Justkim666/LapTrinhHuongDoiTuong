import java.util.Scanner;

public class Nhap2SoVaTinhTong {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = 0, b = 0;
			String a1 = "", a2 = "";
			boolean check;
			do {
				System.out.println("Nhập vào 2 số nguyên a và b");
				a1 = sc.nextLine();
				a2 = sc.nextLine();
				try {
					a = Integer.parseInt(a1);
					b = Integer.parseInt(a2);
					check = true;
				} catch (Exception e) {
					System.out.println("Nhập sai định dạng, vui lòng nhập lại!");
					check = false;
				}
			} while (!check);
			System.out.println("Tổng 2 số là: " + (a + b));
		}
	}

}
