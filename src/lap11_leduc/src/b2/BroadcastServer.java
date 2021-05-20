/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;
import java.util.Date;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author ASUS
 */
public class BroadcastServer {
    public static final int PORT = 1200;
public static void main(String args[]) throws Exception{
    MulticastSocket socket;
   DatagramPacket packet;
   InetAddress address;
  address = InetAddress.getByName(args[0]);
    socket = new MulticastSocket();
    socket.joinGroup(address);
byte[] data = null;
for(;;){
    Thread.sleep(1000);
System.out.println("Sending ");
String str = (new Date()).toString();
data = str.getBytes();
 packet = new DatagramPacket(data,str.length(),address,PORT);
// Sends the packet
socket.send(packet);
} // for
} // main
}
