/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import bai10.quanLy;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class using {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		quanLy ql = new quanLy();
		ql.nhapDanhSach(sc);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la=");
		ql.hienThiDanhSach();

		sc.close();
	}
}
