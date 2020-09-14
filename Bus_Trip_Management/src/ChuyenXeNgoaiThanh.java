import java.util.Scanner;

/*
 * Mục đích: Quản lý chuyến xe Ngoại thành
 * Người tạo:...
 * */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
   //1. attributes
	private String noiDen;
	private float soNgayDiDuoc;
	//2. get, set
	
	/**
	 * @return the noiDen
	 */
	public String getNoiDen() {
		return noiDen;
	}

	/**
	 * @param noiDen the noiDen to set
	 */
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	/**
	 * @return the soNgayDiDuoc
	 */
	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	/**
	 * @param soNgayDiDuoc the soNgayDiDuoc to set
	 */
	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	//3. constructor
	public ChuyenXeNgoaiThanh() {
		super();
	}

	/**
	 * @param maSoChuyen
	 * @param hoTenTaiXe
	 * @param soXe
	 * @param doanhThu
	 */
	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, String noiDen, float soNgayDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	//4. input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Enter destination: ");
		this.noiDen = scan.nextLine();
		System.out.print("Enter days of working:");
		this.soNgayDiDuoc = Float.parseFloat(scan.nextLine());
	}
	
	@Override 
	public void xuat() {
		super.xuat();
		System.out.println("\t Destination: " + this.noiDen + "\t Days of working: " + this.soNgayDiDuoc);
	}
	//5. business
	

}
