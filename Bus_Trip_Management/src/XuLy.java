import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DanhSachChuyenXe objDSCX = new DanhSachChuyenXe();
		Scanner scan = new Scanner(System.in);
		//objDSCX.nhap(scan);
		objDSCX.dummyData();
		objDSCX.xuat();
		float doanhThu = objDSCX.tinhDTCXBinhThuan();
		System.out.println("Revenue Binh Thuan: " + doanhThu);
		

	}

}
