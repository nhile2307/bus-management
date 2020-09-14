import java.util.Scanner;

/*
 * Mục đích: Quản lý nghiệp vụ liên quan chuyến xe nội thành.
 * Người tạo:....
 * */
public class ChuyenXeNoiThanh extends ChuyenXe {
	
	//1. Attributes
	private String soTuyen;
	private float soKM;
	//2. get, set
	
	/**
	 * @return the soTuyen
	 */
	public String getSoTuyen() {
		return soTuyen;
	}

	/**
	 * @param soTuyen the soTuyen to set
	 */
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	/**
	 * @return the soKM
	 */
	public float getSoKM() {
		return soKM;
	}

	/**
	 * @param soKM the soKM to set
	 */
	public void setSoKM(float soKM) {
		this.soKM = soKM;
	}

	//3. constructor
	public ChuyenXeNoiThanh() {
		super();
	}
	
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu,
			String soTuyen, float soKM ) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soKM = soKM;
		this.soTuyen = soTuyen;
		
		
	}
	//4. in, out
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Route number: ");
		this.soTuyen = scan.nextLine();
		System.out.print("Number of KM: ");
		this.soKM = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Route number: " + this.soTuyen + "\t Number of KM: " + this.soKM);
	}
	//5. business methods
	

}
