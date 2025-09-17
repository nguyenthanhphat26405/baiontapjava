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
public class CongNhan extends CanBo {
    private String bac_115;
	public CongNhan() {
	}
	// ham khoi tao co doi so
	public CongNhan(String hoten_115, String ngaySinh_115, String gioiTinh_115, String diaChi_115, String bac_115) {
		super(hoten_115, ngaySinh_115, gioiTinh_115, diaChi_115);
		this.bac_115 = bac_115;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\nNhap bac= ");
		bac_115 = sc.nextLine();
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\nBac= " + bac_115);
	}
}
