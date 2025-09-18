/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class tuyenSinh {
	// thuoc tinh
	private ArrayList<thiSinh> dsts_115;

	// phuong thuc
	public tuyenSinh() {
		dsts_115 = new ArrayList<thiSinh>(10);
	}

	// ham them 1 thi sinh
	public void themThiSinh(thiSinh ts) {
		dsts_115.add(ts);
	}

	// nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		thiSinh ts;
		int chon;

		System.out.print("Nhap vao so luong thi sinh=");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon = sc.nextInt();

			switch (chon) {
			case 1:
				ts = new khoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts = new khoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts = new khoiC("Van", "Su", "Dia");
				break;
			default:
				ts = new khoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts.nhapThongTin(sc);
			themThiSinh(ts);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dsts_115.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts_115.get(i).hienThiThongTin();
		}
	}

	// tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh(int soBaoDanh) {
		for (thiSinh ts : dsts_115) {
			if (ts.getSoBD() == soBaoDanh) {
				ts.hienThiThongTin();
			}
		}
        }
}

