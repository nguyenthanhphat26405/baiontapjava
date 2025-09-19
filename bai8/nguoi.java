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
public class nguoi {
    protected String hoTen_115;
	protected String ngaySinh_115;
	protected String queQuan_115;

	public nguoi() {
	}
	// ham khoi tao co doi so
	public nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen_115 = hoTen;
		this.ngaySinh_115 = ngaySinh;
		this.queQuan_115 = queQuan;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\nNhap ho ten= ");
		hoTen_115 = sc.nextLine();
		System.out.print("\nNhap ngay sinh= ");
		ngaySinh_115 = sc.nextLine();
		System.out.print("\nNhap que quan=");
		queQuan_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\nHo ten= " + hoTen_115);
		System.out.println("\nNgay sinh= " + ngaySinh_115);
		System.out.println("\nQue quan= " + queQuan_115);
	}
}
