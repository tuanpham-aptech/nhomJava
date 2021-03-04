/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_bai6;

import java.util.Date;
import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 *
 * @author Pham Tuan
 */
public class KhachHang {
    protected String code;
    protected String name;
    protected int quantity;
    protected double price;
    protected double money;
    protected DateTime date;
    public KhachHang() {
    }

    public KhachHang(String code, String name, int quantity, double price, double money, DateTime date) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.money = money;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    
}
