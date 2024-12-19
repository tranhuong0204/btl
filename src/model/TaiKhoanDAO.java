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
public class TaiKhoanDAO {
    public void luuFile(List<TaiKhoan> list, boolean t) {
        //String txt1 = "SV4, Vũ Đình Duy, KTPM, 30/01/2003, Nam";
        try {
            FileWriter fw = new FileWriter("TAiKhoanData.txt", t);
            BufferedWriter bw = new BufferedWriter(fw);
            for (TaiKhoan tk : list) {
                bw.write(tk.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<TaiKhoan> docFile() {
        List<TaiKhoan> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("TAiKhoanData.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] txt = line.split(",");
                // Kiểm tra số lượng phần tử trong mảng txt để tránh lỗi IndexOutOfBounds
                if (txt.length == 2) {
                    list.add(new TaiKhoan(txt[0], txt[1]));
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
    
    public boolean suaTaiKhoan(String tenTK, List<TaiKhoan> list, TaiKhoan newTK){
        //TaiKhoan tk = new TaiKhoan();
        //TaiKhoanDAO dao = new TaiKhoanDAO
        //List<TaiKhoan> list = this.docFile();
        
//        for(TaiKhoan tk : list){
//            if(tk.getTenTaiKhoan().equalsIgnoreCase(tenTK));{
//                list.set(list.indexOf(tk), newTK);
//                return true;
//            }
//        }
//        return false;
        for (int i = 0; i < list.size(); i++) {
        TaiKhoan tk = list.get(i);
        if (tk.getTenTaiKhoan().equalsIgnoreCase(tenTK)) {
            list.set(i, newTK); // Thay thế tài khoản cũ bằng tài khoản mới
            return true;
        }
    }
    return false;
    }
    
    public TaiKhoan getTKbyMaTK(String maTK, List<TaiKhoan> list) {
        TaiKhoan temp = new TaiKhoan(maTK);

        // Duyệt qua danh sách và tìm sinh viên tương ứng
        for (TaiKhoan tk : list) {
            if (tk.getTenTaiKhoan().equals(maTK)) {
                return tk;  // Trả về sinh viên tìm được
            }
        }
        return null;
    }
    
    public boolean xoaTaiKhoan(String tenTK, List<TaiKhoan> list){
        //TaiKhoan tk = new TaiKhoan();
        //TaiKhoanDAO dao = new TaiKhoanDAO
        //List<TaiKhoan> list = this.docFile();
        
//        for(TaiKhoan tk : list){
//            if(tk.getTenTaiKhoan().equalsIgnoreCase(tenTK));{
//                list.set(list.indexOf(tk), newTK);
//                return true;
//            }
//        }
//        return false;
        for (int i = 0; i < list.size(); i++) {
        TaiKhoan tk = list.get(i);
        if (tk.getTenTaiKhoan().equalsIgnoreCase(tenTK)) {
            list.remove( tk); // Thay thế tài khoản cũ bằng tài khoản mới
            return true;
        }
    }
    return false;
    }
}