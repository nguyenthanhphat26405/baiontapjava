/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import bai2.QLCB;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class test {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QLCB qlcb = new QLCB();

		qlcb.nhapDanhSach(sc);

		System.out.print("Nhap vao ho ten can tim kiem= ");
		String name = sc.nextLine();

		qlcb.timKiemCanBo(name);

		// huy sc
		sc.close();
	}
}
