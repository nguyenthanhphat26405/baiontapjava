/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class khachTro extends nguoi {
	// thuoc tinh
	private int soNgayTro_115;
	private String loaiPhong_115;
	private double giaPhong_115;

	public khachTro() {
	}
	// ham khoi tao co doi so
	public khachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen_115 = hoTen;
		this.CMND_115 = CMND;
		this.soNgayTro_115 = soNgayTro;
		this.loaiPhong_115 = loaiPhong;
		this.giaPhong_115 = giaPhong;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\nNhap so ngay tro= ");
		soNgayTro_115 = sc.nextInt();
		sc.nextLine();
		System.out.print("\nNhap loai phong= ");
		loaiPhong_115 = sc.nextLine();
		System.out.print("\nNhap gia phong= ");
		giaPhong_115 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\nSo ngay tro= " + soNgayTro_115);
		System.out.println("\nLoai phong= " + loaiPhong_115);
		System.out.println("\nGia phong= " + giaPhong_115);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro_115;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong_115;
	}
    
}
