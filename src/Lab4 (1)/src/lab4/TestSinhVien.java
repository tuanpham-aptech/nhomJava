
package lab4;

public class TestSinhVien{

    public static void main(String[] args) {
    DanhSachSinhVien qlsv=new DanhSachSinhVien();
    Sinhvien teo=new Sinhvien();
    teo.setMasv("113");
    teo.setTensv("Nguyễn Văn Tèo");
    qlsv.addSinhVien(teo);
    teo.setDiachi("Yên bái");
    teo.setLop("MẠNG MÁY TÍNH 12A1HN ");
    Sinhvien ty=new Sinhvien();
    ty.setMasv("114");
    ty.setTensv("Nguyễn Thị tý");
    
    ty.setDiachi("Hà nội ");
    ty.setLop("Tin 12a1");
    Sinhvien anh = new Sinhvien();
    anh.setMasv("115");
    ty.setTensv("Hoàng diệu hương");
    ty.setDiachi("Hà nội ");
    ty.setLop("Tin 12a1");
    qlsv.addSinhVien(ty);
    qlsv.sort();
    System.out.println(qlsv);
    }
}
