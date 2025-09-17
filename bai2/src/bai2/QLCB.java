/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class QLCB {
	// thuộc tính
	private ArrayList<CanBo> dscb_115;

	// constructor
	public QLCB() {
		dscb_115 = new ArrayList<CanBo>(10);
	}

	// phương thức thêm cán bộ
	public void themCanBo(CanBo cb_115) {
		dscb_115.add(cb_115);
	}

	// phương thức nhập danh sách cán bộ
	public void nhapDanhSach(Scanner sc_115) {
		CanBo cb_115;
		System.out.print("Nhap vao so luong can bo= ");
		int n_115 = sc_115.nextInt();
		sc_115.nextLine(); // bỏ dòng trống

		System.out.println("Nhap thong tin chi tiet:");
		for (int i_115 = 0; i_115 < n_115; i_115++) {
			System.out.println("Lan nhap thu " + (i_115 + 1) + ":");
			System.out.print("Chon can bo (1-KySu ; 2-NhanVien ; 3-CongNhan= ");
			int chon_115 = sc_115.nextInt();
			sc_115.nextLine();

			cb_115 = new CanBo();

			switch (chon_115) {
				case 1:
					cb_115 = new KySu();
					break;
				case 2:
					cb_115 = new NhanVien();
					break;
				case 3:
					cb_115 = new CongNhan();
					break;
				default:
					cb_115 = new KySu(); // mặc định
					break;
			}

			// nhập thông tin cho cán bộ được chọn
			cb_115.nhapThongTin(sc_115);

			// thêm cán bộ vào danh sách
			themCanBo(cb_115);
		}
	}

	// phương thức tìm kiếm theo họ tên
	public void timKiemCanBo(String hoTen_115) {
		for (CanBo cb_115 : dscb_115) {
			if (hoTen_115.equals(cb_115.getHoTen())) {
				cb_115.hienThiThongTin();
			}
		}
	}
}