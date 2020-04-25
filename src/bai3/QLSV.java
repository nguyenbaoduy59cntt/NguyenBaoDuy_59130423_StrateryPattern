/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class QLSV {
    ISoSanh soSanh;
    
    ArrayList<SinhVien> dsSV = new ArrayList<>();

    public QLSV(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }

    QLSV() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;   
    }

    public void themSV(SinhVien sv)
    {
        dsSV.add(sv);
    }
    
    public void sapXep()
    {
        Collections.sort(dsSV,soSanh::soSanh);
    }
    
    public void inDS()
    {
        for(int i = 0; i < dsSV.size(); i++)
            dsSV.get(i).hienthiTT();
    }

}
