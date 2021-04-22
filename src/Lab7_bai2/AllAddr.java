/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7_bai2;

import java.net.InetAddress;
import java.net.UnknownHostException;
//
/**
 *
 * @author Pham Tuan
 */
public class AllAddr {
    public static void main(String[]args)
 {
 try
 {
 InetAddress[] addr = InetAddress.getAllByName("www.vietnamnet.vn");
 for (int i = 0; i < addr.length; i++)
 {
 System.out.println (addr[i]);//
 }
 }
 catch (UnknownHostException ex)
 {
 System.out.println("Could not find www.vietnamnet.vn");
 }
 }
}
