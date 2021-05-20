/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
/**
 *
 * @author ASUS
 */
public class MulticastImageSender {
    private static final int TIMEOUT = 3000;
 private static final int MAXFILELEN = 65000;
    public static void main(String[] args)throws IOException,IndexOutOfBoundsException{
 if (args.length < 4) // Test for correct # of args
 throw new IllegalArgumentException("Parameter(s): <Multicast Address> <Port> <TTL> <Image File>[<Image File>...]");
 InetAddress multicastAddress = InetAddress.getByName(args[0]);
 int destPort = Integer.parseInt(args[1]);
 int TTL = Integer.parseInt(args[2]);
 // Create a UDP multicast socket with any available local port
 MulticastSocket socket = new MulticastSocket();
 socket.setTimeToLive(TTL); 
 for (int i=3; i < args.length; i++)
 {
 RandomAccessFile file = new RandomAccessFile(args[i], "r");
 if (file.length() > MAXFILELEN)
 throw new IOException("File too big");
 byte [] fileBuffer = new byte[(int) file.length()];
file.read(fileBuffer);
 file.close();
 DatagramPacket sendPacket = new DatagramPacket(fileBuffer,
 fileBuffer.length, multicastAddress, destPort);
socket.send(sendPacket); // Send the echo string
 System.out.println("Sent " + args[i] + " to " +sendPacket.getAddress().getHostAddress() + " on port " + sendPacket.getPort());
if (!multicastAddress.isMulticastAddress())
    throw new IllegalArgumentException("Not a multicast address");
 
}}}
