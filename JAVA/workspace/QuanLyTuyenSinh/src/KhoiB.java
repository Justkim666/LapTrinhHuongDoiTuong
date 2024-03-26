
public class KhoiB extends ThiSinh {
	private String Toan, Hoa, Sinh;
	
	public KhoiB() {
		super();
		Toan = new String();
		Hoa = new String();
		Sinh = new String();
	}
	
	public KhoiB(KhoiB b) {
		Toan = new String(b.Toan);
		Hoa = new String(b.Hoa);
		Sinh = new String(b.Sinh);
	}
	
	public String getKhoiThi() {
		return "Khoi B";
	}
	
	public void in() {
		super.in();
		System.out.println("Khoi B");
	}
}
