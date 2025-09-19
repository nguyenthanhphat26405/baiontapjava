/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class nguoi {
    protected String hoTen_115;
	protected Date ngaySinh_115;
	protected String queQuan_115;

	public nguoi() {
	}
	// ham khoi tao co doi so
	public nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen_115 = hoTen;
		this.ngaySinh_115 = ngaySinh;
		this.queQuan_115 = queQuan;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\nNhap ho ten= ");
		hoTen_115 = sc.nextLine();

		System.out.print("\nNhap ngay sinh=");
		String strDate = sc.nextLine();
		ngaySinh_115 = strToDate(strDate);

		System.out.print("\nNhap que quan= ");
		queQuan_115 = sc.nextLine();
	}

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

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\nHo ten= " + hoTen_115);
		System.out.println("\nNgay sinh= " + ngaySinh_115);
		System.out.println("\nQue quan= " + queQuan_115);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan_115;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh_115;
	}
}
