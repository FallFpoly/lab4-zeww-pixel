/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin san pham 1:");
        System.out.print("Ten san pham: ");
        String ten1 = sc.nextLine();
        System.out.print("Don gia: ");
        double gia1 = sc.nextDouble();
        System.out.print("Giam gia: ");
        double giam1 = sc.nextDouble();
        sc.nextLine(); 

        bai3 sp1 = new bai3(ten1, gia1, giam1);

        System.out.println("\nNhap thong tin san pham 2:");
        System.out.print("Ten san pham: ");
        String ten2 = sc.nextLine();
        System.out.print("Don gia: ");
        double gia2 = sc.nextDouble();

        bai3 sp2 = new bai3(ten2, gia2);

        System.out.println("\nThong tin san pham 1:");
        sp1.xuat();

        System.out.println("Thong tin san pham 2:");
        sp2.xuat();

        sc.close(); 
    }
          private String tenSp;
    private double donGia;
    private double giamGia;

    
    public bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    
    public bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

   
    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    
    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
        System.out.println("----------------------------");
    }
}
