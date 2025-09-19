/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class quanLy {
private ArrayList<theMuon> ds_115;


	public quanLy() {
		ds_115 = new ArrayList<theMuon>(10);
	}

	// ham them the muon vao danh sach
	public void themTheMuon(theMuon theMuon) {
		ds_115.add(theMuon);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		theMuon theMuon;

		System.out.print("Nhap vao so luong the muon= ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach=");
		for (int i = 0; i < n; i++) {
			System.out.println("The muon thu " + (i + 1) + " la:");
			theMuon = new theMuon();
			theMuon.nhapThongTin(sc);
			themTheMuon(theMuon);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSachTraCuoiThang() {
		for (theMuon the : ds_115) {
			if (the.getHanTra().getDate() == 31 || the.getHanTra().getDate() == 30) {
				the.hienThiThongTin();
			}
		}
	}
}
