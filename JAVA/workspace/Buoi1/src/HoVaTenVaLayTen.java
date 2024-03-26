import java.util.Scanner;

public class HoVaTenVaLayTen {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String hoVaTen;
			System.out.print("Nhap vao ho va ten: ");
			hoVaTen = sc.nextLine();
			System.out.println("Ho va Ten: "+ hoVaTen);
			System.out.println("Ten: "+ HoVaTenVaLayTen.Ten(hoVaTen));
		}
	}
	
	public static String Ten(String hoTen) {
		String[] tachHoTen = hoTen.split(" ");
		return tachHoTen[tachHoTen.length-1];
	}
	
}
