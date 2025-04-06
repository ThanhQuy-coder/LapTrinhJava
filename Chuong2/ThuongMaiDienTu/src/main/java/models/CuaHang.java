package models;

import java.util.ArrayList;
import java.util.List;

public class CuaHang {
    private List<SanPham> danhSachHang = new ArrayList<>();

    public List<SanPham> getDanhSachHang() {
        return danhSachHang;
    }

    public void giamSoLuong(int ID, int soLuong){
        for (SanPham s : danhSachHang){
            if (ID == s.getID()){
                s.setSoLuong(s.getSoLuong() - soLuong);
            }
            else {
                System.out.println("Khong tim thay ID");
                return;
            }
        }
        setDanhSachHang(danhSachHang);
    }

    public void setDanhSachHang(List<SanPham> danhSachHang) {
        this.danhSachHang = danhSachHang;
    }
}
