/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class sinhVien {
    // thuoc tinh
	protected String hoTen_115;
	protected String maSV_115;
	protected String ngaySinh_115;
	protected String lop_115;

	public sinhVien() {

	}
	// ham khoi tao co doi so
	public sinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen_115 = hoTen;
		this.maSV_115 = maSV;
		this.ngaySinh_115 = ngaySinh;
		this.lop_115 = lop;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\nNhap ho ten= ");
		hoTen_115 = sc.nextLine();

		System.out.print("\nNhap ma sinh vien= ");
		maSV_115 = sc.nextLine();

		System.out.print("\nNhap ngay sinh= ");
		ngaySinh_115 = sc.nextLine();

		System.out.print("\nNhap lop= ");
		lop_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\nHo ten= " + hoTen_115);
		System.out.println("\nNgay sinh=" + ngaySinh_115);
		System.out.println("\nMa sinh vien=" + maSV_115);
		System.out.println("\nLop=" + lop_115);
	}
}
