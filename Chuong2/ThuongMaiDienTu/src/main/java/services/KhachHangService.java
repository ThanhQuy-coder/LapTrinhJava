package services;

import models.KhachHang;
import models.SanPham;

import java.util.List;

public class KhachHangService extends KhachHang {
    private GioHangService gioHangService = new GioHangService();

    public void xemGioHang(List<SanPham> danhSachGioHang){
        gioHangService.hienThiGioHang(danhSachGioHang);
    }

    public void themVaoGioHang(List<SanPham> danhSachGioHang, List<SanPham> danhSachHang, int ID, int sl){
        gioHangService.themHang(danhSachGioHang, danhSachHang, ID, sl);
    }

    public void xoaGioHang(List<SanPham> danhSachGioHang, int ID){
        gioHangService.xoaHang(danhSachGioHang,ID);
    }

    public void muaHang(List<SanPham> danhSachGioHang, CuaHangService cuaHangService){
        System.out.println("Dang mua hang");
        if(danhSachGioHang.isEmpty()){
            System.out.println("Khong gi trong gio hang de mua");
            return;
        }
        // thực hiện việc bán hàng và xóa số lượng hàng hóa hiện tại
        cuaHangService.banHang(gioHangService.getDanhSachGioHang());
        gioHangService.clearGioHang(danhSachGioHang);
    }
}
