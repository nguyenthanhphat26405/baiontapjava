/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class QuanLySach {
    private ArrayList<TaiLieu> dstl_115;

	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl_115 = new ArrayList<TaiLieu>(10);
	}

	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl) {
		dstl_115.add(tl);
	}

	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc) {
		int chon;
		String stop;
		TaiLieu tl;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao)= ");
			chon = sc.nextInt();
			sc.nextLine();

			switch (chon) {
			case 1:
				tl = new Sach();
				break;
			case 2:
				tl = new TapChi();
				break;
			case 3:
				tl = new Bao();
				break;

			default:
				tl = new Sach();
				break;
			}

			tl.nhapThongTin(sc);
			themTaiLieu(tl);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k)= ");
			stop = sc.nextLine();
		} while (stop.equals("c"));
	}

	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL) {
		for (TaiLieu tl : dstl_115) {
			if (maTL.equals(tl.getMaTaiLieu())) {
				tl.hienThiThongTin();
			}
		}
	}

	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai) {
		for (TaiLieu tl : dstl_115) {
			if (loai.equals("Sach") && (tl instanceof Sach)) {
				tl.hienThiThongTin();
			} else if (loai.equals("TapChi") && (tl instanceof TapChi)) {
				tl.hienThiThongTin();
			} else if (loai.equals("Bao") && (tl instanceof Bao)) {
				tl.hienThiThongTin();
			}
		}
	}
}
