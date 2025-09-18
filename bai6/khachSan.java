/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class khachSan {
// thuoc tinh
	private ArrayList<khachTro> ds_115;

	// phuong thuc
	// ham khoi tao
	public khachSan() {
		ds_115 = new ArrayList<khachTro>(10);
	}

	// ham them khach tro vao khach san
	public void themKhachTro(khachTro kt) {
		ds_115.add(kt);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		khachTro khach;

		System.out.print("Nhap vao so luong khach= ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro=");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach = new khachTro();
			khach.nhapThongTin(sc);
			themKhachTro(khach);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (khachTro khach : ds_115) {
			khach.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND) {
		double tien = 0;

		for (khachTro khach : ds_115) {
			if (khach.getCMND() == CMND) {
				tien = khach.getSoNgayTro() * khach.getGiaPhong();
			}
		}

		return tien;
	}
    
}
