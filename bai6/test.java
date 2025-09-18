/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import bai6.khachSan;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class test {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		khachSan ql = new khachSan();

		ql.nhapDanhSach(sc);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd = sc.nextInt();

		System.out.println("==> Tong tien la: " + ql.tinhTien(cmnd));

		sc.close();
	}
}
