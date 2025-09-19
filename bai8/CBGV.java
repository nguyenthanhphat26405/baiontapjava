/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class CBGV extends nguoi {
	// thuoc tinh
	private double luongCung_115;
	private double thuong_115;
	private double phat_115;
	private double luongThucLinh_115;

	public CBGV() {
	}
	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\nNhap luong cung= ");
		luongCung_115 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\nNhap thuong= ");
		thuong_115 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\nNhap phat= ");
		phat_115 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh_115 = luongCung_115 + thuong_115 - phat_115;
	}
	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung_115);
		System.out.println("\tThuong: " + thuong_115);
		System.out.println("\tPhat: " + phat_115);
		System.out.println("\tLuong thuc linh: " + luongThucLinh_115);
	}
	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh_115;
	}
}