package controllers;

import interfaces.IGioHang;
import models.SanPham;
import services.GioHangService;

import java.util.List;

public class GioHangController implements IGioHang {
    GioHangService gioHangService = new GioHangService();

    @Override
    public void hienThiGioHang(List<SanPham> danhSachGioHang) {
        gioHangService.hienThiGioHang(danhSachGioHang);
    }

    @Override
    public void themHang(List<SanPham> danhSachGioHang, List<SanPham> danhSachHang, int ID, int sl) {
        gioHangService.themHang(danhSachGioHang, danhSachHang, ID, sl);
    }

    @Override
    public void xoaHang(List<SanPham> danhSachGioHang, int ID) {
        gioHangService.xoaHang(danhSachGioHang, ID);
    }

    @Override
    public void clearGioHang(List<SanPham> danhSachGioHang) {
        gioHangService.clearGioHang(danhSachGioHang);
    }
}
