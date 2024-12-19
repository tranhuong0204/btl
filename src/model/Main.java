/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import loginpage.Login;
import loginpage.Home;
/**
 *
 * @author huong
 */

public class Main {

    //PhongktxDAO p = new PhongktxDAO();
    //p.lu
    public static void main(String[] args) {
        NewPhongKTX phongKTX1 = new NewPhongKTX("003", "phòng loại 3", 6, 300000);
        List<NewPhongKTX> list = new ArrayList<>();
        list.add(phongKTX1);
        phongKTX1.ghiDoiTuongPhongVaoFile(list, true);
////NewPhongKTX phongKTX1 = new NewPhongKTX();
//                NewPhongKTX phongKTX2 = new NewPhongKTX("002", "phòng loại 1", 2);
                
//        phongKTX2.ghiDoiTuongPhongVaoFile("PhongKTX.txt");
//        phongKTX1.docPhongKTXFile("PhongKTX.txt");
//        PhongktxDAO p = new PhongktxDAO();
//        p.capNhatSoLuongSV("001");
//        
//        TaiKhoan tk = new TaiKhoan("admin", "123");
//         List<TaiKhoan> list = new ArrayList();
//        list.add(tk);
//        TaiKhoanDAO dao = new TaiKhoanDAO();
//        dao.luuFile(list, true);
//        HoaDon hd = new HoaDon("hd01","001",50,3000,5,20000,100000,30000);
//        List<HoaDon> list = new ArrayList();
//        list.add(hd);
//        HoaDonDAO dao = new HoaDonDAO();
//        dao.luuFile(list, true);
//          
         //new Home().setVisible(true);


    }

}
