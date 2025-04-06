package interfaces;

import models.SanPham;

import java.util.List;

public interface IGioHang {
    void hienThiGioHang(List<SanPham> danhSachGioHang);
    void themHang(List<SanPham> danhSachGioHang, List<SanPham> danhSachHang, int ID, int sl);
    void xoaHang(List<SanPham> danhSachGioHang, int ID);
    void clearGioHang(List<SanPham> danhSachGioHang);
}
