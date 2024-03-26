
public class SumAndAverage {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); //cận dưới
		int m = Integer.parseInt(args[1]); //cận trên
		int sum = 0;
		double average;
		//Tính tổng
		int number;
		for(number = n; number <= m; number++) {
			sum += number;
		}
		//Tính trung bình
		average = sum / number;
		System.out.println("Tổng các số từ "+n+" đến "+m+" là: "+ sum);
		System.out.println("Trung bình cộng: "+ average);
	}
}
