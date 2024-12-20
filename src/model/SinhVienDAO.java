/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.SinhVien;

public class SinhVienDAO {

    public int countSinhVienInPhongKTX(String maPhong) {
        try {
            SinhVienDAO dao = new SinhVienDAO();
            List<SinhVien> list = dao.docFile(); // Đọc danh sách sinh viên từ file

            // Lọc các sinh viên có mã phòng khớp và đếm số lượng
            int count = 0;
            for (SinhVien sv : list) {
                if (sv.getMaPhong().equalsIgnoreCase(maPhong)) {
                    count++;
                }
            }

            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Nếu có lỗi, trả về 0
        }
    }

    public void laySVTheoMA(String maPhong, List<SinhVien> listSVMasv) {
        try {
            SinhVienDAO dao = new SinhVienDAO();
            List<SinhVien> list = dao.docFile(); // Đọc danh sách sinh viên từ file
            //List<SinhVien> listSVMasv = new ArrayList<>();
            // Lọc các sinh viên có mã phòng khớp và đếm số lượng
            int count = 0;
            for (SinhVien sv : list) {
                if (sv.getMaPhong().equalsIgnoreCase(maPhong)) {
                    listSVMasv.add(sv);
                }
            }

            //return count;
        } catch (Exception e) {
            e.printStackTrace();
            //e.printStackTrace(); // Nếu có lỗi, trả về 0
        }
    }

    public void luuFile(List<SinhVien> list, boolean t) {
        //String txt1 = "SV4, Vũ Đình Duy, KTPM, 30/01/2003, Nam";
        try {
            FileWriter fw = new FileWriter("SinhVienData.txt", t);
            BufferedWriter bw = new BufferedWriter(fw);
            for (SinhVien sv : list) {
                bw.write(sv.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<SinhVien> docFile() {
        List<SinhVien> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("SinhVienData.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(",");
                // Kiểm tra số lượng phần tử trong mảng txt để tránh lỗi IndexOutOfBounds
                if (txt.length == 8) {
                    list.add(new SinhVien(txt[0], txt[1], txt[2], txt[3], txt[4], txt[5], txt[6], txt[7]));
                } else {
                    System.out.println("Dữ liệu không hợp lệ: " + line); // In ra thông báo nếu dữ liệu không đầy đủ
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Initializing new list.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list; // Trả về danh sách sinh viên
    }

    public boolean suaThanhVien(String MaSV, SinhVien newSV, List<SinhVien> list) {
        SinhVien sv = new SinhVien(MaSV);
        if (!list.contains(sv)) {
            return false;
        }
        list.set(list.indexOf(sv), newSV);
        return true;
    }

    public boolean xoaThanhVien(String MaSV, List<SinhVien> list) {
        SinhVien sv = new SinhVien(MaSV);
        if (!list.contains(sv)) {
            return false;
        } else {
            list.remove(sv);
            return true;
        }

    }

    public void xoaThanhVien(int i, List<SinhVien> dssv) {
        dssv.remove(i);

    }

    public SinhVien getSVbyMaSV(String masv, List<SinhVien> list) {
        SinhVien temp = new SinhVien(masv);

        // Duyệt qua danh sách và tìm sinh viên tương ứng
        for (SinhVien sv : list) {
            if (sv.getMasv().equals(masv)) {
                return sv;  // Trả về sinh viên tìm được
            }
        }
        return null;
    }

    public boolean checkMaSV(String masv, List<SinhVien> list) {
        for (SinhVien sv1 : list) {
            if (sv1.getMasv().trim().equalsIgnoreCase(masv.trim())) {
                return true;
            }
        }
        
        return false;
    }

}
