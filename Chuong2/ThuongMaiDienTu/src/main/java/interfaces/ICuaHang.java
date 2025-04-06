package interfaces;

import models.SanPham;

import java.util.List;

public interface ICuaHang {
    void hienThiHangHoa(List<SanPham> danhSachHang);
    void boSungHang(List<SanPham> danhSachHang, int ID, int sl);
    void themHang(List<SanPham> danhSachHang, SanPham sanPham);
    void xoaHang(List<SanPham> danhSachHang, int ID);
    void banHang(List<SanPham> danhSachGioHang);
}
