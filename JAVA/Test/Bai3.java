
public class Bai3 {
	public static void main(String[] agrs) {
		double tong=0;
		double n=0;
		double max=Double.MIN_VALUE;
		for(int i=0;i<agrs.length;i++) {
			try {
				n=Double.parseDouble(agrs[i]);
			}
			catch(NumberFormatException e) {
				n=0;
			}
			if(max<n) 
				max=n;
				tong+=n;
			
			
	   }
		System.out.println("Tong = "+tong);
		System.out.println("So lon nhat = "+max);
   }
}
