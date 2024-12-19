/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huong
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewPhongKTX implements Serializable {

    private String maPhong;
    private String loaiPhong;
    private int soSVToiDa;
    private int soSVHienTai;
    private String tinhTrang;
    private int giaPhong;
    private List<SinhVien> dsSV;

//    public NewPhongKTX(String maPhong, String loaiPhong, int soSVToiDa) {
//        this.maPhong = maPhong;
//        this.loaiPhong = loaiPhong;
//        this.soSVToiDa = soSVToiDa;
//        this.soSVHienTai = 0;
//        //this.tinhTrang = "Còn chỗ";
//        //this.dsSV = new ArrayList<>();
//    }
    public NewPhongKTX(String maPhong, String loaiPhong, int soSVToiDa, int soSVHienTai, String tinhTrang, int giaPhong) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.soSVToiDa = soSVToiDa;
        this.soSVHienTai = soSVHienTai;
        this.tinhTrang = tinhTrang;
        this.giaPhong = giaPhong;
    }

    public NewPhongKTX(String maPhong, String loaiPhong, int soSVToiDa, int giaPhong) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.soSVToiDa = soSVToiDa;
        this.soSVHienTai = tinhsosvhientai();
        //this.tinhTrang = capNhatTrangThai();
        capNhatTrangThai();
        this.giaPhong = giaPhong;
        //setGiaPhong();
        this.dsSV = new ArrayList<>();
    }

//    public NewPhongKTX(int giaPhong, String loaiPhong) {
//        this.giaPhong = setGiaPhong();
//    }
//    public NewPhongKTX(String maPhong, String loaiPhong, int soSVToiDa) {
//        this.maPhong = maPhong;
//        this.loaiPhong = loaiPhong;
//        this.soSVToiDa = soSVToiDa;
//        this.soSVHienTai = tinhsosvhientai();
//        capNhatTrangThai();
//        //this.tinhTrang = "Còn chỗ";
//        this.dsSV = new ArrayList<>();
//    }
    public NewPhongKTX() {
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong() {
        if (loaiPhong.equalsIgnoreCase("phòng loại 1")) {
            giaPhong = 1000000;
        }
        if (loaiPhong.equalsIgnoreCase("phòng loại 2")) {
            giaPhong = 800000;
        }
        if (loaiPhong.equalsIgnoreCase("phòng loại 3")) {
            giaPhong = 600000;
        }
        //return giaPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoSVToiDa() {
        return soSVToiDa;
    }

    public void setSoSVHienTai(int soSVHienTai) {
        this.soSVHienTai = soSVHienTai;
    }

    public void setSoSVToiDa(int soSVToiDa) {
        this.soSVToiDa = soSVToiDa;
    }

    public int getSoSVHienTai() {
        return soSVHienTai;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public int tinhsosvhientai() {
        SinhVienDAO sv = new SinhVienDAO();
        int soLuong = sv.countSinhVienInPhongKTX(this.maPhong);
        this.soSVHienTai = soLuong;
        return soSVHienTai;
    }

    // Thêm sinh viên vào phòng
    public void themSinhVien(SinhVien sv) {
        if (soSVHienTai < soSVToiDa) {
            //dsSV.add(sv);
            //soSVHienTai++;
            this.soSVHienTai = this.dsSV.size();

            capNhatTrangThai();
        } else {
            System.out.println("Phòng đã đầy!");
        }
    }


    public void xoaSinhVien(String maSV) {
        // Tìm và xóa sinh viên có mã maSV trong danh sách
        boolean found = false;
        for (SinhVien sv : dsSV) {
            if (sv.getMasv().equals(maSV)) {
                dsSV.remove(sv);
                soSVHienTai--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã: " + maSV);
        }
        capNhatTrangThai(); 
    }

    // Cập nhật tình trạng phòng (Còn chỗ hay hết chỗ)
    protected void capNhatTrangThai() {
        if (soSVHienTai == soSVToiDa) {
            tinhTrang = "Hết chỗ";
        } //        else if (soSVHienTai > soSVToiDa){
        //            tinhTrang = "Hết chỗ";
        //        }
        else if (soSVHienTai < soSVToiDa) {
            tinhTrang = "Còn chỗ";
        }
    }

    // Hiển thị danh sách sinh viên trong phòng
    public void hienThiDanhSachSV() {
        System.out.println("Danh sách sinh viên trong phòng " + maPhong + ":");
        for (SinhVien sv : dsSV) {
            System.out.println(sv);
        }
    }

//    public void dsSVPhong(){
//        SinhVienDAO sv = new SinhVienDAO();
//        sv.laySVTheoMA(maPhong,this.dsSV);
//        //for(SinhVienDAO sv : dsSV)
//    }
    public void ghiDoiTuongPhongVaoFile(/*String fileName*/ List<NewPhongKTX> list, boolean t) {

        try {
            FileWriter fw = new FileWriter("PhongKTX.txt", t);
            BufferedWriter bw = new BufferedWriter(fw);
            for (NewPhongKTX p : list) {
                bw.write(p.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<NewPhongKTX> docPhongKTXFile(String fileName) {
        List<NewPhongKTX> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(",");
                if (txt.length == 6) {
                    String maPhong = txt[0].trim();
                    

                    String loaiPhong = txt[1].trim();
                    int soSVToiDa = Integer.parseInt(txt[2].trim());
                    int soSVHienTai = Integer.parseInt(txt[3].trim());
                    String tinhTrang = txt[4].trim();
                    int giaPhong = Integer.parseInt(txt[5].trim());
                    list.add(new NewPhongKTX(maPhong, loaiPhong, soSVToiDa, soSVHienTai, tinhTrang, giaPhong));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

//    
    public NewPhongKTX timPhongTheoMa(String maPhong, List<NewPhongKTX> list) {
        for (NewPhongKTX phong : list) {
            if (phong.getMaPhong().equalsIgnoreCase(maPhong)) {
                return phong;
            }
        }
        return null;  
    }

    public NewPhongKTX timPhongTheoMa(List<NewPhongKTX> list) {
        for (NewPhongKTX phong : list) {
            if (phong.getMaPhong().equalsIgnoreCase(maPhong)) {
                return phong;
            }
        }
        return null;  
    }

    public void capNhatSoLuongSV(String maPhong) {
        SinhVienDAO sv = new SinhVienDAO();
        NewPhongKTX p = new NewPhongKTX();
        List<NewPhongKTX> listPhongKTX = p.docPhongKTXFile("PhongKTX.txt");

        List<SinhVien> dsSV = sv.docFile();
        int d = 0;
        for (SinhVien sv1 : dsSV) {
            if (sv1.getMaPhong().equalsIgnoreCase(maPhong)) {
                d++;
            }
        }

        for (NewPhongKTX phong : listPhongKTX) {
            if (phong.getMaPhong().equalsIgnoreCase(maPhong)) {
                phong.setSoSVHienTai(d);
                phong.capNhatTrangThai(); // Nếu có phương thức này để cập nhật trạng thái phòng
                break; // Dừng vòng lặp khi tìm thấy phòng phù hợp
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("PhongKTX.txt"), "UTF-8"))) {
            for (NewPhongKTX phong : listPhongKTX) {
                bw.write(phong.getMaPhong() + "," + phong.getLoaiPhong() + "," + phong.getSoSVToiDa() + ","
                        + phong.getSoSVHienTai() + "," + phong.getTinhTrang() + "," + phong.getGiaPhong());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return maPhong+","+ loaiPhong+ "," + soSVToiDa +","+ soSVHienTai +","+ tinhTrang+","+ giaPhong;
    }
    
    
}
