/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh_115;
        
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu_115, String tenNXB_115, int soBanPhatHanh_115, String ngayPhatHanh_115) {
		super(maTaiLieu_115, tenNXB_115, soBanPhatHanh_115);
		this.ngayPhatHanh_115 = ngayPhatHanh_115;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\nNhap ngay phat hanh=");
		ngayPhatHanh_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\nNgay phat hanh="+ ngayPhatHanh_115);
	}
    
}
