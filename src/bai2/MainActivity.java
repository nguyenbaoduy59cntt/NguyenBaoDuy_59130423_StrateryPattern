/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Admin
 */
public class MainActivity {
    public static void main(String[] args) {
        GioHang gio1 = new GioHang();
        GioHang gio2 = new GioHang();
        
        HangHoa hh1 = new HangHoa("But", 5000, "But bi mau xanh");
        HangHoa hh2 = new HangHoa("Vo", 7000, "Vo Tan Hiep Phat 5 O li");
        HangHoa hh3 = new HangHoa("May tinh bo tui", 450000, "May tinh casio 570es plus");
        
        gio1.them(hh1);
        gio1.them(hh2);
        gio1.them(hh3);
        
        gio2.them(hh1);
        gio2.them(hh2);
        gio2.them(hh3);
        
        IThanhToan TTOnline = new ThanhToanOnline();
        IThanhToan TTCOD = new ThanhToanCOD();
        
        // gio1
        System.out.println("Gio 1");
        gio1.setHinhThucTT(TTOnline);
        gio1.thanhToan();
        gio1.inDS();
        System.out.println("Tong tien gio hang 1: "+ gio1.tienHang() + "\nTien khach hang phai tra(sau khi giam gia: "+ gio1.thanhToan());
        // gio2
        System.out.println("\n\nGio 2");
        gio2.setHinhThucTT(TTCOD);
        gio2.thanhToan();
        gio2.inDS();
        System.out.println("Tong tien gio hang 2: "+ gio2.tienHang() + "\nTien khach hang phai tra(sau khi giam gia: "+ gio2.thanhToan());
    }
}
