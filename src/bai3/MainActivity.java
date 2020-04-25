/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Admin
 */
public class MainActivity {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        QLSV admin = new QLSV();
        
        SinhVien sv1 = new SinhVien("Tran Van Kien", dateFormat.parse("22-03-1997"), 9 );
        SinhVien sv2 = new SinhVien("Le Van Be", dateFormat.parse("11-08-1999"), (float) 8.5);
        SinhVien sv3 = new SinhVien("Nguyen Bao Duy", dateFormat.parse("02-07-1999"), 10);
        SinhVien sv4 = new SinhVien("Pham Thi Yen Linh", dateFormat.parse("19-11-1999"), (float)9.5);
        
        admin.themSV(sv1);
        admin.themSV(sv2);
        admin.themSV(sv3);
        admin.themSV(sv4);
        
        ISoSanh ssTen = new SoSanhTheoTen();
        ISoSanh ssDiem = new SoSanhTheoDiem();
        
        System.out.println("DS so sanh theo ten: ");
        admin.setSoSanh(ssTen);
        admin.sapXep();
        admin.inDS();
        System.out.println("\n\n");
        System.out.println("DS so sanh theo diem");
        admin.setSoSanh(ssDiem);
        admin.sapXep();
        admin.inDS();
    }
}
