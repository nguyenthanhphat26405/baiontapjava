/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class hoDan extends nguoi {
	// thuoc tinh
	private int soNguoi_115;
	private int soNha_115;
	private nguoi[] list_115;
        
	public hoDan() {
		list_115 = new nguoi[10];
	}

	// ham khoi tao co doi so
	public hoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi_115 = soNguoi;
		this.soNha_115 = soNha;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\nNhap so nguoi= ");
		soNguoi_115 = sc.nextInt();
		sc.nextLine();
		System.out.print("\nNhap so nha= ");
		soNha_115 = sc.nextInt();
		sc.nextLine();
		System.out.println("\nNhap thong tin cho tung nguoi trong ho=");
		for (int i = 0; i < soNguoi_115; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list_115[i] = new nguoi();
			list_115[i].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\nSo nguoi= " + soNguoi_115);
		System.out.println("\nSo nha= " + soNha_115);
		System.out.println("\nThong tin cua tung nguoi trong gia dinh=");
		for (int i = 0; i < soNguoi_115; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list_115[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public nguoi[] getList() {
		return list_115;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi_115;
	}
}
