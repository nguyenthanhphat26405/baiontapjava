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
public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh_115;
	private int thangPhatHanh_115;
	
        public TapChi() {

	}
	// ham khoi tao co doi so
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh_115 = soBanPhatHanh;
		this.thangPhatHanh_115 = thangPhatHanh;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh_115 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh_115 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh_115);
		System.out.println("\tThang phat hanh: " + thangPhatHanh_115);
	}
}
