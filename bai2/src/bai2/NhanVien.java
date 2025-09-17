/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class NhanVien extends CanBo{
    private String congViec_115;

	// phuong thuc
	// ham khoi tao khong doi so
	public NhanVien() {

	}

	// ham khoi tao co doi so
	public NhanVien(String hoten_115, String ngaySinh_115, String gioiTinh_115, String diaChi_115, String congViec_115) {
		super(hoten_115, ngaySinh_115, gioiTinh_115, diaChi_115);
		this.congViec_115 = congViec_115;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\nNhap cong viec= ");
		congViec_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\nCong viec= " + congViec_115);
	}
}
