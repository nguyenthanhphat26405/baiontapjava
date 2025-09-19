/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author THANH PHAT
 */
public class phanso {
    private int tu_115;
    private int mau_115;

    public phanso() {
        tu_115 = 0;
        mau_115 = 1;
    }

    // ham khoi tao co doi so
    public phanso(int tu, int mau) {
        if (mau == 0) {
            throw new IllegalArgumentException("Mau so khong the bang 0");
        }
        this.tu_115 = tu;
        this.mau_115 = mau;
    }

    // ham nhap
    public void nhap(Scanner sc) {
        int a, b;
        do {
            System.out.print("Nhap tu so = ");
            a = sc.nextInt();
            System.out.print("Nhap mau so = ");
            b = sc.nextInt();

            if (b == 0) {
                System.out.println("Mau so khong the bang 0. Nhap lai!");
            } else {
                tu_115 = a;
                mau_115 = b;
            }
        } while (b == 0);
    }

    // ham hien thi (tren 1 dong)
    public void hienThiPS() {
        toiGianPS();
        if (mau_115 < 0) { // dua dau ve tu
            tu_115 = -tu_115;
            mau_115 = -mau_115;
        }
        System.out.print(tu_115 + "/" + mau_115);
    }

    // toString de in truc tiep
    @Override
    public String toString() {
        int tu = tu_115, mau = mau_115;
        int uscln = timUSCLN(Math.abs(tu), Math.abs(mau));
        tu /= uscln;
        mau /= uscln;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
        return tu + "/" + mau;
    }

    // ham cong
    public phanso cong(phanso ps2) {
        int a = tu_115 * ps2.mau_115 + ps2.tu_115 * mau_115;
        int b = mau_115 * ps2.mau_115;
        return new phanso(a, b);
    }

    // ham tru
    public phanso tru(phanso ps2) {
        int a = tu_115 * ps2.mau_115 - ps2.tu_115 * mau_115;
        int b = mau_115 * ps2.mau_115;
        return new phanso(a, b);
    }

    // ham nhan
    public phanso nhan(phanso ps2) {
        int a = tu_115 * ps2.tu_115;
        int b = mau_115 * ps2.mau_115;
        return new phanso(a, b);
    }

    // ham chia
    public phanso chia(phanso ps2) {
        int a = tu_115 * ps2.mau_115;
        int b = mau_115 * ps2.tu_115;
        return new phanso(a, b);
    }

    // ham tim uscln
    private int timUSCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // ham toi gian
    public void toiGianPS() {
        int x = timUSCLN(Math.abs(tu_115), Math.abs(mau_115));
        tu_115 /= x;
        mau_115 /= x;
    }
}

