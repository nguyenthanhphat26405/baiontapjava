/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class CanBo {
    
        private String hoTen_115;
	private String ngaySinh_115;
	private String gioiTinh_115;
	private String diaChi_115;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoten, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen_115 = hoten;
		this.ngaySinh_115 = ngaySinh;
		this.gioiTinh_115 = gioiTinh;
		this.diaChi_115 = diaChi;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_115 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh_115 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh_115 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_115);
		System.out.println("\tNgay sinh: " + ngaySinh_115);
		System.out.println("\tGioi tinh: " + gioiTinh_115);
		System.out.println("\tDia chi: " + diaChi_115);
	}

	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen_115;
	}
}

