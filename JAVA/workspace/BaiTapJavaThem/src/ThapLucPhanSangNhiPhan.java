import java.util.Scanner;

public class ThapLucPhanSangNhiPhan {
	public static void main(String[] args) {
		System.out.print("Nhap vao day so thap luc phan: ");
		String s1;
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();

		// Dùng 1 mảng kí tự lưu từng ký tự
		String mangKyTu[];
		mangKyTu = new String[s1.length()];
		String chuoi;
		for (int i = 0; i < mangKyTu.length; i++) {
			chuoi = "";
			chuoi += s1.charAt(i);
			mangKyTu[i] = chuoi;
		}
		// Dùng 1 mảng các chuỗi lưu (thập phân sang nhị phân) của ký tự
		String mangChuoi[];
		mangChuoi = new String[s1.length()];
		System.out.println(mangChuoi.length);
		for (int i = 0; i < mangChuoi.length; i++) {
			mangChuoi[i] = ThapLucPhanSangNhiPhan.ThapPhanSangNhiPhan(mangKyTu[i]);
			System.out.println(mangChuoi[i]);
		}
		
		//In
		System.out.print("Chuyen doi sang co so nhi phan la: ");
		for(int i = 0; i < mangChuoi.length; i++) {
			System.out.print(mangChuoi[i]);
		}
	}

	// Đổi từ thập phân sang nhị phân
	public static String ThapPhanSangNhiPhan(String c) {
		if(c == "A" || c == "a") {
			String binary = "1010";
			return binary;
		} else if(c == "B" || c == "b") {
			String binary = "1011";
			return binary;
		} else if(c == "C" || c == "c") {
			String binary = "1100";
			return binary;
		}else if(c == "D" || c == "d") {
			String binary = "1101";
			return binary;
		}else if(c == "E" || c == "e") {
			String binary = "1110";
			return binary;
		}else if(c == "F" || c == "f") {
			String binary = "1111";
			return binary;
	    }else {
	    	int number = Integer.parseInt(c), z = 0, array[], i = 0;
	    	array = new int[4];
	    	String result = "";
	    	while(number != 0) {
	    		z = number % 2;
	    		array[i] = z;
	    		number /= 2;
	    		i++;
	    	}
	    	for(int j = i; j >= 0; j++) {
	    		int e = array[i];
	    		result += e;
	    	}
	    	return result;
	    }
	}
}
