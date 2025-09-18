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
public class TaiLieu {
    private String maTaiLieu_115;
	private String tenNXB_115;
	private int soBanPhatHanh_115;

	public TaiLieu() {
	}
	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu_115 = maTaiLieu;
		this.tenNXB_115 = tenNXB;
		this.soBanPhatHanh_115 = soBanPhatHanh;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu= ");
		maTaiLieu_115 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban= ");
		tenNXB_115 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh=");
		soBanPhatHanh_115 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu= " + maTaiLieu_115);
		System.out.println("\tTen nha xuat ban= " + tenNXB_115);
		System.out.println("\tSo ban phat hanh= " + soBanPhatHanh_115);
	}

	// ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu_115;
	}
}
