package services;
import models.CuaHang;
import models.SanPham;
import java.util.List;


public class CuaHangService extends CuaHang {
    public void hienThiHangHoa(List<SanPham> danhSachHang){
        if(danhSachHang.isEmpty()){
            System.out.println("Danh sach trong");
            return;
        }
        for (SanPham s : danhSachHang){
            System.out.println("ID: " + s.getID());
            System.out.println("Ten San pham: " + s.getTenSP());
            System.out.println("Loai san pham " + s.getLoaiSP());
            System.out.println("Gia san pham " + s.getGiaSP());
            System.out.println("So luong: " + s.getSoLuong());
            System.out.println();
        }
    }

    public void boSungHang(List<SanPham> danhSachHang, int ID, int sl){
        for (SanPham s : danhSachHang){
            if (s.getID() == ID){
                s.setSoLuong(s.getSoLuong() + sl);
                break;
            }
            else {
                System.out.println("Khong tim thay ID");
                return;
            }
        }
        setDanhSachHang(danhSachHang);
        System.out.println("Bo sung hang thanh cong");
    }

    public void themHang(List<SanPham> danhSachHang, SanPham sanPham){
        for (SanPham s : danhSachHang){
            if (sanPham.getID() == s.getID()){
                System.out.println("Khong the them san pham do trung ID");
                return;
            }
            if (sanPham.getTenSP().equals(s.getTenSP())){
                System.out.println("Khong the them san pham do trung ten");
                return;
            }
            if (sanPham.getGiaSP() <= 0){
                System.out.println("Gia san pham khong hop le");
                return;
            }
            if (sanPham.getSoLuong() <= 0) {
                System.out.println("So luong khong hop le");
                return;
            }
        }
        danhSachHang.add(sanPham);
        setDanhSachHang(danhSachHang);
        System.out.println("Them hang thanh cong");
    }

    public void xoaHang(List<SanPham> danhSachHang, int ID){
        for (SanPham s : danhSachHang){
            if (s.getID() == ID){
                danhSachHang.remove(s);
                break;
            }
            else {
                System.out.println("Khong tim thay ID");
                return;
            }
        }
        setDanhSachHang(danhSachHang);
        System.out.println("Xoa hang thanh cong");
    }

    public void banHang(List<SanPham> danhSachGioHang){
        for (SanPham s : danhSachGioHang){
            giamSoLuong(s.getID(), s.getSoLuong());
        }
        System.out.println("ban hang thanh cong");
    }
}
