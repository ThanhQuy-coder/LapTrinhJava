package controllers;

import interfaces.IKhachHang;
import models.SanPham;
import services.CuaHangService;
import services.KhachHangService;

import java.util.List;

public class KhachHangController implements IKhachHang {
    KhachHangService khachHangService = new KhachHangService();

    @Override
    public void xemGioHang(List<SanPham> danhSachGioHang) {
        khachHangService.xemGioHang(danhSachGioHang);
    }

    @Override
    public void themVaoGioHang(List<SanPham> danhSachGioHang, List<SanPham> danhSachHang, int ID, int sl) {
        khachHangService.themVaoGioHang(danhSachGioHang,danhSachHang, ID, sl);
    }

    @Override
    public void xoaGioHang(List<SanPham> danhSachGioHang, int ID) {
        khachHangService.xoaGioHang(danhSachGioHang, ID);
    }

    @Override
    public void muaHang(List<SanPham> danhSachGioHang, CuaHangService cuaHangService) {
        khachHangService.muaHang(danhSachGioHang, cuaHangService);
    }
}
