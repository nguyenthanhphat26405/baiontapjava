/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class hocSinh extends nguoi {
	// thuoc tinh
	private String lop_115;
	private String khoHoc_115;
	private String kyHoc_115;

	public hocSinh() {
	}

	// ham khoi tao co doi so
	public hocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen_115 = hoTen;
		this.lop_115 = lop;
		this.khoHoc_115 = khoaHoc;
		this.kyHoc_115 = kyHoc;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\nNhap lopn ");
		lop_115 = sc.nextLine();

		System.out.print("\nNhap khoa hoc= ");
		khoHoc_115 = sc.nextLine();

		System.out.print("\nNhap ky hoc= ");
		kyHoc_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\nLop= " + lop_115);
		System.out.println("\nKhoa hoc= " + khoHoc_115);
		System.out.println("\nKy hoc= " + kyHoc_115);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop_115;
	}
}
