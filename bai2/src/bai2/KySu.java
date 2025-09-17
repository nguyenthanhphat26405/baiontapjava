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
public class KySu extends CanBo{
    private String nganhDaoTao_115;
	public KySu() {
	}

	// ham khoi tao co doi so
	public KySu(String hoten_115, String ngaySinh_115, String gioiTinh_115, String diaChi_115, String nganhDaoTao_115) {
		super(hoten_115, ngaySinh_115, gioiTinh_115, diaChi_115);
		this.nganhDaoTao_115 = nganhDaoTao_115;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\nNhap nganh dao tao= ");
		nganhDaoTao_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\nNganh dao tao= " + nganhDaoTao_115);
	}
}
