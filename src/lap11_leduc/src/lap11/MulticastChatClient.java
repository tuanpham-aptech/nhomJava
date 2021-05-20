/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author ASUS
 */
public class MulticastChatClient {
    public static void main(String args[]) throws Exception {
 int portnumber = 5000;
 if (args.length >= 1) {
 portnumber = Integer.parseInt(args[0]);
 
 }
    MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
 InetAddress group = InetAddress.getByName("225.4.5.6");
 // Tham gia nhóm đa hướng
 chatMulticastSocket.joinGroup(group);
 String msg = "";
 System.out.println("Type a message for the Server:");
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 msg = br.readLine();
DatagramPacket data = new DatagramPacket(msg.getBytes(), 0,
 msg.length(), group, portnumber);
 chatMulticastSocket.send(data);
         chatMulticastSocket.close();}}