package controllers;

import interfaces.ICuaHang;
import models.SanPham;
import services.CuaHangService;

import java.util.List;

public class CuaHangController implements ICuaHang {
    CuaHangService cuaHangService = new CuaHangService();

    @Override
    public void hienThiHangHoa(List<SanPham> danhSachHang) {
        cuaHangService.hienThiHangHoa(danhSachHang);
    }

    @Override
    public void boSungHang(List<SanPham> danhSachHang, int ID, int sl) {
        cuaHangService.boSungHang(danhSachHang, ID, sl);
    }

    @Override
    public void themHang(List<SanPham> danhSachHang, SanPham sanPham) {
        cuaHangService.themHang(danhSachHang, sanPham);
    }

    @Override
    public void xoaHang(List<SanPham> danhSachHang, int ID) {
        cuaHangService.xoaHang(danhSachHang, ID);
    }

    @Override
    public void banHang(List<SanPham> danhSachGioHang) {
        cuaHangService.banHang(danhSachGioHang);
    }
}
