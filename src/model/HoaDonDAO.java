/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huong
 */
public class HoaDonDAO {

    public void luuFile(List<HoaDon> list, boolean t) {
        //String txt1 = "SV4, Vũ Đình Duy, KTPM, 30/01/2003, Nam";
        try {
            FileWriter fw = new FileWriter("HoaDonData.txt", t);
            BufferedWriter bw = new BufferedWriter(fw);
            for (HoaDon hd : list) {
                bw.write(hd.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<HoaDon> docFile() {
        List<HoaDon> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("HoaDonData.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(",");
                // Kiểm tra số lượng phần tử trong mảng txt để tránh lỗi IndexOutOfBounds
                if (txt.length == 10) {
                    String maHD = txt[0].trim();
                    String maPhong = txt[1].trim();
                    int tienP = Integer.parseInt(txt[2].trim());
                    int soDien = Integer.parseInt(txt[3].trim());
                    int donGiaDien = Integer.parseInt(txt[4].trim());
                    int soNuoc = Integer.parseInt(txt[5].trim());
                    int doGiaNuoc = Integer.parseInt(txt[6].trim());
                    int tienWifi = Integer.parseInt(txt[7].trim());
                    int tienVS = Integer.parseInt(txt[8].trim());
                    int tong = Integer.parseInt(txt[9].trim());

                    // Tạo đối tượng PhongKTX và thêm vào danh sách
                    list.add(new HoaDon(maHD, maPhong, tienP, soDien, donGiaDien, soNuoc, doGiaNuoc, tienWifi, tienVS, tong));
                } else {
                    System.out.println("Dữ liệu không hợp lệ: " + line); // In ra thông báo nếu dữ liệu không đầy đủ
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Initializing new list.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public HoaDon timHDTheoMaHD(String maHD, List<HoaDon> list) {
        for (HoaDon hd : list) {
            if (hd.getMaHD().equalsIgnoreCase(maHD)) {
                return hd;
            }
        }
        return null;  // Trả về null nếu không tìm thấy 
    }

    public boolean suaHD(String maHD, List<HoaDon> list, HoaDon newHD) {
        
        for (int i = 0; i < list.size(); i++) {
            HoaDon hd = list.get(i);
            if (hd.getMaHD().equalsIgnoreCase(maHD)) {
                list.set(i, newHD); // Thay thế hd cũ bằng tài khoản mới
                return true;
            }
        }
        return false;
    }
    
    public boolean xoaHD(String maHD, List<HoaDon> list){
        for (int i = 0; i < list.size(); i++) {
        HoaDon hd = list.get(i);
        if (hd.getMaHD().equalsIgnoreCase(maHD)) {
            list.remove( hd); // Thay thế hd cũ bằng tài khoản mới
            return true;
        }
    }
    return false;
    }
    
    public boolean checkMaHD(String mahd, List<HoaDon> list) {
        for (HoaDon hd : list) {
            if (hd.getMaHD().equals(mahd)) {
                return true;
            }
        }
        return false;
    }
}
