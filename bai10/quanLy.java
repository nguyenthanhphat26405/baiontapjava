/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class quanLy {
	private ArrayList<bienLai> ds_115;

	public quanLy() {
		ds_115 = new ArrayList<bienLai>(10);
	}

	// Ham them bien lai vao danh sach
	public void themBienLai(bienLai bienLai) {
		ds_115.add(bienLai);
	}

	// Ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		bienLai bienLai;
		System.out.print("Nhap vao so luong bien lai= ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao danh sach bien lai=");
		for (int i = 0; i < n; i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la=");
			bienLai = new bienLai();
			bienLai.nhapThongTin(sc);

			themBienLai(bienLai);
		}
	}

	// Ham hien thi danh sach
	public void hienThiDanhSach() {
		for (int i = 0; i < ds_115.size(); i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			ds_115.get(i).hienThiThongTin();
			System.out.println();
		}
	}
}
