/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class khachHang {
	protected String tenChuHo_115;
	protected int soNha_115;
	protected String maCongTo_115;

	public khachHang() {
	}

	// Ham khoi tao co doi so
	public khachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo_115 = tenChuHo;
		this.soNha_115 = soNha;
		this.maCongTo_115 = maCongTo;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\nNhap ten chu ho= ");
		tenChuHo_115 = sc.nextLine();
		System.out.print("\nNhap so nha=");
		soNha_115 = sc.nextInt();
		sc.nextLine();
		System.out.print("\nNhap ma cong to= ");
		maCongTo_115 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\nTen chu ho= " + tenChuHo_115);
		System.out.println("\nSo nha= " + soNha_115);
		System.out.println("\nMa cong to= " + maCongTo_115);
	}
}

