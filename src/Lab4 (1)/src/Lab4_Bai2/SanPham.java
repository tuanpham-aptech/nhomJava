
package Lab4_Bai2;

//Xây dựng ứng dụng quản lý sản phẩm (thông tin mỗi sản phẩm gồm tên và giá)

import java.util.Scanner;
import java.util.Collections;

//theo menu sau.
//1. Nhập danh sách sản phẩm từ bàn phím
//2. Xuất danh sách vừa nhập.
//3. Xuất danh sách ngẫu nhiên.
//4. Sắp xếp giảm dần theo giá và xuất giá ra màn hình
//5. Tìm và xóa sản phẩm theo tên nhập từ bàn phím.
//6. Xuất giá trung bình của các sản phẩm
public class SanPham {
    private String name;
    private double price;

    public SanPham(String name, double price) {
        this.name = name;
        this.price = price;
    }

    SanPham() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm :");
        name = sc.nextLine();
        System.out.println("Nhập giá của sản phẩm :");
        price = sc.nextDouble();
    }
    public void xuatthongtin(){
        System.out.println("Tên sản phẩm "+name+"\t"+"Giá sản phẩm "+price);
    }
}
