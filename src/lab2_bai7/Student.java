/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_bai7;

/**
 *
 * @author Pham Tuan
 */
public class Student extends Person{
    private double mon1;
    private double mon2;
    private String danhgia;

    public Student() {
    }

    public Student(double mon1, double mon2,String danhgia) {
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.danhgia = danhgia;
    }

    public Student(double mon1, double mon2, String name, String address) {
        super(name, address);
        this.mon1 = mon1;
        this.mon2 = mon2;
    }

    public double getMon1() {
        return mon1;
    }

    public void setMon1(double mon1) {
        this.mon1 = mon1;
    }

    public double getMon2() {
        return mon2;
    }

    public void setMon2(double mon2) {
        this.mon2 = mon2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public double diemTB(){
        double diemTB = (this.mon1 *this.mon2)/2;
        return diemTB;
    }
}
