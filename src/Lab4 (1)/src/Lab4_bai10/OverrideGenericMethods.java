/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4_bai10;

/**
 *
 * @author Pham Tuan
 */
public class OverrideGenericMethods {
    public static void main(String[] arg)
    {
    Gen<Integer> Intobject = new Gen<Integer>(88);
     Gen2<Integer> InObject;
        InObject = new Gen2<Integer>(99);
    Intobject.getObject();
     InObject.getObject();
    }
}
