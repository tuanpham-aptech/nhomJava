/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

import java.util.Observable;

/**
 *
 * @author Pham Tuan
 */
public class BankAccount extends Observable {

    private int balance; //số dư ban đầu

    //Phương thức thiết lập số dư
    public void setBalance(int balance) {
        this.balance = balance;
        setChanged();
        notifyObservers(null);
    }
//Phương thức nạp tiền vào tài khoản

    public void deposit(int amount, BankAccountUser user) {
        log("\n" + user.getName() + " Depositing $" + amount);
        int newBalance = balance + amount;
        balance = balance + amount;
        log(". Balance = " + balance);
        checkFinished(user);
        assert (balance == newBalance);
    }
//Phương thức rút tiền

    public void withdraw(int amount, BankAccountUser user) {
        log("\n" + user.getName() + " Withdrawing $" + amount);
        if (amount > balance) {
            throw new RuntimeException("Amount (" + amount + ") must not be greater than " + balance + ".");
        }
        int newBalance = balance - amount;
        balance = balance - amount;
        log(". Balance = " + balance);
        checkFinished(user);
        assert (balance == newBalance);
    }

    public int getBalance() {
        return balance;
    }

    //Phương thức kiểm tra kết thúc
    private void checkFinished(BankAccountUser user) {
        if (user.isOneMore()) {
            log("\n****\n " + user.getName() + " finished.\\*******");
            user.setFinished(true);
        }
    }

//Phương thức theo dõi tín hiệu từ tài khoản bằng cách gửi đến tất cả các đối tượng đang quan sát.
    private void log(String message) {
        setChanged();
        notifyObservers(message);
    }
}