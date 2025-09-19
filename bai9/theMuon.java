/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class theMuon extends sinhVien {
	// thuoc tinh
	private int soMuon_115;
	private Date ngayMuon_115;
	private Date hanTra_115;
	private String soHieu_115;

	public theMuon() {

	}

	// ham khoi tao co doi so
	public theMuon(int soMuon, Date ngayMuon, String soHieu) {
		this.soMuon_115 = soMuon;
		this.ngayMuon_115 = ngayMuon;
		this.soHieu_115 = soHieu;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\nNhap so muon= ");
		soMuon_115 = sc.nextInt();
		sc.nextLine();

		System.out.print("\nNhap ngay muon= ");
		String strNgayMuon = sc.nextLine();
		ngayMuon_115 = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra_115 = strToDate(strNgayTra);

		System.out.println("\nNhap so hieu= ");
		soHieu_115 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\nSo phieu muon= " + soMuon_115);
		System.out.println("\nNgay muon= " + ngayMuon_115);
		System.out.println("\nHan tra= " + hanTra_115);
		System.out.println("\nSo hieu= " + soHieu_115);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra_115;
	}
}

