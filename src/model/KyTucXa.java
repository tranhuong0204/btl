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
public class KyTucXa {
    private int soTang;
    private int soPhong;
    private List<PhongKTX> dsPhongKTX;
    public KyTucXa(int soTang, int soPhong, List<PhongKTX> dsPhongKTX) {
        this.soTang = soTang;
        this.soPhong = soPhong;
        this.dsPhongKTX = dsPhongKTX;
    }
    public KyTucXa() {
    }
    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }
    public void setDsPhongKTX(List<PhongKTX> dsPhongKTX) {
        this.dsPhongKTX = dsPhongKTX;
    }
    public int getSoTang() {
        return soTang;
    }
    public int getSoPhong() {
        return soPhong;
    }
    public List<PhongKTX> getDsPhongKTX() {
        return dsPhongKTX;
    }
}
