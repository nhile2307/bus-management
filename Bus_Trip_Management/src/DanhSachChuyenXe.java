import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Xử lý nghiệp vụ liên quan đến danh sách chuyến xe
 * Người tạo:....
 * */
public class DanhSachChuyenXe {

	// 1. attributes
	private ArrayList<ChuyenXe> listChuyenXe;
	private float tongDoanhThu;
	private float doanhThuNoi;
	private float doanhThuNgoai;
	// 2, get, set

	public float getTongDoanhThu() {
		return this.tongDoanhThu;
	}

	public float getDoanhThuNoi() {
		return this.doanhThuNoi;
	}

	public float getDoanhThuNgoai() {
		return this.doanhThuNgoai;
	}

	/**
	 * @return the listChuyenXe
	 */
	public ArrayList<ChuyenXe> getListChuyenXe() {
		return listChuyenXe;
	}

	/**
	 * @param listChuyenXe the listChuyenXe to set
	 */
	public void setListChuyenXe(ArrayList<ChuyenXe> listChuyenXe) {
		this.listChuyenXe = listChuyenXe;
	}

	// 3. constructors
	public DanhSachChuyenXe() {
		listChuyenXe = new ArrayList<ChuyenXe>();
	}

	// 4. input, out
	public void nhap(Scanner scan) {
		boolean flag = true;
		ChuyenXe chuyenXe;
		do {
			System.out.println("Nhập 1. In city bus");
			System.out.println("Nhập 2. Suburban bus");
			System.out.println("Nhập 0. Exit inserting");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				chuyenXe = new ChuyenXeNoiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 2:
				chuyenXe = new ChuyenXeNgoaiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (ChuyenXe cx : this.listChuyenXe) {
			cx.xuat();
		}
	}

	// 5. business
	public void tinhTongDoanhThu() {
		this.tongDoanhThu = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			this.tongDoanhThu += cx.getDoanhThu();
		}
	}

	public void tinhDoanhThuNoi() {
		this.doanhThuNoi = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNoiThanh) { // Kiểm tra cx đang chạy là thể hiện của lớp đối tượng àno
													// hoặc cx được new ra từ lớp nào
				this.doanhThuNoi += cx.getDoanhThu();
			}
		}
	}

	public void tinhDoanhThuNgoai() {
		this.doanhThuNgoai = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) { // Kiểm tra cx đang chạy là thể hiện của lớp đối tượng àno
													// hoặc cx được new ra từ lớp nào

				this.doanhThuNgoai += cx.getDoanhThu();
			}
		}
	}

	public void dummyData() {
		ChuyenXe chuyenXe;
		chuyenXe = new ChuyenXeNoiThanh("1", "city 1", "02", 1200, "number 12", 35);
		this.listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNoiThanh("2", "city 2", "03", 1100, "number 14", 5.6f);
		this.listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNgoaiThanh("3", "suburban 1", "05", 2000, "Binh Thuan", 2);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("4", "suburban 2", "07", 3000, "Nha Trang", 2);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNoiThanh("6", "city 3", "06", 2100, "number 15", 8.6f);
		this.listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNgoaiThanh("7", "suburban 3", "09", 1500, "Binh Thuan", 1.5f);
		this.listChuyenXe.add(chuyenXe);
	}

	public float tinhDTCXBinhThuan() {
		float doanhThu = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) {
				ChuyenXeNgoaiThanh ngoai = ((ChuyenXeNgoaiThanh) cx); // Casting- ép kiểu trong đối tượng
				if (ngoai.getNoiDen().equalsIgnoreCase("Binh Thuan")) {
					doanhThu += ngoai.getDoanhThu();
				}
			}
		}
		return doanhThu;
	}

}
