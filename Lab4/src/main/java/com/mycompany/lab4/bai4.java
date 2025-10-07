/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai4 {
    private String tenSp;
    private double donGia;
    private double giamGia;

    
    public bai4(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Constructor 2 tham số (giam gia mac dinh = 0)
    public bai4(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    // Getter cho tenSp
    public String getTenSp() {
        return tenSp;
    }

    // Setter cho tenSp
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    // Getter cho donGia
    public double getDonGia() {
        return donGia;
    }

    // Setter cho donGia
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Getter cho giamGia
    public double getGiamGia() {
        return giamGia;
    }

    // Setter cho giamGia
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Phương thức tính thuế nhập khẩu (private)
    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Phương thức xuất thông tin (public)
    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
        System.out.println("----------------------------");
    }
}    

