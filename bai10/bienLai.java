/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class bienLai extends khachHang {
	// Thuoc tinh
	private int chiSoMoi_115;
	private int chiSoCu_115;
	private double tien_115;

	public bienLai() {
	}
	// Ham khoi tao co doi so
	public bienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi_115 = chiSoMoi;
		this.chiSoCu_115 = chiSoCu;
		this.tien_115 = tien;
	}

	public bienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo_115 = tenChuHo;
		this.chiSoMoi_115 = chiSoMoi;
		this.chiSoCu_115 = chiSoCu;
		this.tien_115 = tien;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\nNhap chi so moi= ");
		chiSoMoi_115 = sc.nextInt();
		sc.nextLine();
		System.out.print("\nNhap chi so cu= ");
		chiSoCu_115 = sc.nextInt();
		sc.nextLine();
		tien_115 = (chiSoMoi_115 - chiSoCu_115) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi_115);
		System.out.println("\tChi so cu: " + chiSoCu_115);
		System.out.println("\tTien: : " + tien_115);
	}
}