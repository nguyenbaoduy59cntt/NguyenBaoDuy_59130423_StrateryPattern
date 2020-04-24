/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
public class MainActivity {
     public static void main(String[] args) 
     {
        Context pt = new Context();
        
        pt.setTinhToan(new Cong());
        System.out.println("75 + 12 = "+ pt.tinh(75,12));
        
        pt.setTinhToan(new Tru());
        System.out.println("54 - 78 = "+ pt.tinh(54, 78));
      
    }
}
