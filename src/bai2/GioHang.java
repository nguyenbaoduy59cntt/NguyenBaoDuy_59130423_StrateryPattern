/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GioHang
{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHangHoa = new ArrayList<>();


   
 //
    public void them(HangHoa hH)
    {
        dsHangHoa.add(hH);
    }
 //   
    public int tienHang(){
        int S = 0;
        for(int i = 0; i < dsHangHoa.size(); i++)
            S+=dsHangHoa.get(i).getGia();
        return S;
    }
    
     public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public double thanhToan() {
        return hinhThucTT.thanhToan(tienHang());
    }
    
    public void inDS()
    {
        for(int i = 0; i < dsHangHoa.size(); i++)
        {
            System.out.println( "Ten hang hoa: "+ dsHangHoa.get(i).getTenHH()+"\n"
                                +"Mo ta: "+dsHangHoa.get(i).getMoTa()+"\n"
                                +"Gia: "+ dsHangHoa.get(i).getGia()+"\n");
                                /*+"Tong tien: "+tienHang() +"\n"
                                +"So tien phai tra(sau khi giam gia): "+thanhToan());*/
            }
    }
}
