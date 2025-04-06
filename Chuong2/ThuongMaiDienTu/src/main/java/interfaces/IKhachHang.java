package interfaces;

import models.SanPham;
import services.CuaHangService;

import java.util.List;

public interface IKhachHang {
    void xemGioHang(List<SanPham> danhSachGioHang);
    void themVaoGioHang(List<SanPham> danhSachGioHang, List<SanPham> danhSachHang, int ID, int sl);
    void xoaGioHang(List<SanPham> danhSachGioHang, int ID);
    void muaHang(List<SanPham> danhSachGioHang, CuaHangService cuaHangService);
}
