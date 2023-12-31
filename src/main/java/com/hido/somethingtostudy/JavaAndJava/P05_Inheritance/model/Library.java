package com.hido.somethingtostudy.JavaAndJava.P05_Inheritance.model;

import java.util.Scanner;

public class Library {
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int namXuatBan;
    private int soLuong;
    private Location viTri;

    public Library() {
    }

    public Library(String maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soLuong, Location viTri) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Location getViTri() {
        return viTri;
    }

    public void setViTri(Location viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "Library{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", soLuong=" + soLuong +
                ", viTri=" + viTri +
                '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.println("Nam xuat ban: ");
        namXuatBan = Integer.valueOf(sc.nextLine());
        System.out.println("So luong: ");
        soLuong = Integer.valueOf(sc.nextLine());
        System.out.println("Nhap vi tri: ");
        System.out.println("Nhap ke: ");
        String ke = sc.nextLine();
        System.out.println("Nhap so tang: ");
        String tang = sc.nextLine();
        viTri = new Location(ke, tang);
    }
}
