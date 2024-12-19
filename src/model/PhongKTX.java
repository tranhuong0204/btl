/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author huong
 */
public class PhongKTX {

   private String tenPhong;
    private String maPhong;
    private int loaiPhong;
    private int soSVToiDa;
    private int soSVHienTai;
    private String tinhTrang;
    private int giaPhong;
    private static List<SinhVienKTX> dsSV;

    public void xoaSinhVien(SinhVienKTX e) {
        this.dsSV.remove(e);
        this.soSVHienTai = this.dsSV.size();
    }

    public void xoaSinhVien(int pos) {
        this.dsSV.remove(pos);
        this.soSVHienTai = this.dsSV.size();
    }

    public void themSinhVien(SinhVienKTX e) {
        //this.dsSV.add(new SinhVienKTX(a,a,a,a,Nữ,a,))
        this.dsSV.add(e);
        this.soSVHienTai = this.dsSV.size();
    }
//    public static void main(String[] args) {
//        dssv.ad
//    }
    @Override
    public String toString() {
        String result;
        result = String.format("%s, %s, %s, %s, %s, %s, %s\n", maPhong, tenPhong, loaiPhong, soSVToiDa, soSVHienTai, tinhTrang, giaPhong);
        for (int i = 0; i < this.soSVHienTai; i++) {
            result += dsSV.get(i).toString();
        }
        return result;
    }

    public PhongKTX(String tenPhong, String maPhong, int loaiPhong, int soSVToiDa, int soSVHienTai, String tinhTrang, int giaPhong) {
        this.tenPhong = tenPhong;
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.soSVToiDa = soSVToiDa;
        this.soSVHienTai = soSVHienTai;
        this.tinhTrang = tinhTrang;
        this.giaPhong = setGiaPhong();
    }

    
    public PhongKTX(String tenPhong, String maPhong, int loaiPhong, int soSVToiDa, int soSVHienTai, String tinhTrang,
            int tang, List<SinhVienKTX> dsSV) {
        this.tenPhong = tenPhong;
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.soSVToiDa = soSVToiDa;
        this.soSVHienTai = soSVHienTai;
        this.tinhTrang = tinhTrang;
        this.giaPhong = giaPhong;
        this.dsSV = dsSV;
    }

    public PhongKTX() {
    }
    
    public String getTenPhong() {
        return tenPhong;
    }
    public String getMaPhong() {
        return maPhong;
    }
    public int getLoaiPhong() {
        return loaiPhong;
    }
    public int getSoSVToiDa() {
        return soSVToiDa;
    }
    public int getSoSVHienTai() {
        return soSVHienTai;
    }
    public String getTinhTrang() {
        return tinhTrang;
    }

    public int getGiaPhong() {
        return giaPhong;
    }
    
    public List<SinhVienKTX> getDsSV() {
        return dsSV;
    }
    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    public void setLoaiPhong(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }
    public void setSoSVToiDa(int soSVToiDa) {
        this.soSVToiDa = soSVToiDa;
    }
    public void setSoSVHienTai(int soSVHienTai) {
        this.soSVHienTai = soSVHienTai;
    }
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void setGiaPhong(int giaPhong) {
        if(loaiPhong == 1){
            giaPhong = 1000000;
        }
        if(loaiPhong == 2){
            giaPhong = 800000;
        }
        if(loaiPhong == 3){
            giaPhong = 600000;
        }
    }
    
    public void setDsSV(List<SinhVienKTX> dsSV) {
        this.dsSV = dsSV;
    }
}
