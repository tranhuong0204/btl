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

    //static final String FILE_PATH = "KiTucXa.txt";

   // public static void luuFile(/*List<PhongKTX> list*/) {
        //String txt1 = "SV4, Vũ Đình Duy, KTPM, 30/01/2003, Nam";
//         List<PhongKTX> list = new ArrayList<>();
//         list.add(new PhongKTX("101", "101", 2, 6, 3, "còn chỗ", 1));
//        list.add(new PhongKTX("102", "102", 1, 6, 4, "còn chỗ", 1));
//        try {
//            FileWriter fw = new FileWriter("KyTucXaData.txt");
//            BufferedWriter bw = new BufferedWriter(fw);
//            
//
//            for (PhongKTX p : list) {
//                bw.write(p.toString());
//                bw.newLine();
//            }
//            bw.close();
//            fw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public static List<PhongKTX> getListPhongFromFile() throws FileNotFoundException {
//        List<PhongKTX> dsPhongKTX = new ArrayList<>();
//        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_PATH), "UTF-8"));
//
//            int soPhong = Integer.parseInt(reader.readLine());
//
//            for (int i = 0; i < soPhong; i++) {
//                PhongKTX phongKTX = new PhongKTX();
//                String[] infor = reader.readLine().split(", ");
//
//                phongKTX.setTenPhong(infor[0]);
//                phongKTX.setMaPhong(infor[1]);
//                phongKTX.setLoaiPhong(Integer.parseInt(infor[2]));
//                phongKTX.setSoSVToiDa(Integer.parseInt(infor[3]));
//                phongKTX.setSoSVHienTai(Integer.parseInt(infor[4]));
//                phongKTX.setTinhTrang(infor[5]);
//                phongKTX.setTang(Integer.parseInt(infor[6]));
//
//                List<SinhVienKTX> dsSV = new ArrayList<>();
//
//                for (int j = 0; j < phongKTX.getSoSVHienTai(); j++) {
//                    String[] infoSV = reader.readLine().split(", ");
//
//                    SinhVienKTX sv = new SinhVienKTX(infoSV[0], infoSV[1], infoSV[2], infoSV[3], infoSV[4], infoSV[5], infoSV[6], infoSV[7]);
//
//                    dsSV.add(sv);
//                }
//
//                phongKTX.setDsSV(dsSV);
//
//                dsPhongKTX.add(phongKTX);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File không tìm thấy: " + e.getMessage());
//        } catch (IOException e) {
//            System.out.println("Lỗi khi đọc file: " + e.getMessage());
//        }
//        return dsPhongKTX;
//    }

//    public static PhongKTX getPhongKTXById(List<PhongKTX> ds, String id) {
//        for (PhongKTX phongKTX : ds) {
//            if (phongKTX.getMaPhong().equals(id)) {
//                return phongKTX;
//            }
//        }
//        return null;
//    }

    public void capNhatSoLuongSV( String maPhong) {
        SinhVienDAO sv = new SinhVienDAO();
        NewPhongKTX p = new NewPhongKTX();
        List<NewPhongKTX> listPhongKTX = p.docPhongKTXFile("PhongKTX.txt");
        
        List<SinhVien> dsSV = sv.docFile();
        // Tìm phòng và cập nhật số lượng sinh viên hiện tại
         int d=0;
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
                bw.write(phong.getMaPhong() + "," + phong.getLoaiPhong() + "," + phong.getSoSVToiDa() + "," +
                         phong.getSoSVHienTai() + "," + phong.getTinhTrang());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
//    public static void updateFile(NewPhongKTX phongMoi) throws IOException {
//        NewPhongKTX p = new NewPhongKTX();
//        PhongKTX phongCu = p.timPhongTheoMa(p.docPhongKTXFile("PhongKTX.txt"), phongMoi.getMaPhong());
//        if (phongMoi.toString().equals(phongCu.toString())) {
//            return;
//        }
//
//        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("PhongKTX.txt"), "UTF-8"));
//
//            StringBuilder fileContent = new StringBuilder();
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                fileContent.append(line).append("\n");
//            }
//            reader.close();
//
//            int startIndex = fileContent.indexOf(phongCu.toString());
//
//            if (startIndex != -1) {
//                int endIndex = startIndex + phongCu.toString().length();
//
//                fileContent.replace(startIndex, endIndex, phongMoi.toString());
//            }
//
//            BufferedWriter writer = new BufferedWriter(new FileWriter("PhongKTX.txt"));
//            writer.write(fileContent.toString());
//            writer.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
////    public static void fakeData() {
////        //List<PhongKTX> list = new ArrayList<>();
////        list.add(new PhongKTX("101", "101", 2, 6, 3, "còn chỗ", 1));
////    }
//    static List<PhongKTX> list = new ArrayList<>();
//
//    public static void main(String[] args) throws FileNotFoundException {
//        List<PhongKTX> phongs = getListPhongFromFile();
////        List<PhongKTX> phongKTXList = new ArrayList<>();
////        phongKTXList.add(new PhongKTX("101", "101", 2, 6, 3, "còn chỗ", 1));
////        phongKTXList.add(new PhongKTX("102", "102", 1, 6, 4, "còn chỗ", 1));
//        //fakeData();
//        //luuFile();
//        try {
//            updateFile(phongs.get(3));
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
}
