/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12rmi_bai1;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Pham Tuan
 */
public interface Calculator extends Remote {
// Khai báo phương thức tính bình phương
public double square(double a) throws RemoteException;
 
}
