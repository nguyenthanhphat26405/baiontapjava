/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class QLHS {
private ArrayList<hocSinh> dshs_115;

	// phuong thuc
	// ham khoi tao
	public QLHS() {
		dshs_115 = new ArrayList<hocSinh>(10);
	}

	// ham them hoc sinh
	public void themHS(hocSinh hs) {
		dshs_115.add(hs);
	}

	// ham nhap danh sach
	public void nhapDanhSachHS(Scanner sc) {
		hocSinh hs;

		System.out.print("Nhap vao so luong hoc sinh= ");
		int n = sc.nextInt();

		System.out.println("Nhap thong tin cho hoc sinh trong danh sach=");
		for (int i = 0; i < n; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la=");

			hs = new hocSinh();
			hs.nhapThongTin(sc);

			themHS(hs);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dshs_115.size();
		for (int i = 0; i < n; i++) {
			System.out.println("\nHoc sinh thu " + (i + 1) + " la=");
			dshs_115.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin(int nam, String que) {
		for (hocSinh hs : dshs_115) {
			if ((hs.getNgaySinh().getYear() + 1900 == nam) && (que.equals(hs.getQueQuan()))) {
				hs.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop) {
		for (hocSinh hs : dshs_115) {
			if (lop.equals(hs.getLop())) {
				hs.hienThiThongTin();
			}
		}
	}
}