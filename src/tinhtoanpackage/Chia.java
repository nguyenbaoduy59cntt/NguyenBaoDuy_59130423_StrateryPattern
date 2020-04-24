/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtoanpackage;

/**
 *
 * @author Admin
 */
public class Chia implements ITinh
{
    @Override
    public float tinh(float a, float b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(b==0)
            return 0;
        else
            return a/b;
    }
    
}
