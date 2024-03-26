import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		boolean check;
		int v;
		String a = new String();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap a = ");
			a = sc.nextLine();
			try {
				v = Integer.parseInt(a);
				check = true;
			} catch(Exception e) {
				System.out.println("Nhap sai! vui long nhap lai");
				check = false;
			}
			
		}while(!check);
	}
}
