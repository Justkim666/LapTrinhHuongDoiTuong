
public class KhoiC extends ThiSinh{
	private String Van, Su, Dia;
	
	public KhoiC() {
		super();
		Van = new String();
		Su = new String();
		Dia = new String();
	}
	
	public KhoiC(KhoiC c) {
		Van = new String(c.Van);
		Su = new String(c.Su);
		Dia = new String(c.Dia);
	}
	
	public String getKhoiThi() {
		return "Khoi C";
	}
	
	public void in() {
		super.in();
		System.out.println("Khoi C");
	}
}