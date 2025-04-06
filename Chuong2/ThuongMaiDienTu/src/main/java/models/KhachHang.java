package models;

public class KhachHang {
    // Thuộc tính
    private int ID;
    private String hoTen;
    private String soDienThoai;
    private String email;
    private String diaChi;
    private GioHang gioHang;

    //Constructor không tham sô
    public KhachHang(){
        this.ID = 1;
        this.hoTen = "Huynh Thanh Quy";
        this.soDienThoai = "03******";
        this.email = "***@gmail.com";
        this.diaChi = "TPHCM";
        this.gioHang = null;
    }

    //Constructor có tham số
    public KhachHang(int id, String hoTen, String soDienThoai, String email, String diaChi) {
        this.ID = id;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    //Getter
    public final int getID(){
        return ID;
    }

    public final String getHoTen(){
        return hoTen;
    }

    public final String getSoDienThoai(){
        return soDienThoai;
    }

    public final String getEmail(){
        return email;
    }

    public final String getDiaChi(){
        return diaChi;
    }
}
