/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huong
 */
public class PhongktxDAO {

    public void capNhatSoLuongSV(String maPhong) {
        SinhVienDAO sv = new SinhVienDAO();
        NewPhongKTX p = new NewPhongKTX();
        List<NewPhongKTX> listPhongKTX = p.docPhongKTXFile("PhongKTX.txt");

        List<SinhVien> dsSV = sv.docFile();
        // Tìm phòng và cập nhật số lượng sinh viên hiện tại
        int d = 0;
        for (SinhVien sv1 : dsSV) {
            if (sv1.getMaPhong().equalsIgnoreCase(maPhong)) {
                d++;
            }
        }
        p.setSoSVHienTai(d);
        p.capNhatTrangThai();
        //phong.tinhsosvhientai(tsoSVHienTaiMoi);
        // Ghi lại danh sách phòng KTX vào file
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("PhongKTX.txt"), "UTF-8"))) {
            for (NewPhongKTX phong : listPhongKTX) {
                bw.write(phong.getMaPhong() + "," + phong.getLoaiPhong() + "," + phong.getSoSVToiDa() + ","
                        + phong.getSoSVHienTai() + "," + phong.getTinhTrang());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int demSoPhongTheoTinhTrang(String tt) {
        int d = 0;
        NewPhongKTX p = new NewPhongKTX();
        //NewPhongKTX p = new NewPhongKTX();
        List<NewPhongKTX> listPhongKTX = p.docPhongKTXFile("PhongKTX.txt");

        List<NewPhongKTX> dsSV = p.docPhongKTXFile(tt);
        // Tìm phòng và cập nhật số lượng sinh viên hiện tại
        for (NewPhongKTX p1 : listPhongKTX) {
            if (p1.getTinhTrang().equalsIgnoreCase(tt)) {
                d++;
            }
        }
        return d;
    }

    public boolean checkMaP(String maP, List<NewPhongKTX> list) {
        for (NewPhongKTX p1 : list) {
            if (p1.getMaPhong().equals(maP)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTinhTrang(String maP, List<NewPhongKTX> list) {
        for (NewPhongKTX p1 : list) {
            if (p1.getMaPhong().equals(maP) && p1.getTinhTrang().equalsIgnoreCase("hết chỗ")) {
                return true;
            }
        }
        return false;
    }
}
