/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class DanhSachSinhVien {
    // sinh viên đi học TƯƠI MINH YẾN THIỆU YẾN HẰNG MẠNH NGHĨA PHÚ TÙNG NAM HOÀNG TÙNG 
    // QUÝ 2TRƯỜNG TRÌ  QUANG SÁNG ĐỨC  LÊ HOÀNG TOÀN HÙNG HƯNG KHANG NGHĨA THẾ ANH HIẾU TUÂN 
    // SINH VIÊN NGHỈ HỌC LỘC LINH 2 DUY VÂN ANH TUẤN HUẤN NGỌC CÔNG DŨNG 
    private ArrayList<Sinhvien> dssv = new ArrayList<>();
    public boolean ktTrungma(String masv){
        for (Sinhvien sv : dssv) {
            if(sv.getMasv().equalsIgnoreCase(masv)){
                return true;
            } 
        }
        return false;
    }
    public boolean addSinhVien(Sinhvien sv){
        if(ktTrungma(sv.getMasv())){
            return false;
        }
       return dssv.add(sv);
    }
    public Sinhvien findSinhVien1(String masv){
        for (Sinhvien sv : dssv) {
            if(sv.getMasv().equalsIgnoreCase(masv)){
                return sv;
            }
        }
        return null;
    }
    public int findSinhvien2(String masv)
        {
        for(int i=0;i<dssv.size();i++)
        {
        if(dssv.get(i).getMasv().equalsIgnoreCase(masv))
        return i;
        }
        return -1;
        }
    public Sinhvien updateSinhvien(int index,Sinhvien sv)
        {
        return dssv.set(index, sv);
        }
    public void removeSinhvien(String masv)
        {
        Sinhvien sv=findSinhVien1(masv);
        dssv.remove(sv);
        }
    public String toString() {
        return dssv.toString();
        }
    public void sort(){
        Collections.sort(dssv);
    }
}
