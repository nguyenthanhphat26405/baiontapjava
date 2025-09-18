/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class nguoi {
    private String hoTen_115;
	private Date ngaySinh_115;
	private String ngheNghiep_115;

	public nguoi() {
	}
	// ham khoi tao co doi so
	public nguoi(String hoTen, Date ngaySinh, String ngheNghiep) {
		this.hoTen_115 = hoTen;
		this.ngaySinh_115 = ngaySinh;
		this.ngheNghiep_115 = ngheNghiep;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc) {
		System.out.print("\nNhap ho ten= ");
		hoTen_115 = sc.nextLine();
		System.out.print("\nNhap ngay sinh= ");
		String strDate = sc.nextLine();
		ngaySinh_115 = strToDate(strDate);
		System.out.print("\nNhap nghe nghiep= ");
		ngheNghiep_115 = sc.nextLine();
	}

	// ham thuc hien chuyen string sang date
	private Date strToDate(String strDate) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\nHo ten= " + hoTen_115);
		System.out.println("\nNgay sinh= " + dateToString(ngaySinh_115));
		System.out.println("\nNghe nghiep= " + ngheNghiep_115);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = sdf.format(date);

		return strDate;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh_115;
	}
}
