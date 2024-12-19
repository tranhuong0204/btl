/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huong
 */
public class SinhVien {
    protected String masv;
    protected String hoTen;
    protected String maPhong;
    protected String queQuan;
    protected String gioiTinh;
    protected String sdt;
    private String ngayDangKy;
    private String ngayHetHan;

    public SinhVien() {
    }

    public SinhVien(String masv) {
        this.masv = masv;
    }

    public SinhVien(String masv, String hoTen, String maPhong, String queQuan, String gioiTinh, String sdt,String ngayDangKy, String ngayHetHan) {
        this.masv = masv;
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.ngayDangKy = ngayDangKy;
        this.ngayHetHan = ngayHetHan;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return  masv+","+ hoTen+ "," + maPhong +","+ queQuan +","+ gioiTinh+","+ sdt+","+ ngayDangKy+","+ ngayHetHan;
    }

    public SinhVien(String maSV, String hoTen) {
        this.masv = masv;
        this.hoTen = hoTen;
    }
    
    public SinhVien(String msv, String hoTen, String gioiTinh, String ngaySinh) {
        this.masv = masv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }
    
    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    SinhVien sinhVien = (SinhVien) obj;
    return masv != null && masv.equals(sinhVien.masv);
}

@Override
public int hashCode() {
    return masv != null ? masv.hashCode() : 0;
}
}
