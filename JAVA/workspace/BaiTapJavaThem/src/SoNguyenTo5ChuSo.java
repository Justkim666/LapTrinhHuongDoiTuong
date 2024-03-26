
public class SoNguyenTo5ChuSo {
	public static void main(String[] args) {
		for(int i = 10001; i < 99999; i+=2) {
			if(SoNguyenTo5ChuSo.isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
