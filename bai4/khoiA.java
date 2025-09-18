/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class khoiA extends thiSinh {
	// thuoc tinh
	private String mon1_115;
	private String mon2_115;
	private String mon3_115;

	// phuong thuc
	// ham khoi tao khong doi so
	public khoiA() {

	}

	// ham khoi tao co doi so
	public khoiA(String mon1, String mon2, String mon3) {
		this.mon1_115 = mon1;
		this.mon2_115 = mon2;
		this.mon3_115 = mon3;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\nNhap mon 1= ");
		mon1_115 = sc.nextLine();
		System.out.print("\nNhap mon 2= ");
		mon2_115 = sc.nextLine();
		System.out.print("\nNhap mon 3= ");
		mon3_115 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\nTo hop mon thi: " + mon1_115 + " - " + mon2_115 + " - " + mon3_115);
	}
    
}
