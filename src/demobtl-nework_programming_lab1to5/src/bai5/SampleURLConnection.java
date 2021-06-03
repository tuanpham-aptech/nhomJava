/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author pham tuan
 */
public class SampleURLConnection {
    public static void main(String[] args) throws Exception{
URL url=new URL("http://localhost");
URLConnection con=url.openConnection();
con.setDoInput(true);
con.setDoOutput(true);
con.connect();
System.out.println("length:"+con.getContentLength());
InputStream is = con.getInputStream();
byte []buf=new byte[512];
while(is.available()!=-0) {
int l=is.read(buf);
System.out.println(new String(buf,0,l));
}
is.close();
}

}
