/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_bai6;

import static java.lang.System.in;

/**
 *
 * @author Pham Tuan
 */
public class KhachHangViet extends KhachHang{
     private int LoaiKH, DinhMuc;
public KhachHangViet()
{
super();
this.LoaiKH=0;
this.DinhMuc=0;
}
public KhachHangViet(int ma, double dgia, String ngay, String hoten, int sl, 
double ttien, int loai, int dm)
{
super(ma, dgia, ngay, hoten, sl, ttien);
this.LoaiKH = loai;
this.DinhMuc = dm;
}
public int getLoaiKH() {
return LoaiKH;
}
public void setLoaiKH(int loaiKH) {
LoaiKH = loaiKH;
}
public int getDinhMuc() {
return DinhMuc;
}
public void setDinhMuc(int dinhMuc) {
DinhMuc = dinhMuc;
}
public void nhap()
{
super.nhap();
    System.out.println("loai khach hang(1=SinhHoat,2=KinhDoanh,3=SanXuat)");
LoaiKH = in.nextInt();
System.out.println("Dinh Muc: ");
DinhMuc = in.nextInt();
}
public double TTien()
{
if(SoLuong<=DinhMuc)
return this.ThanhTien=this.DonGia*this.SoLuong;
else
return this.ThanhTien=this.DinhMuc*this.DonGia+(this.SoLuong-this.DinhMuc)*this.DonGia*2.5;
}
public String toString() 
{
String temp;
if(LoaiKH==1)
temp="Sinh Hoat";
else if(LoaiKH==2)
temp="Kinh Doanh";
else
temp="San Xuat";
return "Khach Hang Viet: " + super.toString() + ", LoaiKH: " + temp 
+ ", Dinh Muc: " + DinhMuc + ", Thanh Tien: " + ThanhTien;
}

}
