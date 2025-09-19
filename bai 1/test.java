/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import bai1.phanso;
import java.util.Scanner;
/**
 *
 * @author THANH PHAT
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phanso ps1 = new phanso();
        phanso ps2 = new phanso();
        // nhap phan so
        System.out.println("Nhap vao phan so thu nhat:");
        ps1.nhap(sc);
        System.out.println("Nhap vao phan so thu hai:");
        ps2.nhap(sc);
        // hien thi phan so
        System.out.println("Phan so 1 = " + ps1);
        System.out.println("Phan so 2 = " + ps2);
        // tinh cong tru nhan chia
        phanso psTong = ps1.cong(ps2);
        phanso psHieu = ps1.tru(ps2);
        phanso psTich = ps1.nhan(ps2);
        phanso psThuong = ps1.chia(ps2);

        System.out.println("Tong = " + psTong);
        System.out.println("Hieu = " + psHieu);
        System.out.println("Tich = " + psTich);
        System.out.println("Thuong = " + psThuong);

        // toi gian phan so 1 va 2
        ps1.toiGianPS();
        ps2.toiGianPS();
        System.out.println("Phan so 1 toi gian = " + ps1);
        System.out.println("Phan so 2 toi gian = " + ps2);

        sc.close();
    }
}
