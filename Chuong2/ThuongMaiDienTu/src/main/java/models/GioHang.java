package models;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<SanPham> danhSachGioHang = new ArrayList<>();

    public List<SanPham> getDanhSachGioHang() {
        return danhSachGioHang;
    }

    protected void setDanhSachGioHang(List<SanPham> danhSachGioHang){
        this.danhSachGioHang = danhSachGioHang;
    }
}
