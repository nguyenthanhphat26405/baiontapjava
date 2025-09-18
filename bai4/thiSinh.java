/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class thiSinh {
    // thuoc tinh
	private int soBD_115;
	private String hoTen_115;
	private String diaChi_115;
	private String dienUuTien_115;

	public thiSinh() {
	}

	// ham khoi tao co doi so
	public thiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
		this.soBD_115 = soBD;
		this.hoTen_115 = hoTen;
		this.diaChi_115 = diaChi;
		this.dienUuTien_115 = dienUuTien;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\nNhap so bao danh= ");
		soBD_115 = sc.nextInt();
		sc.nextLine();
		System.out.print("\nNhap ho ten= ");
		hoTen_115 = sc.nextLine();
		System.out.print("\nNhap dia chi= ");
		diaChi_115 = sc.nextLine();
		System.out.print("\nNhap dien uu tien= ");
		dienUuTien_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\nSo bao danh= " + soBD_115);
		System.out.println("\nHo ten= " + hoTen_115);
		System.out.println("\nDia chi= " + diaChi_115);
		System.out.println("\nDien uu tien= " + dienUuTien_115);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD_115;
	}
}
