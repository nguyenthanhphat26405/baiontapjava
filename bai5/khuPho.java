/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class khuPho{
    private ArrayList<hoDan> dshd_115;

	// phuong thuc
	// ham khoi tao
	public khuPho() {
		dshd_115 = new ArrayList<hoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(hoDan hoDan) {
		dshd_115.add(hoDan);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc) {
		hoDan hoDan;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan = new hoDan();
			hoDan.nhapThongTin(sc);
			themHoDan(hoDan);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n = dshd_115.size();

		for (int i = 0; i < n; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd_115.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;

		nguoi[] dstv = null;

		for (hoDan hoDan : dshd_115) {
			dstv = hoDan.getList();
			for (int i = 0; i < hoDan.getSoNguoi(); i++) {
				if (namHienTai - (dstv[i].getNgaySinh().getYear() + 1900) == 80) {
					hoDan.hienThiThongTin();
				}
			}
		}
	}
}
