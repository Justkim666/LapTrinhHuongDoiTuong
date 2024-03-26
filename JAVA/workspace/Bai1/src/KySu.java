import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;
	
	public KySu() {
		super();
		nganhDaoTao = new String();
	}
	
	public KySu(KySu a) {
		nganhDaoTao = a.nganhDaoTao;
	}
	
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap vao nganh dao tao: "); nganhDaoTao = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("Nganh dao tao: " + nganhDaoTao);
	}
	
	public String toString() {
		return super.toString() + "\n" + "Nganh dao tao: " + nganhDaoTao;
	}

	@Override
	public int getTien() {
		// TODO Auto-generated method stub
		return 345;
	}
}
