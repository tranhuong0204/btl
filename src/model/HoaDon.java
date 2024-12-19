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
public class HoaDon {

    private String maHD;
    private String maPhong;
    private int tienPhong;
    private int soDien;
    private int donGiaDien;
    private int soNuoc;
    private int doGiaNuoc;
    private int tienWifi;
    private int tienVS;
    private int tong;

    public HoaDon(String maHD, String maPhong, int soDien, int donGiaDien, int soNuoc, int doGiaNuoc, int tienWifi, int tienVS) {
        this.maHD = maHD;
        this.maPhong = maPhong;
        this.tienPhong = layTienPhong(maPhong);
        this.soDien = soDien;
        this.donGiaDien = donGiaDien;
        this.soNuoc = soNuoc;
        this.doGiaNuoc = doGiaNuoc;
        this.tienWifi = tienWifi;
        this.tienVS = tienVS;
        //this.tong =
                tinhTong();
    }

    public HoaDon() {
    }

    public HoaDon(String maHD, String maPhong, int tienPhong, int soDien, int donGiaDien, int soNuoc, int doGiaNuoc, int tienWifi, int tienVS, int tong) {
        this.maHD = maHD;
        this.maPhong = maPhong;
        this.tienPhong = tienPhong;
        this.soDien = soDien;
        this.donGiaDien = donGiaDien;
        this.soNuoc = soNuoc;
        this.doGiaNuoc = doGiaNuoc;
        this.tienWifi = tienWifi;
        this.tienVS = tienVS;
        this.tong = tong;
    }

    public int layTienPhong(String maPhong) {
        NewPhongKTX dao = new NewPhongKTX();
        List<NewPhongKTX> listPhong = dao.docPhongKTXFile("PhongKTX.txt");
        for (NewPhongKTX phong : listPhong) {
            if (phong.getMaPhong().equalsIgnoreCase(maPhong)) {
                //return phong.getGiaPhong(); // Trả về tiền phòng
                tienPhong = phong.getGiaPhong();
            }
        }
        //return -1; // Trả về -1 nếu không tìm thấy mã phòng
        return tienPhong;
    }

//    public void ganTienPhong(HoaDon hoaDon) {
//        int tienPhong = layTienPhong(hoaDon.getMaPhong());
//        if (tienPhong != -1) {
//            hoaDon.setTienPhong(tienPhong); // Gán tiền phòng cho hóa đơn
//        } else {
//            System.out.println("Không tìm thấy mã phòng: " + hoaDon.getMaPhong());
//        }
//    }

    public int tinhTong() {
           int tong = tienPhong+ soDien * donGiaDien + soNuoc * doGiaNuoc + tienWifi + tienVS;
           return tong;
    }

    @Override
    public String toString() {
        return maHD + "," + maPhong + "," + tienPhong + "," + soDien + "," + donGiaDien + "," + soNuoc + "," + doGiaNuoc + "," + tienWifi + "," + tienVS+ "," + tinhTong();
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(int tienPhong) {
        this.tienPhong = tienPhong;
    }

    public int getSoDien() {
        return soDien;
    }

    public void setSoDien(int soDien) {
        this.soDien = soDien;
    }

    public int getDonGiaDien() {
        return donGiaDien;
    }

    public void setDonGiaDien(int donGiaDien) {
        this.donGiaDien = donGiaDien;
    }

    public int getSoNuoc() {
        return soNuoc;
    }

    public void setSoNuoc(int soNuoc) {
        this.soNuoc = soNuoc;
    }

    public int getDoGiaNuoc() {
        return doGiaNuoc;
    }

    public void setDoGiaNuoc(int doGiaNuoc) {
        this.doGiaNuoc = doGiaNuoc;
    }

    public int getTienWifi() {
        return tienWifi;
    }

    public void setTienWifi(int tienWifi) {
        this.tienWifi = tienWifi;
    }

    public int getTienVS() {
        return tienVS;
    }

    public void setTienVS(int tienVS) {
        this.tienVS = tienVS;
    }

    public int getTong() {
        return tong;
    }

}
