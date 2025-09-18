/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import bai5.khuPho;
import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class test {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		khuPho qlkp = new khuPho();

		qlkp.nhapDanhSach(sc);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp.timKiemThongTin();
	}

}
