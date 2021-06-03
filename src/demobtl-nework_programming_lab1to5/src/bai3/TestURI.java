/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.net.URI;

/**
 *
 * @author pham tuan
 */
public class TestURI {
    public static void main(String[] args) throws Exception{
URI uri = new
URI("https://www.packtpub.com/books/content/support");
displayURI(uri);
}
private static void displayURI(URI uri) {
System.out.println("getAuthority: " + uri.getAuthority());
System.out.println("getScheme: " + uri.getScheme());
System.out.println("getSchemeSpecificPart: "
+ uri.getSchemeSpecificPart());
System.out.println("getHost: " + uri.getHost());
System.out.println("getPath: " + uri.getPath());
System.out.println("getQuery: " + uri.getQuery());
System.out.println("getFragment: " + uri.getFragment());
System.out.println("getUserInfo: " + uri.getUserInfo());
System.out.println("normalize: " + uri.normalize());
}
}
