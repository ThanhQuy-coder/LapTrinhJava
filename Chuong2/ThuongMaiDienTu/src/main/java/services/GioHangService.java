package services;

import models.GioHang;
import models.SanPham;
import java.util.List;

public class GioHangService extends GioHang {

    public void hienThiGioHang(List<SanPham> danhSachGioHang){
        if(danhSachGioHang.isEmpty()){
            System.out.println("Danh sach trong");
            return;
        }
        for (SanPham s : danhSachGioHang){
            System.out.println("ID: " + s.getID());
            System.out.println("Ten San pham: " + s.getTenSP());
            System.out.println("Loai san pham " + s.getLoaiSP());
            System.out.println("Gia san pham " + s.getGiaSP());
            System.out.println("So luong: " + s.getSoLuong());
            System.out.println();
        }
    }

    public void themHang(List<SanPham> danhSachGioHang, List<SanPham> danhSachHang, int ID, int sl){
        for (SanPham s : danhSachHang){
            if(s.getID() == ID){
                if(s.getSoLuong() > 0 && sl <= s.getSoLuong()){
                    SanPham spGioHang = new SanPham(s);
                    spGioHang.setSoLuong(sl);
                    danhSachGioHang.add(spGioHang);
                    break;
                }
                else{
                    System.out.println("SL hang khong du");
                    return;
                }
            }
            else {
                System.out.println("Khong tim thay ID");
                return;
            }
        }
        setDanhSachGioHang(danhSachGioHang);
        System.out.println("Them thanh cong");
    }

    public void xoaHang(List<SanPham> danhSachGioHang, int ID){
        for (SanPham s : danhSachGioHang){
            if(s.getID() == ID){
                danhSachGioHang.remove(s);
                break;
            }
            else {
                System.out.println("Khong tim thay ID");
                return;
            }
        }
        setDanhSachGioHang(danhSachGioHang);
        System.out.println("Xoa thanh cong");
    }

    public void clearGioHang(List<SanPham> danhSachGioHang){
        danhSachGioHang.clear();
    }
}
