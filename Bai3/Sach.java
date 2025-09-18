/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia_115;
	private int soTrang_115;

	public Sach() {
	}
	// ham khoi tao co doi so
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia_115 = tacGia;
		this.soTrang_115 = soTrang;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\nNhap tac gia= ");
		tacGia_115 = sc.nextLine();
		System.out.print("\nNhap so trang= ");
		soTrang_115 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ntac gia= " + tacGia_115);
		System.out.println("\nSo trang= " + soTrang_115);
	}
}
